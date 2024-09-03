package com.hanwhaswcamp.chap05interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterceptorTestController {
    @GetMapping("/stopwatch")
    public String stopwtch() throws InterruptedException{
        System.out.println("핸들러 메소드 호출");
        Thread.sleep(1000);
        return "result";
    }
}
