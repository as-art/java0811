package com.pcschool.ocp.d03;

import java.util.Arrays;
import java.util.Comparator;
public class ArithmeticMethod3 {
    public static void main(String[] args) {
        //double[][] bmis = {{170.0, 60.0}, {160.0, 60.5}, {185, 65.5}};
        BMI[] bmis = {new BMI(170.0, 60.0), new BMI(160.0, 60.5), new BMI(185, 65.5)};
        //java8
        Arrays.stream(bmis).forEach(b -> System.out.println(b));
        System.out.println("----------------------------------");
        Arrays.stream(bmis)
                .filter(b -> b.getValue() >= 18 && b.getValue() <= 23)
                .forEach(b -> System.out.println(b));
        System.out.println("----------------------------------");
        Arrays.stream(bmis)
                .sorted(Comparator.comparing(BMI::getValue))
                .forEach(b -> System.out.println(b));
    }
}

class BMI {
    private double h;
    private double w;
    private double value;

    public BMI(double h, double w) {
        this.h = h;
        this.w = w;
        
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BMI{" + "h=" + h + ", w=" + w + ", value=" + value + '}';
    }
    
}




