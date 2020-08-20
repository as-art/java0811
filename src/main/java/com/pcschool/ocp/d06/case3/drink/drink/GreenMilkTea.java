package com.pcschool.ocp.d06.case3.drink.drink;

import com.pcschool.ocp.d06.case3.material.Milk;

public class GreenMilkTea extends GreenTea {

    public GreenMilkTea() {
        Milk milk = new Milk();
        addMaterial(milk);
    }

    private void addMaterial(Milk milk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}