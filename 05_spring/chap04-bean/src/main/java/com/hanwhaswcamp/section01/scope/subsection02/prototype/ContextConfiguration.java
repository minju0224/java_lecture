package com.hanwhaswcamp.section01.scope.subsection01.singleton;

import com.hanwhaswcamp.common.Beverage;
import com.hanwhaswcamp.common.Bread;
import com.hanwhaswcamp.common.Product;
import com.hanwhaswcamp.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product crapBread() {
        return new Bread("붕어빵",1000, new java.util.Date());
    }

    @Bean
    public Product milk() {
        return new Beverage("딸기우유",1500,500);
    }

    @Bean
    public Product water() {
        return new Beverage("지리산암반수",3000,1000);
    }

    @Bean
    public ShoppingCart cart(){
        return new ShoppingCart();
    }
}
