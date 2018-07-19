package com.project.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.spring.da.*;
import com.project.spring.model.*;
@Controller
public class HomeController {
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String add(@RequestParam(name="add-name") String name, 
			@RequestParam(name="add-salary") int salary, Model model) {
		System.out.println("Create Page Requested");
		new DAOBeans().create(name, salary);
		model.addAttribute("addedEmpName", name);
		model.addAttribute("addedEmpSalary", salary);
		return "added";
	}
	@RequestMapping(value = "/read", method = RequestMethod.POST)
	public String read(@RequestParam(name="read-id") int ID, Model model) {
		System.out.println("Read Page Requested");
		DAOBeans dao = new DAOBeans();
		Employee emp = dao.read(ID);
		model.addAttribute("readName", emp.getName());
		model.addAttribute("readSalary", emp.getSalary());
		return "read";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@RequestParam(name="update-id") int ID, 
			@RequestParam(name="update-salary") int salary, Model model) {
		System.out.println("Update Page Requested");
		new DAOBeans().update(ID, salary);
		model.addAttribute("updatedSalary", salary);
		model.addAttribute("ID", ID);
		return "updated";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@RequestParam(name="delete-id") int ID, Model model) {
		System.out.println("Delete Page Requested");
		new DAOBeans().delete(ID);
		model.addAttribute("ID", ID);
		return "deleted";
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String home(Model model) {
		return "home";
	}

}