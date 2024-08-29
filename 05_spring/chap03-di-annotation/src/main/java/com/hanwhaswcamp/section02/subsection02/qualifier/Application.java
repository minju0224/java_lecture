package com.hanwhaswcamp.section02.subsection02.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("com.hanwhaswcamp.section02");

    PokemonService pokemonService = applicationContext.getBean("pokemonServiceQualifier", PokemonService.class);
        pokemonService.pokemonAttack();
    }
}
