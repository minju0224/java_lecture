package com.hanwhaswcamp.chap02.section01.serviceMethod;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/request-service")
public class ServiceMethodTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("get 요청을 처리할 메소드 호출");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("post 요청을 처리할 메소드 호출");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        /* Http 프로토콜의 정보를 담고 있는 타입으로 다운 캐스팅 한다 */
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String httpMethod = request.getMethod();    // 요펑 받은 http 메소드가 어떤 메소드인지 판단한다.
        System.out.println("httpMethod: " + httpMethod);
        if (httpMethod.equals("GET")) {
            doGet(request, response);
        } else if (httpMethod.equals("POST")) {
            doPost(request, response);
        }
    }
}
