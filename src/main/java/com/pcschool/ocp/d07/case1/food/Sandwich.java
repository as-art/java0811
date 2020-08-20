package com.pcschool.ocp.d07.case1.food;

import com.pcschool.ocp.d07.case1.material.Egg;
import com.pcschool.ocp.d07.case1.material.Ham;
import com.pcschool.ocp.d07.case1.material.Material;

public class Sandwich extends Food {

    public Sandwich(String name) {
        super(name);
    Material[] materials = new Material[2];
    materials[0] = new  Ham();
    materials[1] = new  Egg();
    setMaterials(materials);
    
    }

    
 
}
 
