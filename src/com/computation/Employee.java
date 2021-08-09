package com.computation;

public class Employee {

	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation");
	
	int IS_FULL_TIME=1;
	int empRate=20;
	int empHrs=0;
	int empWage=0;
	double empCheck=Math.floor(Math.random()*10)%2;
	if (empCheck == IS_FULL_TIME) {
		
		empHrs=8;
		
	}else {
		empHrs=0;
	}
	empWage=empHrs*empRate;
	System.out.println("Employee Wage ="+empWage);

	}

}
