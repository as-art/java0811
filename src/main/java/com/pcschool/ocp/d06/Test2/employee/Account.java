
package com.pcschool.ocp.d06.case2.employee;

import com.pcschool.ocp.d06.case2.salary.AccountSalary;

public class Account extends Employee {

    public Account() {
        AccountSalary accountSalary = new AccountSalary();
        setSalary(accountSalary);
    }

    private void setSalary(AccountSalary accountSalary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}