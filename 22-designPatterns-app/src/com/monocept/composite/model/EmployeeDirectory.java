package com.monocept.composite.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployee {
    private List<IEmployee> employees = new ArrayList<>();

    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }

    public void removeEmployee(IEmployee employee) {
        employees.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        for (IEmployee employee : employees) {
            employee.showEmployeeDetails();
        }
    }
}
