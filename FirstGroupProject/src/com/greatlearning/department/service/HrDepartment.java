package com.greatlearning.department.service;

import com.greatlearning.department.model.SuperDepartment;

public class HrDepartment extends SuperDepartment{
	
	public String departmentName() {
		departmentName = "HR Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		getTodaysWork = "Fill today's timesheet and mark your attendance";
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}

	public String doActivity() {
		String doActivity = "team Lunch";
		return doActivity;
	}
	
}
