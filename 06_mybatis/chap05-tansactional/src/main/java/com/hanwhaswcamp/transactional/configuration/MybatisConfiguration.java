package com.hanwhaswcamp.transactional;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.hanwhaswcamp.transactional", annotationClass = Mapper.class)
public class MybatisConfiguration {
}
