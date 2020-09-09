package az.maqa.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping(value = "/employees")
    public String employeesPage(){
        return "employees/employee.html";
    }

}
