package com.entreprise.HRM.EmployeeManagement.conttest;

import com.entreprise.HRM.EmployeeManagement.Models.payroll.salary_structure;
import com.entreprise.HRM.EmployeeManagement.service.salaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class payrollcontroller {
    @Autowired
    private salaryService salaryservice;

    @PutMapping("salary/{id}")
    public ResponseEntity<Object> addingsalary_structure(@PathVariable long id, @RequestBody salary_structure sal) {
        return new ResponseEntity<>(salaryservice.addSalary(id, sal), HttpStatus.OK);

    }
    @GetMapping("/salary/get")
    public ResponseEntity<Object> getsalary(){
        return new ResponseEntity<>(salaryservice.viewSalary(), HttpStatus.OK);
    }
}
