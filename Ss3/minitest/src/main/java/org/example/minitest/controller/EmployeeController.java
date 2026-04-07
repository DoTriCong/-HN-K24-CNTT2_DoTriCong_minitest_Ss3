package org.example.minitest.controller;

import org.example.minitest.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String showEmployeeList(Model model) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee(1, "Do Tri Cong", "Dao tao", 12000.0));
        employees.add(new Employee(2, "Bui Thai Son", "Dao tao", 8500.0));
        employees.add(new Employee(3, "Nguyen Quang Huy", "Dao tao", 15000.0));
        employees.add(new Employee(4, "Vu Dinh Kien", "Dao tao", 7500.0));
        employees.add(new Employee(5, "Nguyen Duong Phuong Trang", "Dao tao", 9500.0));
        
        model.addAttribute("employees", employees);
        
        return "employee-list";
    }
}
