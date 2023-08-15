package com.itheima.web;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.util.sqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

import static com.itheima.util.sqlSessionFactoryUtils.getSqlSessionFactory;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 接收用戶數據
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //封裝用戶對象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        //2. 調用mapper 根據用戶名查詢用戶對象
        //2.1 獲取sqlSessionFactory對象
        /*String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);*/

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryUtils.getSqlSessionFactory();
        //2.2 獲取sqlSession對象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 獲取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //2.4 調用方法
        User u = userMapper.selectByUsername(username);

        //3. 判斷用戶對象是否為null
        if(u == null){
            // 用戶名不存在，添加用戶
            userMapper.add(user);

            // 提交事務
            sqlSession.commit();
            // 釋放資源
            sqlSession.close();
        }else {
            // 用戶名存在，添加失敗，給出提示訊息
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("用戶名已經存在");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
