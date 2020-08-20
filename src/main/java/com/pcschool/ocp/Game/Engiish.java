
package com.pcschool.ocp.Game;

import java.util.Random;

public class Engiish {
     private int ans = new Random().nextInt(26) + 65;
    private int count;
    public int check(int userAns) {
        count++;
        return userAns - ans;
    }
    public int getCount() {
        return count;
    }
 
        
    
    
    
}
