
package com.pcschool.ocp.d13assert;
public class AssertDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        assert (x > y) : String.format("x(%d) 沒有大於 y(%d)", x, y);
        System.out.println(x + y);
    }
}
