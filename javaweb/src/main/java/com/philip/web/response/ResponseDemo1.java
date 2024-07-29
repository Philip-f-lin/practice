package com.philip.web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/resp1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("resp1");

        // 重定向
        /*// 1. 設置響應狀態碼
        resp.setStatus(302);
        // 2. 設置響應頭 Location
        resp.setHeader("Location", "/javaweb/resp2");*/

        // 簡化方式完成重定向
        //resp.sendRedirect("/javaweb/resp2");
        resp.sendRedirect("https://www.google.com");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
