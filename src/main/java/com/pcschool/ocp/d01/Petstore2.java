
package com.pcschool.ocp.d01;
public class Petstore2 {
        cat d1 = new cat();
        cat d2 = new cat();
        cat.type = "波斯貓";
        c1.name="小花";c1 .age = 2;  c1. price = 12000; c1. amount = 8;
        c2.name="柯南";c2 .age = 7;  c2. price = 500; c2. amount = 5;
        
        System.out.printf("品種: %s 年齡: %d 價格 %,d 數量: %d 小計: %,d\n", c1.type, c1.age, c1. price, c1.amount, (c1.price*c1.amount));
        System.out.printf("品種: %s 年齡: %d 價格 %,d 數量: %d 小計: %,d\n", c2.type, c2.age, d2. price, c2.amount, (c2.price*c2.amount));
        int sum = (c1.price*c1.amount)  + (c2.price*c2.amount)
        System.out.printf("Cat 總資產: %,d\n", sum);        
}
