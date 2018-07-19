package com.project.spring.model;


public class Employee {
	public String name;
	public int salary;
	public Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	public Employee(){
		name = null;
		salary = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
