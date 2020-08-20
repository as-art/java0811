
package com.pcschool.ocp.d01;


public class Account {
     private int balance;
    
     public void save(int money) {
         if(money > 0){
         balance += money;
     }
     
     
     }
     
     public void withdraw(int money){
         if(money > 0 && balance >=money) {
             balance -=money;
             
         }
         
     }
     //取ˇ得帳戶餘
     public int getBalance() {
         return balance;
     }
     
     
}