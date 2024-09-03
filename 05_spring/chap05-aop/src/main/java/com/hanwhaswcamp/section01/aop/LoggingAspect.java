package com.hanwhaswcamp.section01.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect     // pointcut과 advice를 하나의 클래스 단위로 정의하기 위한 어노테이션
public class LogginAspect {

    // Pointcut : 여러 join Point를 매치하기 위해 지정한 표현식
    @Pointcut("execution(* com.hanwhaswcamp.section01.aop.*Service.*(..))")
    public void logPointcut() {}
}
