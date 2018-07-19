package com.project.spring.da;

import java.sql.SQLException;

import javax.sql.DataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.Employee;

public class EmployeeCrud implements EmployeeCrudOps{
	private DataSource dataSource;
	public void setDataSource(DataSource ds){
		this.dataSource = ds;
	}
	@Override
	public void create(String name, int salary) {
		String query = "INSERT INTO employees(name, salary) VALUES(?, ?);";
		JdbcTemplate jdbcT = new JdbcTemplate(dataSource);
		Object[] values = new Object[]{name, salary};
		int res = jdbcT.update(query, values);
		if (res!=0){
			System.out.println("Creation of employee successful");
		} else{
			System.out.println("Failed to create new employee");
		}
	}
	@Override
	public Employee read(int ID) {
		String query = "SELECT name, salary from employees where id = ?";
		JdbcTemplate jdbcT = new JdbcTemplate(dataSource);
		
		Employee emp = jdbcT.queryForObject(query, new Object[]{ID}, new RowMapper<Employee>(){
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
				emp.setSalary(rs.getInt("salary"));
				emp.setName( rs.getString("name"));
				return emp;
			}});
		return emp;
	}
	@Override
	public void update(int ID, int salary) {
		String query = "UPDATE employees SET salary=? WHERE ID=?";
		JdbcTemplate jdbcT = new JdbcTemplate(dataSource);
		Object[] values = new Object[] {salary, ID};
		int res = jdbcT.update(query, values);
		if (res!=0){
			System.out.println("Successful update");
		} else{
			System.out.println("Failed to update");
		}
	}
	@Override
	public void delete(int ID) {
		String query = "DELETE FROM employees WHERE ID=?";
		JdbcTemplate jdbcT = new JdbcTemplate(dataSource);
		int res = jdbcT.update(query, ID);
		if(res!=0){
			System.out.println("Employee deleted");
		}else System.out.println("Employee could not be deleted");
	}
		
}
//	DataSource ds;
//	public EmployeeCrud(DataSource ds) {
//		this.ds = ds;
//	}

