package com.itheima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns="/demo2",loadOnStartup = 1)
public class ServletDemo2 implements Servlet {

    //初始化方法
    //1. 調用時機:默認情況下，Servlet第一次被訪問時，調用
        //
    //2. 調用次數1次

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init....");

    }

    //提供服務
    //1.調用時機：每一次Servlet被訪問時，調用
    //2.調用次數：多次
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet hello world~");
    }


    //銷毀方法
    //1. 調用時機：內存釋放或服務器關閉的時候，Servlet對象會被銷毀，調用
    //2. 調用次數：1次
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }


    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    @Override
    public String getServletInfo() {
        return null;
    }


}
