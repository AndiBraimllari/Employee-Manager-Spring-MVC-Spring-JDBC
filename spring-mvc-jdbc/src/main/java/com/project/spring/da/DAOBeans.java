package com.project.spring.da;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.spring.model.Employee;

public class DAOBeans {
	EmployeeCrudOps emp;
	public DAOBeans(){
		ApplicationContext context = new ClassPathXmlApplicationContext("daobeans.xml");
		 emp = context.getBean("empDAOBean", EmployeeCrudOps.class);
		((ClassPathXmlApplicationContext)context).close();
	}
	public void create(String name, int salary){
		emp.create(name,salary);
	}
	public void update(int ID, int salary){
		emp.update(ID, salary);
	}
	public Employee read(int ID){
		return emp.read(ID);
	}
	public void delete(int ID){
		emp.delete(ID);
	}
	//public static void main(String[] args){	}
}
