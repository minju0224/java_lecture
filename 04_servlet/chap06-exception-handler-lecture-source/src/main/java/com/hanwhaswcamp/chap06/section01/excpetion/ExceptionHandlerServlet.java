package com.hanwhaswcamp.chap06.section01.excpetion;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/* Custom Error Page 작성*/
@WebServlet("/showErrorPage")
public class ExceptionHandlerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> attrs = req.getAttributeNames();
        while (attrs.hasMoreElements()) {
            String attr = attrs.nextElement();
            System.out.println(attr + ": " + req.getAttribute(attr));
        }

        int statusCode = (int)req.getAttribute("javax.servlet.error.status_code");
        String message = (String)req.getAttribute("javax.servlet.error.message");
        String servletName = (String)req.getAttribute("javax.servlet.error.servlet_name");

        StringBuilder errorPage = new StringBuilder();
        errorPage.append("<h1>")
                .append(statusCode)
                .append("</h1>")
                .append("<p>")
                .append(message)
                .append("</p>")
                .append("<p>")
                .append(servletName)
                .append("</p>");
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.print(errorPage);
        out.flush();
        out.close();
    }
}
