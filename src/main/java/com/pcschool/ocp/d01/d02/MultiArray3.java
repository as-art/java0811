
package com.pcschool.ocp.d01.d02;
public class MultiArray3 {
    public static void main(String[] args) {
        int[][] x = {{100, 90, 80,}, {70, 60, 50}};
        System.out.println("x length = " + x.length);
  
        for(int k=0;k<x.length;k++){
            
            for (int i = 0; i < x[k].length; i++){
            System.out.println(x[k][i]);
        }






//將x[0]的內容取出
    for(int i=0;i<x[0].length;i++){
        System.out.println(x[0][i]);
        
    }
    //
    for(int i=0;i<x[1].length;i++){
        System.out.println(x[1][i]);
        
    }
        }
    }
}
        
        

