
package com.pcschool.ocp.d01;
public class Arraytest2 {
    public static void main(String[] args) {
        double[] stocks = {7.6, 3.9, 15.6 , 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
        
        double[] bounds = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
    
    
              

// 債券獲利
        double[] bounds = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};

        Util stockUtil = new Util();
        stockUtil.values = stocks;
        System.out.printf("股票平均獲利: %.2f\n", stockUtil.getAvg());
        System.out.printf("股票CV: %.2f\n", stockUtil.getCV());

        Util boundUtil = new Util();
        boundUtil.values = bounds;
        System.out.printf("債券平均獲利: %.2f\n", boundUtil.getAvg());
        System.out.printf("債券CV: %.2f\n", boundUtil.getCV());

        System.out.printf("CV值小的是: %s\n", stockUtil.getCV() < boundUtil.getCV() ? "股票" : "債券");
    
    package com.pcschool.ocp.d01;

public class Util {
    public double [] values;
    public double getSum() {
        int sum = 0;
        for(int i=0;i<values.length;i++) {
            sum += values[i];
        }
        return sum;
    }
    public double getAvg() {
        return getSum() / values.length;
    }
    public double getSD() {
        double avg = getAvg();
        double sum = 0;
        for(int i=0;i<values.length;i++) {
            sum += Math.pow(values[i] - avg, 2);
        }
        double sd = Math.sqrt((1.0/values.length)*sum);
        return sd;
    }
    public double getCV() {
        double cv = getSD() / getAvg();
        return cv;
    }
}
    
}
}