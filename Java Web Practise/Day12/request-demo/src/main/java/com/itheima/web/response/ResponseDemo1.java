package com.itheima.web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//請求轉發forward

@WebServlet("/resp1")
public class ResponseDemo1 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("resp1...");

        //重定向
        /*//1.設置響應狀態碼302
        resp.setStatus(302);
        //2.設置響應頭Location
        resp.setHeader("Location", "/request-demo/resp2");*/

        //簡化方式完成重定向
        //動態獲取虛擬目錄
        String contextPath = req.getContextPath();

        resp.sendRedirect(contextPath + "/resp2");


        //resp.sendRedirect("https://www.yahoo.com.tw");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
