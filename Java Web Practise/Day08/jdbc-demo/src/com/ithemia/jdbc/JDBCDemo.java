package com.ithemia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// JDBC快速入門
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        // 1.註冊驅動
        Class.forName("com.mysql.jdbc.Driver");

        // 2.獲取連接
        String url="jdbc:mysql://127.0.0.1:3306/db05";
        String username = "root";
        String password = "cowmato8";
        Connection conn = DriverManager.getConnection(url, username, password);

        // 3.定義sql
        String sql = "update account set money = 2000 where id = 1";

        // 4.獲取執行sql的對象Statement
        Statement stmt = conn.createStatement();

        // 5.執行sql
        int count = stmt.executeUpdate(sql); // 受影響的行數

        // 6.處理結果
        System.out.println(count);

        // 7.釋放資源
        stmt.close();
        conn.close();



    }
}
