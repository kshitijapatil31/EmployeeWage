package com.computation;

public class Employee {

	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation");
	
	int IS_FULL_TIME=1;
	int IS_PART_TIME=2;
	int empRate=20;
	int empHrs=0;
	int empWage=0;
	double empCheck=Math.floor(Math.random()*10)%3;
	if (empCheck == IS_FULL_TIME) {
		
		empHrs=8;
		
	}else if (empCheck == IS_PART_TIME){
		empHrs=4;
		
	}else {
		empHrs=0;
	}
	empWage=empHrs*empRate;
	System.out.println("Employee Wage="+empWage);

	}

}
