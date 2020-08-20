
package com.pcschool.ocp.Game;

import java.util.Random;


public class Number {
    private  int  ans = new Random().nextInt(10) + 1;
    private  int count;
    public int check(int userAns) {
        return  userAns - ans;
        
    }
    
    
}
