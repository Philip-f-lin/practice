package com.itheima.web;

import com.itheima.pojo.Brand;
import com.itheima.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
        private BrandService service = new BrandService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //處理POST請求的亂碼問題
        req.setCharacterEncoding("utf-8");

        //1. 接收表單提交的數據，封裝為一個Brand對象
        String id = req.getParameter("id");
        String brandName = req.getParameter("brandName");
        String companyName = req.getParameter("companyName");
        String ordered = req.getParameter("ordered");
        String description = req.getParameter("description");
        String status = req.getParameter("status");
        //2. 封裝為一個Brand對象
        Brand brand = new Brand();
        brand.setId(Integer.getInteger(id));
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(Integer.getInteger(ordered));
        brand.setDescription(description);
        brand.setStatus(Integer.getInteger(status));

        //2. 調用service 完成修改
        service.update(brand);

        //3. 轉發到查詢所有Servlet
        req.getRequestDispatcher("/selectAllServlet").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
