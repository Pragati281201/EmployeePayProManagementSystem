package com.service;

import com.model.Employee;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Payslip {
    public void generatePayslip(Employee employee, Salary salary, int leaveDays) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Payslip.html"));

            writer.write("<html><body>");
            writer.write("<h1 style='text-align:center;'>Payslip</h1>");
            writer.write("<hr>");
            writer.write("<pre>");
            writer.write("<p><strong>Employee ID:</strong> " + employee.getEmpId() + "</p>");
            writer.write("<p><strong>Employee Name:</strong> " + employee.getName() + "</p>");
            writer.write("<p><strong>Designation:</strong> " + employee.getDesignation() + "</p>");
            writer.write("<p><strong>Department:</strong> " + employee.getDepartment() + "</p>");
            writer.write("<hr>");
            writer.write("<p><strong>Basic Salary:</strong> " + salary.getGrossSalary() + "</p>");
            writer.write("<p><strong>Allowance:</strong> " + salary.getGrossSalary() + "</p>");
            writer.write("<p><strong>Bonus:</strong> " + salary.getGrossSalary() + "</p>");
            writer.write("<p><strong>Tax Deduction:</strong> " + salary.getTaxDeduction() + "</p>");
            writer.write("<p><strong>Insurance Deduction:</strong> " + salary.getInsuranceDeduction() + "</p>");
            writer.write("<p><strong>Leave Deduction:</strong> " + salary.getLeaveDeduction() + "</p>");
            writer.write("<p><strong>Net Salary:</strong> " + salary.getNetSalary() + "</p>");
            writer.write("</pre>");
            writer.write("</body></html>");

            writer.close();
            System.out.println("Payslip generated successfully as 'Payslip.html'. Open this file in your browser and save it as PDF.");

        } catch (IOException e) {
            System.out.println("Error generating payslip.");
            e.printStackTrace();
        }
    }
}

