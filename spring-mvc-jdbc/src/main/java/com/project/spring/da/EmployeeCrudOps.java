package com.project.spring.da;
import com.project.spring.model.*;

public interface EmployeeCrudOps {
	public void create(String name, int salary);
	public void update(int ID, int salary);
	public Employee read(int ID);
	public void delete(int ID);
	
}
