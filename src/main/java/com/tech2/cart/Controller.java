package com.tech2.cart;

import com.commercetools.api.models.cart.Cart;
import com.tech2.cart.CartService;
import com.tech2.cart.CartData;
import io.vrap.rmf.base.client.AuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    AuthenticationToken AccessToken;
   @Autowired
   CartService cartService;
    @GetMapping("/token")
    public AuthenticationToken A() {

        return AccessToken;
    }
  //  @GetMapping("/me")
//    public OrderPagedQueryResponse D(){
//       return apiRoot.me().orders().get().executeBlocking().getBody();
//    }
    @PostMapping("/CART")
   public Cart createcart(@RequestBody CartData cartData) {
       return cartService.createcart(cartData);}
}


