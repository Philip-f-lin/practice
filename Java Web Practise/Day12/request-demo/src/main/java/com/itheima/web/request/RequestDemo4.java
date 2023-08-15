package com.itheima.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

//中文亂碼問題，解決方案

@WebServlet("/req4")
public class RequestDemo4 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 解決亂碼：POST, getReader()
        req.setCharacterEncoding("UTF-8");//設置字符輸入流的編碼

        //2. 獲取username
        String username = req.getParameter("username");
        System.out.println(username);

        //3. GET






    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
