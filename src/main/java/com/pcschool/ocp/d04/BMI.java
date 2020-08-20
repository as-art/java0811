
package com.pcschool.ocp.d04;
public class BMI {
      private double h = 170;
      private double w = 60;

     public BMI(){
         
         
     }
      public BMI(double h, double w) {
        if(w >= 30 && w <= 150){
            this.w = w;
        }
      }
        
       
      public BMI(double h){
       if(h >= 100 && h <= 250){
            this.h = h;
        }
      }
       
    
      
    @Override
    public String toString() {
        return "BMI{" + "h=" + h + ", w=" + w + '}';
    }

   

    

    
    
    
}
