
package com.pcschool.ocp.test;


public class Test2 {
     String s;
    public Test2(String s) {
        this.s = s.concat("8");
    }
    public static void main(String[] args) {
        String s = "Java";
        Test2 t2 = new Test2(s);
        System.out.println(s);
        System.out.println(t2.s);
    }
    
}
