package com.pcschool.ocp.d06.case2.employee;

import com.pcschool.ocp.d06.case2.salary.SalesSalary;

public class Sales extends Employee {

    public Sales() {
        SalesSalary salesSalary = new SalesSalary();
        setSalary(salesSalary);
    }

    private void setSalary(SalesSalary salesSalary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
