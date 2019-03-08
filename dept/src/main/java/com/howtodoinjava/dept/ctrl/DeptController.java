package com.howtodoinjava.dept.ctrl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.dept.vo.Department;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class DeptController {

	protected Logger logger = Logger
			.getLogger(DeptController.class.getName());
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/emps/{deptid}")
	public Department employeesById() {
		logger.info("dept-microservice employeesById() invoked");
		List<Department> depts = new ArrayList<Department>();
		Department dept=new Department();
		//List<Object> emps=restTemplate.getForObject("http://emp-microservice/emps/1", List.class);
		List<Object> emps=restTemplate.getForObject("http://10.140.225.14:2222/emps/1", List.class);
		dept.setEmps(emps);
		logger.info("dept-microservice all() found: " + depts);
		return dept;
	}
}