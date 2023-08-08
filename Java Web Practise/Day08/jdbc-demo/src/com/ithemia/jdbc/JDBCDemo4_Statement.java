package com.ithemia.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC API 詳解：Statement
public class JDBCDemo4_Statement {

    /*
    執行DML語句
     */

    @Test
    public void testDML() throws Exception {
         /*// 1.註冊驅動
        Class.forName("com.mysql.jdbc.Driver");*/

        // 2.獲取連接：如果連接的是本機mysql並且端口是默認的3306可以簡化書寫
        String url="jdbc:mysql:///db05?useSSL=false";
        String username = "root";
        String password = "cowmato8";
        Connection conn = DriverManager.getConnection(url, username, password);

        // 3.定義sql
        String sql = "update account set money = 3000 where id = 1";

        // 4.獲取執行sql的對象Statement
        Statement stmt = conn.createStatement();

        // 5.執行sql
        int count = stmt.executeUpdate(sql); // 執行完SQL, 受影響的行數

        // 6.處理結果
        if(count > 0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失敗");
        }


        // 7.釋放資源
        stmt.close();
        conn.close();


    }
}
