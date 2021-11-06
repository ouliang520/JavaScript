package com.ouliang.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //不能直接传student类对象给javaScript
        //可以通过拼接方式与反射机制传入
        String str = "{\"sid\":10,\"sname\":\"mike\"}";
        request.setAttribute("key", str);
        request.getRequestDispatcher("/index_1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
