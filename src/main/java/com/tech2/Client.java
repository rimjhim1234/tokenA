//package com.tech2;
//
//import com.commercetools.api.client.ProjectApiRoot;
//import com.commercetools.api.defaultconfig.ApiRootBuilder;
//import com.commercetools.api.defaultconfig.ServiceRegion;
//import io.vrap.rmf.base.client.oauth2.ClientCredentials;
//import org.springframework.context.annotation.Bean;
//
//public class Client {
//
//    @Bean
//    public static ProjectApiRoot createApiClient() {
//        final ProjectApiRoot apiRoot = ApiRootBuilder.of()
//                .defaultClient(ClientCredentials.of()
//                                .withClientId("fMfl8pRtS0EmE5F-XoFMPsUN")
//                                .withClientSecret("OmxwNkd4SbT_YnOI-y7SsuQTW7DJhX3Z")
//                                .build(),
//                        ServiceRegion.GCP_AUSTRALIA_SOUTHEAST1)
//                .build("hybris-test");
//        return apiRoot;
//    }
//}
//


