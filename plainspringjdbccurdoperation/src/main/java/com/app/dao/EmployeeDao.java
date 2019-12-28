package com.app.dao;

import java.util.List;

import com.app.pojo.Employee;

public interface EmployeeDao {
     //curd operation
	//public void saverecordindatabase(Employee e);//save the record in database
	//public List<Employee> getAllEmployeefromDataBase();
	//public Employee getAllEmployeeBasedOnId(int empid);
	//public void deleterecordindatabase(int empid);
	public void updaterecordindatabase(Employee e);
}
