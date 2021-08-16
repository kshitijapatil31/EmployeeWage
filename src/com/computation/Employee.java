package com.computation;
interface EmployeeBuilder{
	
	abstract void addEmployee(String companyName, int workingDays, int workingHrs, int empRate);
	
	public void computeEmpWage() ;
}
public class Employee implements EmployeeBuilder {
	
	
	
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	int noOfCompany=0;
	EmployeeWageBuilder employee[];
	
	public Employee() {
		employee=new EmployeeWageBuilder[5];
	}
	public void addEmployee(String companyName, int workingDays, int workingHrs, int empRate)  {
		employee[noOfCompany]=new EmployeeWageBuilder(companyName,workingDays, workingHrs,empRate);
		noOfCompany++;
	}
	
	public void computeEmpWage() {
		for(int i=0;i<noOfCompany;i++) {
			employee[i].setTotalEmpWage(this.computeEmpWage(employee[i]));
		System.out.println(employee[i]);
		}
	}
	
	public int computeEmpWage(EmployeeWageBuilder employeeWageBuilder) {
		int empHrs=0,totalHrs=0,totalDays=0;
		while(totalHrs<=employeeWageBuilder.workingHrs&&totalDays<employeeWageBuilder.workingDays) {
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
	
	
	return totalHrs*employeeWageBuilder.empRate;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Employee tata=new Employee();
		

		tata.addEmployee("MorningStar",3,8,20);
		tata.addEmployee("cdacMumbai",4,4,30);
		System.out.println(tata);
	
		tata.computeEmpWage();
	}

}
