package com.service;

public class Salary {
    private double basicSalary;
    private double allowance = 1000;
    private double bonus = 2000;
    private double taxRate = 0.10;
    private double insuranceRate = 0.05;
    private int leaveDays;
    private double netSalary;

    public Salary(double basicSalary, double allowance, double bonus) {
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.bonus = bonus;
    }

    public void calculateNetSalary(int leaveDays) {
        this.leaveDays = leaveDays;
        double grossSalary = basicSalary + allowance + bonus;
        double taxDeduction = grossSalary * taxRate;
        double insuranceDeduction = grossSalary * insuranceRate;
        double leaveDeduction = (basicSalary / 30) * leaveDays;
        netSalary = grossSalary - (taxDeduction + insuranceDeduction + leaveDeduction);
    }

    public double getNetSalary() {
        return netSalary;
    }

    public double getGrossSalary() {
        return basicSalary + allowance + bonus;
    }

    public double getTaxDeduction() {
        return (basicSalary + allowance + bonus) * taxRate;
    }

    public double getInsuranceDeduction() {
        return (basicSalary + allowance + bonus) * insuranceRate;
    }

    public double getLeaveDeduction() {
        return (basicSalary / 30) * leaveDays;
    }
}

