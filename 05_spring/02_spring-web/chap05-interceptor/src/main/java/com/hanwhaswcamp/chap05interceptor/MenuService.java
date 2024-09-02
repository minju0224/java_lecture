package com.hanwhaswcamp.chap05interceptor;

import org.springframework.stereotype.Service;

@Service
public class MenuService {
    public void method() {
        System.out.println("MenuService 클래스의 mthod호출");
    }
}
