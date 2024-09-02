package com.hanwhaswcamp.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/* DispatcherServlet은 웹 요청을 받는 즉시 @Controller가 달린 컨트롤러 클래스에 처리를 위임한다
* 그 과정에서 컨트롤러 클래스의 핸들러 메서드에 선언 된 다양한 @RequestMapping 설정 내용에 따른다. */

/* 1. 요청 메소드 미지정(메소드 방식과 무관하게 매핑 된다)*/
@Controller
public class MethodMappingTestController {

    @RequestMapping("/menu/regist")
    public String menuRegist(Model model) {
        /* Model 객체에 addAttribute 메서드를 이용해서 value를 추가하면
        * view에서 사용할 수 있다. -> chap03-view-resolver에서 다시 다룸*/
        model.addAttribute("message","신규 메뉴 등록용 핸들러 메소드 호출");

        // 반환하고자하는 view의 경로를 포함한 이름을 작성한다.
        // resource/templates 하위부터의 경로를 작성한다 -> chap03-view-resolver에서 다시 다룸
        return "mappingResult";
    }

    /* 2. 요청 메소드 지정*/
    @RequestMapping(value="menu/modify", method = RequestMethod.GET)
    public String menuModify(Model model) {
        model.addAttribute("message","GET 방식의 메뉴 수정용 핸들러 메소드 호출");
        return "mappingResult";
    }

    /* 3. 요청 메소드 전용 어노테이션 */
    @GetMapping("/menu/delete")
    public String getMenuDelete(Model model) {
        model.addAttribute("message","Get 방식의 메뉴 삭제용 핸들러 메소드 호출");
        return "mappingResult";
    }
    @PostMapping("/menu/delete")
    public String postMenuDelete(Model model) {
        model.addAttribute("message","POST 방식의 메뉴 삭제용 핸들러 메소드 호출");
        return "mappingResult";
    }
}
