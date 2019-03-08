package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.employee.Employee;
 
@RestController
@RequestMapping("/employee")
public class EmployeeController
{
   @RequestMapping("/")
    public List<Employee> getEmployees()
    {
      List<Employee> employeesList = new ArrayList<Employee>();
      employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
      return employeesList;
    }
   
   @RequestMapping("/helo")
   public String getHeloString()
   {
     return "Helo from Rest Service";
   }
}