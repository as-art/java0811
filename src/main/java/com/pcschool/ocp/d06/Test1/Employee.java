
package com.pcschool.ocp.d06.Test1;
public class Employee {
    private  static final int BASE_SALARY = 23800;
    private int  salary;

    public Employee() {
        setSalary(BASE_SALARY);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int money) {
        if(money > BASE_SALARY ) {
            this.salary = money;
         }else{
            this.salary = BASE_SALARY;
        }
        
        
    }
    
    
   
}
