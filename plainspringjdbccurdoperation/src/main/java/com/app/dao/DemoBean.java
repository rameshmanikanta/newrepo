package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.pojo.Employee;
@Component
public class DemoBean {
	@Autowired
	private EmployeeDao dao;
 /* public void insertrecordbasedondemobean(int empid,String ename,int esal,String email,String password)
  {
	  Employee e=new Employee();
	           e.setEmpid(empid);
	           e.setEname(ename);
	           e.setEsal(esal);
	           e.setEmail(email);
	           e.setPassword(password);
	          
	    dao.saverecordindatabase(e);
  }
	public List<Employee> getAllEmployee()
	{
		return dao.getAllEmployeefromDataBase();
	}
	public Employee GetEmployee(int empid)
	{
		return dao.getAllEmployeeBasedOnId(empid);
	}*/
	/*public void deleterecorddemobean(int empid)
	{
		dao.deleterecordindatabase(empid);
	}*/
	public void update32(int empid,String ename,int esal,String email,String password)
	{
		Employee e=new Employee();
		         e.setEmpid(empid);
		         e.setEname(ename);
		         e.setEsal(esal);
		         e.setEmail(email);
		         e.setPassword(password);
		dao.updaterecordindatabase(e);
	}
}


