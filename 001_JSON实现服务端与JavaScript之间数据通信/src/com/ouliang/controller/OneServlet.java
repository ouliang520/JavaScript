package com.ouliang.controller;

import com.ouliang.entity.student;
import com.ouliang.util.RelectUtil;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //不能直接传student类对象给javaScript
        //可以通过拼接方式与反射机制传入

        //单纯拼接,无泛用性
//        String str = "{\"sid\":10,\"sname\":\"mike\"}";
//        request.setAttribute("key", str);

        student stu =new student("10","mike");
        //通过反色机制将student类型对象内容转换为json格式字符串
        String str = RelectUtil.jsonObject(stu);
        //将学员对象存入到请求作用与对象
        request.setAttribute("key",str);
        request.getRequestDispatcher("/index_1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
