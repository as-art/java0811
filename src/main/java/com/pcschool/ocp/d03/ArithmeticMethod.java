package com.pcschool.ocp.d03;

import static java.lang.ProcessBuilder.Redirect.from;
import java.util.Random;

public class ArithmeticMethod {

    public static void main(String[] args) {
        char[] poker = "A1234567890JQK".toCharArray();
        for(int i=0;i<100;i++){
        
        Random r  = new Random();
        int from = r.nextInt(poker.length);
        int to = r.nextInt(poker.length);
        char c = poker[from];
        poker[from] = poker[to];
        poker[to] = c;
        }
        for (char p : poker) {
            System.out.print(p + " ");
        }
        System.out.println();

    
}
}