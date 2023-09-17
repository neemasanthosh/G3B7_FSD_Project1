package com.greatlearning.department.driver;

import com.greatlearning.department.model.SuperDepartment;
import com.greatlearning.department.service.AdminDepartment;
import com.greatlearning.department.service.HrDepartment;
import com.greatlearning.department.service.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		SuperDepartment obj1 = new SuperDepartment();
		AdminDepartment obj2 = new AdminDepartment();
		HrDepartment obj3 = new HrDepartment();
		TechDepartment obj4 = new TechDepartment();
		
		System.out.println("Welcome to " + obj2.departmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to " + obj3.departmentName());
		System.out.println(obj3.doActivity());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to " + obj4.departmentName());
		System.out.println(obj4.getTodaysWork());
		System.out.println(obj4.getWorkDeadline());
		System.out.println(obj4.getTechStackInformation());
		System.out.println(obj1.isTodayAHoliday());
	}

}
