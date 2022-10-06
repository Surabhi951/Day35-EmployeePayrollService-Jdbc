package com.bridgelabz;

public class EmployeePayrollMain {
    public static void main(String[] args) throws EmployeePayrollException {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        System.out.println("Retrieved data: ");
        employeePayrollService.retrieveData().forEach((System.out::println));
    }
}