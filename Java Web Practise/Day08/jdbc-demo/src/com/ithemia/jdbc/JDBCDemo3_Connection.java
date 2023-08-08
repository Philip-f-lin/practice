package com.ithemia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC API 詳解：Connection
public class JDBCDemo3_Connection {
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
        String sql1 = "update account set money = 3000 where id = 1";
        String sql2 = "update account set money = 3000 where id = 2";

        // 4.獲取執行sql的對象Statement
        Statement stmt = conn.createStatement();



        try {
            // 開啟事務
            conn.setAutoCommit(false);

            // 5.執行sql
            int count1 = stmt.executeUpdate(sql1); // 受影響的行數

            // 6.處理結果
            System.out.println(count1);

            // 5.執行sql
            int count2 = stmt.executeUpdate(sql2); // 受影響的行數

            // 6.處理結果
            System.out.println(count2);

            // 提交事務
            conn.commit();

        } catch (Exception e) {
            // 回滾事務
            conn.rollback();

            throw new RuntimeException(e);
        }





        // 7.釋放資源
        stmt.close();
        conn.close();



    }
}
