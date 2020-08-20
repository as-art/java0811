
package com.pcschool.ocp.d09.case1;
public class Employee {
       String name = "月例會";  
    class Job {
      String name = "Java";
        public void program(){
          String name = ("寫程式");
         System.out.println(name + ":" + this.name);
         Study study = new Study();
         study.read();
         
         
         
            }
        public  void meeting(){
            System.out.println("開會");
             System.out.println(name + ":" + Employee.this.name);
        }
        
    }
   
      private class Study {
        public void read() {
             String appName = "美食 App"; //java 7要加上 final, Java 8 不用系統判別
            int hours = 60;
            hours = 50;
            System.out.println("進修時間:" + hours + " H");
        
            class App {
                public void printName() {
                    System.out.println(appName);
                   
               }
                
            }
            App app = new  App();
            app.printName();
            
        }
       
        
        
        
        
    }




}
