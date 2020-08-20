
package com.pcschool.ocp.d04;

import java.util.Random;

public class Food {

    Food(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class Food {
    public static String name;
    private int amount = 100;
    private int price;
    
    // 類別資源共同初始區段
    static {
        int n = new Random().nextInt(10);
        if(n % 2 == 0)
            name = "可樂";
        else
            name = "糖水";
    }
    
    // 物件資源共同初始區段
    {
        int n = new Random().nextInt(10);
        price = n % 2 == 0 ? 100 : 50;
    }
    
    public Food() {
        
    }
    
    public Food(int amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString() {
        return "Food{" + "amount=" + amount + ", price=" + price + '}';
    }




}
}