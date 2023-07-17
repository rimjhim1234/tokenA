package com.tech2;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.http.okhttp4.CtOkHttp4Client;
import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.GlobalCustomerPasswordTokenSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Configuration
public class Client2 {

    @Bean
    public static AuthenticationToken getLoggedInToken() {

        VrapHttpClient httpClient = new CtOkHttp4Client(builder -> builder.connectTimeout(Duration.ofSeconds(1)));

        GlobalCustomerPasswordTokenSupplier gc = new GlobalCustomerPasswordTokenSupplier(
                "40B-oYLgZ2XDuBwqV7EEKM0L",
                "udt0aD3zQEyXzwI2fssmBpLjL_OoIfhx",
                "john.doe@example.com",
                "neeraj@18",
                "manage_project:pathak",
                ServiceRegion.GCP_AUSTRALIA_SOUTHEAST1.getPasswordFlowTokenURL("pathak"),
                httpClient

        );
        CompletableFuture<AuthenticationToken> tokenStage = gc.getToken();

        return tokenStage.toCompletableFuture().join();
    }
    @Bean
    public static ProjectApiRoot createApiClient() {
        ProjectApiRoot apiRoot = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_AUSTRALIA_SOUTHEAST1.getApiUrl())
                .build("pathak");
        return apiRoot;

    }

}
