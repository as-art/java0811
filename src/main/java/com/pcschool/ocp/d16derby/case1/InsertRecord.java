
package com.pcschool.ocp.d16derby.case1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecord {
     public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:derby://localhost:1527/demo";
        String username = "app";
        String password = "app";
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
         String sql = "INSERT INTO book(bname, price) VALUES(?, ?)";
         PreparedStatement pstmt = conn.prepareStatement(sql);
         pstmt.setNString(1, "VB");
         pstmt.setInt(2, 300);
         int rowcount = pstmt.executeUpdate();
                 if(rowcount > 0) {
            System.out.printf("新增成功: %d\n", rowcount);
        } else {
            System.out.printf("新增失敗: %d\n", rowcount);
        }
        
     }
     
     
     
     
     
     
     
     
     
     
     
     }
