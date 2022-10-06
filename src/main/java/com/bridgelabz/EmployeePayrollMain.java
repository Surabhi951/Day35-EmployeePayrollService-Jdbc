package com.bridgelabz;

import java.sql.SQLException;

public class EmployeePayrollMain {
    public static void main(String[] args) throws EmployeePayrollException, SQLException {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        System.out.println("Retrieved data: ");
        employeePayrollService.retrieveData().forEach((System.out::println));

        System.out.println("Update salary: ");
        employeePayrollService.updateSalary("anuj",300000.00);
    }
}