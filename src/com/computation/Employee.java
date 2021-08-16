package com.computation;

public class Employee {
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	String companyName;
	 int workingDays;
	 int workingHrs;
	 int empRate;
	
	 public Employee(String companyName,int workingDays,int workingHrs,int empRate) {
		this.companyName=companyName;
		this.workingDays=workingDays;
		this.workingHrs=workingHrs;
		this.empRate=empRate;
	}
	public  void calculateWage() {
		int empHrs=0,totalHrs=0,totalDays=0;
		while(totalHrs<=workingHrs&&totalDays<workingDays) {
			totalDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
			case IS_PART_TIME:
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
				break;
				default:
					empHrs=0;
			}
			totalHrs=totalHrs+empHrs;
		}
		int totalWage=totalHrs*empRate;
		System.out.println("Total Emp Wage"+ totalWage);
	}
	
	
	@Override
	public String toString() {
		return "Employee [companyName=" + companyName + ", workingDays=" + workingDays + ", workingHrs=" + workingHrs
				+ ", empRate=" + empRate + "]";
	}
	public static void main(String[] args) {
		
		Employee tata=new Employee("TaTa",3,8,20);
		Employee morningStar=new Employee("MorningStar",3,8,20);

		tata.calculateWage();
		System.out.println(tata);
		morningStar.calculateWage();
		System.out.println(morningStar);
	}

}
