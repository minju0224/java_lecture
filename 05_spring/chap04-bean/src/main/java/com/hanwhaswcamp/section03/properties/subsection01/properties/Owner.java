package com.hanwhaswcamp.section02.initdestroy.subsection02.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class  Owner{

    @PostConstruct      // initMethod와 같은 설정 어노테이션
    public void openShop(){
        System.out.println("사장님 가게 문을 열었습니다.");
    }

    @PreDestroy     // destoryMethod와 같은 설정 어노테이션
    public void closeShop(){
        System.out.println("사장님 가게 문을 닫았습니다.");
    }

}
