package com.itheima.web;

import com.itheima.pojo.Brand;
import com.itheima.pojo.User;
import com.itheima.service.BrandService;
import com.itheima.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = service.login(username, password);

        if(user != null){
            //登錄成功，跳轉到查詢所有的BrandServlet

            //將登錄成功後的user對象，儲存到session
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            //登錄成功
            String contextPath = req.getContextPath();
            resp.sendRedirect(contextPath+"/selectAllServlet");

        }else {
            //登錄失敗

            //儲存錯誤訊息到request
            req.setAttribute("login_msg", "用戶名或密碼錯誤");
            //跳轉到login.jsp
            req.getRequestDispatcher("/login.html").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
