package vn.edu.vtiacademy.vtiassgin5.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DepartmentController {
    @GetMapping
    public String getAllDepartment(){
        return "Hello";
    }
}
