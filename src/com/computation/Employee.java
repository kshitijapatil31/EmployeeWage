package com.computation;

public class Employee {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int empRate=20;
	public static final int WORKING_DAYS=2;
	public static final int MAXS_WORKING_HRS=10;
	
	public int calculateWage(){
		double emp=Math.floor(Math.random()*10)%3;
		int empHrs=0;
		int empWage=0;
		if(emp==IS_FULL_TIME) {
			empHrs=8;
			empWage=empHrs*empRate;
		}else if(emp==IS_PART_TIME) {
			empHrs=4;
			empWage=empHrs*empRate;
		}else {
			empHrs=0;
			empWage=empHrs*empRate;
		}
		return empWage;
	}
	
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		int wage=employee.calculateWage();
		System.out.println("Employee wage : "+wage);
	System.out.println("Welcome to Employee Wage Computation");
	
	
	int totalEmpHrs=0;
	int empHrs=0;
	int totalWorkDays=0;
	while(totalEmpHrs<=MAXS_WORKING_HRS&&totalWorkDays<WORKING_DAYS) {
		 
	double empCheck=Math.floor(Math.random()*10)%3;
	totalWorkDays++;
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
	totalEmpHrs=totalEmpHrs+empHrs;
	int empWage=empHrs*empRate;
	System.out.println("Days="+totalWorkDays+"  Hrs="+totalEmpHrs+" wages"+empWage);

	}
	int totalEmpWage=totalEmpHrs*empRate;
	System.out.println("Total employee wage="+totalEmpWage);
	}

}
