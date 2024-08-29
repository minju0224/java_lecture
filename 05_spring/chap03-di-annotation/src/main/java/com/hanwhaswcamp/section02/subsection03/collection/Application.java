package com.hanwhaswcamp.section02.subsection03.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("com.hanwhaswcamp.section02");

    PokemonService pokemonService = applicationContext.getBean("pokemonServiceCollection", PokemonService.class);
        pokemonService.pokemonAttack();
    }
}
