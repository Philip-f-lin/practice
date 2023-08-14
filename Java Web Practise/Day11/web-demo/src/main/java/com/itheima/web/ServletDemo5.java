package com.itheima.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ServletDemo5 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 根據請求方式的不同，進行分別的處理

        HttpServletRequest request = (HttpServletRequest) servletRequest;

        //1.獲取請求方式
        String method = request.getMethod();

        //2.判斷
        if("GET".equals(method)){
            // get方式的處理邏輯
        } else if ("POST".equals(method)) {
            // post方式的處理邏輯
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
