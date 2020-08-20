
package com.pcschool.ocp.d03.School;
public class Stident {
    private String name;
    private int age;
    private BMI bmi;
    
    public Stident(String name, int age, BMI bmi) {
        this.name = name;
        this.age = age;
        this.bmi = bmi;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", bmi=" + bmi + '}';
    }
    
    
    
    
}
