
package com.pcschool.ocp.d16derby.case1;


     
     
     
     
     
     
     
     
     
     
     
     import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

public class DeleteRecord {
    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:derby://localhost:1527/demo"; 
        String username = "app";
        String password = "app";
     
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
     
        String sql = "UPDATE book SET price = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
       
     
        pstmt.setInt(1, 4);
     
        int rowcount = pstmt.executeUpdate();
        if(rowcount > 0) {
            System.out.printf("刪除成功: %d\n", rowcount);
        } else {
            System.out.printf("刪除失敗: %d\n", rowcount);
        }
        
    }
}
