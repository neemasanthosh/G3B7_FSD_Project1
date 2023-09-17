package com.greatlearning.department.service;

import com.greatlearning.department.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		departmentName = "Tech Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		getTodaysWork = "Complete coding of module 1";
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}

	public String getTechStackInformation() {
		String getTechStackInformation = "core Java";
		return getTechStackInformation;
	}

}
