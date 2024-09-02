package com.hanwhaswcamp.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ResolverController {
    @GetMapping("/string")
    public String stringReturning(Model model) {
        // Model : View에서 표현 되어야 하는 동적인 데이터를 담는 용도로 사용하는 객체
        model.addAttribute("forwarMessage","문자열로 뷰 이름 반환함....");
        // String 타입으로 리턴할 경우 논리적인 뷰 이름을 리턴한다.
        // ViewResolver가 prefix/suffix를 합쳐서 물리적인 뷰를 선택한다.
        return "result";
    }

    @GetMapping("string-redirect")
    public String stringRedirect()  {
        // redirect: 을 붙인 뒤 redirect할 주소 값을 작성한다. 지금은 root
        return "redirect:/";
    }

    /* Redirect시 request scope의 데이터는 공유 되지 않는다
    * session scope에 너무 많은 데이터를 저장하는 것은 서버 성능에 영향을 준다.
    * RedirectAttribute 객체를 통해 잠시 세션에 저장했다가 redirect 후 세션에서 제거 되게 할 수 있다. */
    @GetMapping("/string-redirect-attr")
    public String stringRedirectFlashAttribute(RedirectAttributes rttr)  {
        rttr.addFlashAttribute("flashMessage1","리다이렉트 attr 사용하여 redirect...");
        return "redirect:/";
    }

    @GetMapping("/modelandview")
    public ModelAndView modelandviewReturning(ModelAndView mv) {
        // Model 객체에 attribute 저장
        mv.addObject("forwarMessage","ModelAndView를 이용한 모델과 뷰 반환");
        mv.setViewName("result");
        return mv;
    }
}
