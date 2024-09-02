package com.hanwhaswcamp.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionHandlerController {
    @GetMapping("/controller-null")
    public String nullPointerException() {
        String str = null;
        System.out.println(str.charAt(0));      // 의도적으로 nullpointerexception 발생 시키는 코드
        return "/";
    }

    @GetMapping("/controller-user")
    public String userExceptionTest() throws MemberRegistException {
        boolean check = true;
        if (check) {
            throw new MemberRegistException("당신 같은 사람은 회원으로 받을 수 없습니다.");
        }
        return "/";
    }

    /* 지역적으로만 작동함 */
    @ExceptionHandler(NullPointerException.class)
    public String nullPointerExceptionHandler(NullPointerException e){
        System.out.println(" 특정 Controller 범위의 Exception Handler 동작");
        System.out.println("message : "+e.getMessage());
        return "error/nullPointer";
    }

    @ExceptionHandler(MemberRegistException.class)
    public String memberRegistExceptionHandler(MemberRegistException e, Model model){
        System.out.println(" 특정 Controller 범위의 Exception Handler 동작");
        model.addAttribute("exception", e);
        return "error/memberRegist";
    }

}
