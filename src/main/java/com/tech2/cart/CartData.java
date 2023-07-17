package com.tech2.cart;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.TaxMode;
import com.tech2.Client2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartData {
    public String currency;

    public TaxMode taxMode;

    @Configuration
    public static class CartDataProvider {

        ProjectApiRoot apiRoot= Client2.createApiClient();
    //    public Cart createcart(MyCartDraft  myCartDraft) {
    //    }
    }
}
