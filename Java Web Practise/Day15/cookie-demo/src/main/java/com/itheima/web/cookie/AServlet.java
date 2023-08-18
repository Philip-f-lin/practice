package com.itheima.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/aServlet")
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //發送Cookie

        //1.創建Cookie對象
        //Cookie cookie = new Cookie("username", "zs");

        String value = "張三";
        // URL編碼
        value = URLEncoder.encode(value, "UTF-8");
        System.out.println("存儲數據：" + value);

        Cookie cookie = new Cookie("username", value);

        //設置存活時間 一週7天
        cookie.setMaxAge(60 * 60 * 24 * 7);

        //2.發送Cookie, response
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
