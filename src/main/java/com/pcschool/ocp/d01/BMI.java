package com.pcschool.ocp.d01;
public class BMI {
    public String name;
    public double h;
    public double w;     
    public double  bmi;
    private  double  bmi;
    
    public doublc getBMI();{
     return  bmi;
    
}
       
    public double SetBMI(){
        bmi = w / Math.pow(h/100 ,2);
        return  bmi;
        
        
    }
}
