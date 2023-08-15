package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    //根據用戶名和密碼查詢用戶對象
    @Select("select * from tb_user where username = #{username} and password = #{password}")
    User select(@Param("username") String username, @Param("password")String password);

    //根據用戶名查詢用戶對象
    @Select("select * from tb_user where username = #{username}")
    User selectByUsername(String username);

    //添加用戶
    @Insert("insert into tb_user values(null, #{username}, #{password}) ")
    void add (User user);
}
