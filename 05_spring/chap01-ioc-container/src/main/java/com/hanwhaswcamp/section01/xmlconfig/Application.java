package com.hanwhaswcamp.section01.xmlconfig;

import com.hanwhaswcamp.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        /* GenericXmlApplicationContext 클래스를 사용하여 ApplicationContext를 생성한다.
         * 생성자에 XML 설정 메타 정보를 인자로 전달한다. */
        ApplicationContext applicationContext = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        MemberDTO member1 = (MemberDTO) applicationContext.getBean("member");   // bean id
        MemberDTO member2 = applicationContext.getBean(MemberDTO.class);        // 클래스 메타 정보
        /* MemberDTO로 생성한 bean을 가져옴
        * 1개일 때만 가능 */
        MemberDTO member3 = applicationContext.getBean("member", MemberDTO.class);

        System.out.println(member3);

    }
}
