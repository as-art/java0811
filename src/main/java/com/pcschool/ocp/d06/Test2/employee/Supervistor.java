
package com.pcschool.ocp.d06.case2.employee;

import com.pcschool.ocp.d06.case2.salary.SupervistorSalary;

public class Supervistor extends Manager {

    public Supervistor() {
        SupervistorSalary supervistorSalary = new SupervistorSalary();
        setSalary(supervistorSalary);
    }

    private void setSalary(SupervistorSalary supervistorSalary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
