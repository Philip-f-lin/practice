package com.ithemia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// JDBC API 詳解：DriverManager
public class JDBCDemo2_DriverManager {
    public static void main(String[] args) throws Exception {
        /*// 1.註冊驅動
        Class.forName("com.mysql.jdbc.Driver");
*/
        // 2.獲取連接：如果連接的是本機mysql並且端口是默認的3306可以簡化書寫
        String url="jdbc:mysql:///db05?useSSL=false";
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
