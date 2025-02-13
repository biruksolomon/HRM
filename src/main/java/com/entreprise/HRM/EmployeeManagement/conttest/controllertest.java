package com.entreprise.HRM.EmployeeManagement.conttest;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import com.entreprise.HRM.EmployeeManagement.repository.BemployeeRepo;
import com.entreprise.HRM.EmployeeManagement.service.BemployeeServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controllertest {
    @Autowired
    private BemployeeServ bemployeeServ;


    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody Bemployees bemployees){
        return new ResponseEntity<>(bemployeeServ.addEmployee(bemployees), HttpStatus.OK);
    }

    @PostMapping("/adds")
    public ResponseEntity<Object> adds(@RequestBody List<Bemployees> bemployees){
        return new ResponseEntity<>(bemployeeServ.addEmployees(bemployees),HttpStatus.OK);
    }
    @GetMapping("get/{id}")
    public ResponseEntity<Object> getbyid(@PathVariable long id){
        return new ResponseEntity<>(bemployeeServ.getEmployee(id),HttpStatus.OK);
    }

    @GetMapping("get")
    public ResponseEntity<Object> getAll(){
        return new ResponseEntity<>(bemployeeServ.getEmployees(),HttpStatus.OK);
    }

    @GetMapping("get/name")
    //using firstname as a key and use value for search
    public ResponseEntity<Object> getbyname(@RequestBody String name){
        return new ResponseEntity<>(bemployeeServ.getEmployeebyname(name),HttpStatus.OK);
    }

    @GetMapping("get/phone")
    //using phoneNo as a  key and it searching without finished the value
    public ResponseEntity<Object> getbyphoneno(@RequestBody String phone){
        return new ResponseEntity<>(bemployeeServ.getEmployeebyphoneno(phone),HttpStatus.OK);
    }
    @GetMapping("get/email")
    public ResponseEntity<Object> getbyemail(@RequestBody String email){
        return new ResponseEntity<>(bemployeeServ.getEmployeebyemail(email),HttpStatus.OK);
    }
    @GetMapping("get/gender")
    public ResponseEntity<Object> getbygender(@RequestBody String gender){
        return new ResponseEntity<>(bemployeeServ.getEmployeebygender(gender),HttpStatus.OK);
    }
    @GetMapping("get/status")
    public ResponseEntity<Object> getbystatus(@RequestBody String status){
        return new ResponseEntity<>(bemployeeServ.getEmployeebystatus(status),HttpStatus.OK);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Object> deletebyid(@PathVariable long id){
        bemployeeServ.deletebyid(id);
        return new ResponseEntity<>("Deleted Sussussfully" ,HttpStatus.OK);
    }
}
