
package com.pcschool.ocp.d03.FAstfood;
public class Wings {
     private int price = 30;
    private static int amount = 100;

    public Wings() {
        amount--;
    }
    
    public int getPrice() {
        return price;
    }
    public static int getAmount() {
        return amount;
    }    
}
