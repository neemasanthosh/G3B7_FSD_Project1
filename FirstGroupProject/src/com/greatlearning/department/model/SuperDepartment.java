package com.greatlearning.department.model;

public class SuperDepartment {
	
	public String departmentName;
	public String getTodaysWork;
	public String getWorkDeadline;
	public String isTodayAHoliday;
	
	public String departmentName() {
		departmentName = "Super Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		getTodaysWork = "No work as of now";
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		getWorkDeadline = "Nil";
		return getWorkDeadline;
	}
	
	public String isTodayAHoliday() {
		isTodayAHoliday = "Today is not a holiday";
		return isTodayAHoliday;
	}		

}
