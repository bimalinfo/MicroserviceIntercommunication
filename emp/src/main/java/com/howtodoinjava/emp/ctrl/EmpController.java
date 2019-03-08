package com.howtodoinjava.emp.ctrl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.howtodoinjava.emp.vo.Employee;

@RestController
public class EmpController {

	protected Logger logger = Logger
			.getLogger(EmpController.class.getName());
	
	@RequestMapping("/api/emps")
	public List<Employee> allEmployees() {
		logger.info("emp-microservice all() invoked");
		Employee e1=new Employee();
		e1.setId("1");
		e1.setName("Bimal");
		e1.setDeptid("1");
		
		Employee e2=new Employee();
		e2.setId("2");
		e2.setName("Vimal");
		e2.setDeptid("2");
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(e1);
		emps.add(e2);
		logger.info("employee-microservice all() found: " + emps.size());
		return emps;
	}
	
	@RequestMapping("/api/emps/{deptid}")
	public List<Employee> employeesByDeptId(@PathVariable(value="deptid") String deptid) {
		logger.info("emp-microservice employeesByDeptId() invoked");
		Employee e1=new Employee();
		e1.setId("11");
		e1.setName("Bimal11");
		e1.setDeptid("11");
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(e1);
		logger.info("employee-microservice employeesByDeptId() found: " + emps.size());
		return emps;
	}
	
	//@RequestMapping("/api/emps")
	@PostMapping("/api/emps/create")
	public Employee createEmployees(@RequestBody Employee employee) {
		logger.info("emp-createEmployees invoked"+employee.getFullName());
		Employee emps=new Employee();
		emps=employee;
		emps.setName("Bimal333333333333");
		System.out.println("Created"+emps.getName());
		return emps;
	}
	
	@RequestMapping("/api/helo")
   public String getHeloString()
   {
		System.out.println("getHeloString is called........");
		return "Helo from Rest Service from emp microservice";
   }
}