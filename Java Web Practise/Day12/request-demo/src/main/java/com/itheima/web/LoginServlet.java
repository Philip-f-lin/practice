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
import java.io.PrintWriter;

import static com.itheima.util.sqlSessionFactoryUtils.getSqlSessionFactory;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 接收用戶名和密碼

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //2. 調用MyBatis完成查詢
        //2.1 獲取sqlSessionFactory對象
       /* String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);*/

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryUtils.getSqlSessionFactory();
        //2.2 獲取sqlSession對象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //2.3 獲取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //2.4 調用方法
        User user = userMapper.select(username, password);
        //2.5 釋放資源
        sqlSession.close();

        //獲取字符輸出流，並設置content type
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        //3. 判斷user是否為null
        if(user != null){
            // 登錄成功
            writer.write("登錄成功");
        }else{
            // 登錄成功
            writer.write("登錄失敗");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
