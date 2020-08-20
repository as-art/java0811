package com.pcschool.ocp.d06.case3.drink.drink;

import com.pcschool.ocp.d06.case3.material.Tea;

public class RedTea extends drink {

    public RedTea() {
        Tea tea = new Tea();
        addMaterial(tea);
    }

    private void addMaterial(Tea tea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}


