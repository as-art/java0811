
package com.pcschool.ocp.d01;


public class patstore {
    
    public static void main(String[] args) {
        dog d1 = new dog();
        dog d2 = new dog();
        dog d3 = new dog();
        dog.type = "拉不拉多";
        d1. age = 5;  d1. price = 5000;  d1. amount = 30;
      
       
        d2.age = 2;  d2. price = 3000; d2. amount = 20;
         
        
        
        d3. age = 4; d3. price = 8000;d3. amount = 10;
         
        
        
        
    System.out.printf("品種: %s 年齡: %d 價格 %,d 數量: %d 小計: %,d\n", d1.type, d1.age, d1. price, d1.amount, (d1.price*d1.amount));
    System.out.printf("品種: %s 年齡: %d 價格 %,d 數量: %d 小計: %,d\n", d2.type, d2.age, d2. price, d2.amount, (d2.price*d2.amount));
    System.out.printf("品種: %s 年齡: %d 價格 %,d 數量: %d 小計: %,d\n", d3.type, d3.age, d3. price, d3.amount, (d3.price*d3.amount));
    int sum = (d1.price*d1.amount)  + (d2.price*d2.amount) + (d3.price*d3.amount);
        System.out.printf("Dog 總資產: %,d\n", sum);    
    }
    
}