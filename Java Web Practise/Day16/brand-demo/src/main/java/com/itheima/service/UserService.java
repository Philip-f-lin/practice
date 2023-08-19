package com.itheima.service;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserService {
    //獲取sqlSessionFactory對象
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /*登錄方法*/
    public User login(String username, String password){

        //1. 創建sqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 獲取UserMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //3. 調用方法
        User user = userMapper.select(username, password);

        sqlSession.close();

        return user;

    }
}
