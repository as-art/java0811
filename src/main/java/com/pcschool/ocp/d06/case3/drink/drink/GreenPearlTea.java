
package com.pcschool.ocp.d06.case3.drink.drink;

import com.pcschool.ocp.d06.case3.material.Pearl;

public class GreenPearlTea extends GreenMilkTea {

    public GreenPearlTea() {
        Pearl pearl = new Pearl("S");
        addMaterial(pearl);
    }

    private void addMaterial(Pearl pearl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
