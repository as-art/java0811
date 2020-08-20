
package com.pcschool.ocp.d03.FAstfood;
public class coca {
    private int price = 20;
    private static int amount = 100;
    
    public coca() {
        amount--;
    }
    
    public int getPrice() {
        return price;
    }    
public static int getAmount() {
        return amount;
    }    
}
