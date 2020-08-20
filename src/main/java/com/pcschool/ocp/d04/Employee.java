
package com.pcschool.ocp.d04;


public class Employee {
    private String name;
    private int  salary;

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
  public Employee (String name, int salary) {
      this.name = name;
      this.salary = salary;
      
        
    }

    public Employee() {
       name = "Unknow";
       salary = 100;
    }
    
    
    
    
    
}
