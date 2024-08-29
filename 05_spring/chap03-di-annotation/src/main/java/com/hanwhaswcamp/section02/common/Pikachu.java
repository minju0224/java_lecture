package com.hanwhaswcamp.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Pikachu implements Pokemon {
    @Override
    public void attack() {
        System.out.println("피카츄 백만볼트⚡");
    }
}
