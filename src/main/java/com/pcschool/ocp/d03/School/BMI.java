
package com.pcschool.ocp.d03.School;


public class BMI {
    private double height;

    public BMI(double height, double weight ) {
        this.height = height;
        this.weight = weight;
        this.bmiValue = weight / Math.pow(height/100, 2);
    }
    private double weight;
    private double bmiValue;
 @Override
    public String toString() {
        return "BMI{" + "height=" + height + ", weight=" + weight + ", bmiValue=" + bmiValue + '}';
    }
}