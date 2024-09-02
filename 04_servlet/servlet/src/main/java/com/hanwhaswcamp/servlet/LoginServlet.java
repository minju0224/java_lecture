package com.hanwhaswcamp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append("<head>")
                .append("<title>로그인</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>로그인하기</h1>")
                .append("<form action=\"login\" method=\"post\">")
                .append("<label>사용자 명</label><input type=\"text\" name=\"username\">")
                .append("<label>비밀번호</label><input type=\"password\" name=\"password\">")
                .append("<button value=\"submit\">로그인</button>\n" +
                        "</form>")
                .append("</body>")
                .append("</html>");
        resp.setContentType("text/html");
        // 사용자 브라우저에 응답하기 위한 출력 스트림을 response 객체에서 반환 받는다.
        PrintWriter writer = resp.getWriter();
        writer.print(sb);
        writer.flush(); // 버퍼에  잔류한 데이터 내보내기
        writer.close(); // 스트림
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter writer = resp.getWriter();
        StringBuilder stringBuilder = new StringBuilder();

        if(username.equals("minju") && password.equals("1234")) {
            stringBuilder.append("login success");
        }else{
            stringBuilder.append("login failed");
        }

        writer.print(stringBuilder.toString());
        writer.flush();
        writer.close();

    }
}
