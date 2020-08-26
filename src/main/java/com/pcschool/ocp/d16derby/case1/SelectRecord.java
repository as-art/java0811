package com.pcschool.ocp.d16derby.case1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectRecord {

    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:derby://localhost:1527/demo";
        String username = "app";
        String password = "app";
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        Statement stmt = conn.createStatement();
        String sql = "SELECT id, bname, price, ts FROM book";
        ResultSet rs = stmt.executeQuery(sql);
        ResultSetMetaData md = rs.getMetaData();
        System.out.printf("%4d %10s %4d %30s\n", md.getColumnName(1), md.getColumnName(2), md.getColumnName(3), md.getColumnName(4));
          System.out.printf("-----------------------------------------------------\n");
        while (rs.next()) {
            int id = rs.getInt("id");
            String bname = rs.getString("bname");
            int price = rs.getInt("price");
            Timestamp ts = rs.getTimestamp("ts");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
            System.out.printf("%4d %10s %4d %30s\n", id, bname, price, sdf.format(ts));
        }

        conn.close();
    }
}
