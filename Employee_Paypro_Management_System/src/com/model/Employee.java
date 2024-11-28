package com.model;

import java.util.Scanner;

public class Employee {
	    private int empId;
	    private String name;
	    private String address;
	    private long contact;
	    private String designation;
	    private String department;

	    public void inputEmployeeDetails() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("--------- Enter Employee Details ---------");
	        System.out.print("Employee ID: ");
	        empId = sc.nextInt();
	        sc.nextLine();  // Consume newline
	        
	        System.out.print("Name: ");
	        name = sc.nextLine();
	        
	        System.out.print("Address: ");
	        address = sc.nextLine();
	        
	        System.out.print("Contact: ");
	        contact = sc.nextLong();
	        sc.nextLine();
	        
	        System.out.print("Designation: ");
	        designation = sc.nextLine();
	        
	        System.out.print("Department: ");
	        department = sc.nextLine();
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDesignation() {
	        return designation;
	    }

	    public String getDepartment() {
	        return department;
	    }
	}



