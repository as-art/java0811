package com.pcschool.ocp.d06.case3.material;

public class Tea extends Material {

    public Tea() {
        this("阿薩姆", 15);
    }
    
    public Tea(String name, int price) {
        setName(name);
        setPrice(price);
    }
    
}
 
 
