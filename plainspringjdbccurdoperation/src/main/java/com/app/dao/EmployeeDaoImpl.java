package com.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.app.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	    @Autowired
         private JdbcTemplate jt;
	/*public void saverecordindatabase(Employee e) {
              jt.update("insert into employee values("+e.getEmpid()+",'"+e.getEname()+"',"+e.getEsal()+",'"+e.getEmail()+"','"+e.getPassword()+"')");
	}		public List<Employee> getAllEmployeefromDataBase() {
			      return jt.query("select * from employee",new ResultSetExtractor<List<Employee>>() {

					public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<Employee> emplist=new ArrayList<Employee>();
								{
							           while(rs.next())
							           {
							        	    Employee e=new Employee();
							        	             e.setEmpid(rs.getInt(1));
							        	             e.setEname(rs.getString(2));
							        	             e.setEsal(rs.getInt(3));
							        	             e.setEmail(rs.getString(4));
							        	             e.setPassword(rs.getString(5));
							        	              emplist.add(e);
							        	            
							           }//while
							                   
								}//addinf the emplist to arraylist
						return emplist;//return the extract the data resultset 
					}
			    	  
			    	  
			      });
		}

		public Employee getAllEmployeeBasedOnId(int empid) {
			       
			                  return jt.queryForObject("select empid,ename,esal,email,password from employee where empid=?",new Object[] {empid},new MyRowMapper());
			}
   private static class MyRowMapper implements RowMapper<Employee>
   {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		    Employee e=new Employee();
		             e.setEmpid(rs.getInt(1));
		             e.setEname(rs.getString(2));
		             e.setEsal(rs.getInt(3));
		             e.setEmail(rs.getString(4));
		             e.setPassword(rs.getString(5));
		             
		return e;
	}
	   
   }*/

		public void updaterecordindatabase(Employee e) {
			jt.update("update employee set ename='"+e.getEname()+"',esal="+e.getEsal()+",email='"+e.getEmail()+"',password='"+e.getPassword()+"' where empid="+e.getEmpid()+"");
			
		}

		/*public void deleterecordindatabase(int empid) {
		  jt.update("delete from employee where empid="+empid+"");
		  		
			
		}*/
	    

}
