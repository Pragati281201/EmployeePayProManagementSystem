package com.user;

import java.util.Scanner;
import com.model.Employee;
import com.service.Salary;
import com.service.Payslip;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        employee.inputEmployeeDetails();

        System.out.println("Enter the basic salary: ");
        double basicSalary = sc.nextDouble();

        System.out.println("Enter allowance: ");
        double allowance = sc.nextDouble();

        System.out.println("Enter bonus: ");
        double bonus = sc.nextDouble();

        System.out.println("Enter number of leave days: ");
        int leaveDays = sc.nextInt();

        Salary salary = new Salary(basicSalary, allowance, bonus);
        salary.calculateNetSalary(leaveDays);

        Payslip payslip = new Payslip();
        payslip.generatePayslip(employee, salary, leaveDays);

        sc.close();
    }
}
