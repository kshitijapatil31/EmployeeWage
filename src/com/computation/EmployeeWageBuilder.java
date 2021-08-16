package com.computation;

public class EmployeeWageBuilder {
	String companyName;
	 int workingDays;
	 int workingHrs;
	 int empRate;
	 int totalEmpWage;
	
	 
	public EmployeeWageBuilder(String companyName, int workingDays, int workingHrs, int empRate) {
		super();
		this.companyName = companyName;
		this.workingDays = workingDays;
		this.workingHrs = workingHrs;
		this.empRate = empRate;
		
	}
	
	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "EmployeeWageBuilder [companyName=" + companyName + ", workingDays=" + workingDays + ", workingHrs="
				+ workingHrs + ", empRate=" + empRate + ", totalEmpWage=" + totalEmpWage + "]";
	}

	
	 
	 
}
