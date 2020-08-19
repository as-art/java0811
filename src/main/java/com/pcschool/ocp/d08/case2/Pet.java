package com.pcschool.ocp.d08.case2;

public interface Pet {
 
	public static final int leg = 4;
	 
	public void eat();
	
        
        public abstract void skill();
          default void copyright() {
        System.out.println("Happy 寵物店");
    }
        
}
 
