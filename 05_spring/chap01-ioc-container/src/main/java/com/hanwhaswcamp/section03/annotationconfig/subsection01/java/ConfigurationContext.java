package com.hanwhaswcamp.section03.annotationconfig.subsection01.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration("configurationSection03")
// 베이스 패키지 설정이 별도로 없을 경우 현재패키지 기준으로 스캔이 수행 된다.
@ComponentScan(basePackages = "com.hanwhaswcamp")
public class ConfigurationContext {
}
