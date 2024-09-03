package com.hanwhaswcamp.chap05interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/*HandlerInterceptor 인터페이스를 구현한 클래스로 작성 */
@Component
public class StopWatchInterceptor implements HandlerInterceptor {

    /* Interceptor는 소프링 컨테이너에 존재하는 빈을 의존성 주입을 받을 수 있다.*/
    private final MenuService menuService;

    public StopWatchInterceptor(MenuService menuService) {
        this.menuService = menuService;
    }
    /* 전처리 메소드 */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle 메소드 호출");
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);

        return true;       // 컨트롤러 핸들러 메소드의 호출로 이어짐, false이면 호출하지 않음
    }

    /* 후처리 메소드 */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle 메소드 호출 ");
        long endTime = System.currentTimeMillis();
        long startTime = (Long) request.getAttribute("startTime");

        modelAndView.addObject("interval", endTime - startTime);
    }

    /* 뷰가 랜더링 된 이후 동작하는 메소드 */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion 메소드 호출");
        menuService.method();
    }

}
