package com.computation;

public class Employee {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int empRate=20;
	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation");
	
	
	int empHrs=0;
	int empWage=0;
	double empCheck=Math.floor(Math.random()*10)%3;
	switch((int)empCheck) {
	case IS_FULL_TIME:
		empHrs=8;
		break;
	case IS_PART_TIME :
		empHrs=4;
		break;
		default: 
		empHrs =0;
	}
	empWage=empHrs*empRate;
	System.out.println("Employee Wage="+empWage);

	}

}
