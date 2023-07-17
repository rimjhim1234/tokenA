package com.tech2.cart;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.me.MyCartDraft;
import com.commercetools.api.models.me.MyLineItemDraft;
import com.tech2.Client2;
import com.tech2.cart.CartData;
import io.vrap.rmf.base.client.AuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    ProjectApiRoot apiRoot= Client2.createApiClient();
    @Autowired
    AuthenticationToken token;

//    com.tech2.cart.CartData.CartDataProvider obc = new com.tech2.cart.CartData.CartDataProvider();
    public Cart createcart(CartData cartData) {
        MyCartDraft myCartDraft = MyCartDraft
                .builder()
                .currency(cartData.getCurrency())
                .taxMode(cartData.getTaxMode())
                .lineItems(MyLineItemDraft.builder().productId("317da306-2a89-4adb-a127-3421a7b980a5").build())
                .build();
        return apiRoot.me().carts().post(myCartDraft).addHeader("Authorization", "Bearer " + token.getAccessToken()).executeBlocking().getBody();

//     return obc.createcart(myCartDraft);
    }
}
