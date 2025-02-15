package com.entreprise.HRM.EmployeeManagement.conttest;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import com.entreprise.HRM.EmployeeManagement.service.BemployeeServ;
import jakarta.validation.Valid;
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
    public ResponseEntity<Object> add(@Valid @RequestBody Bemployees bemployees){
        return new ResponseEntity<>(bemployeeServ.addEmployee(bemployees), HttpStatus.OK);
    }

    @PostMapping("/adds")
    public ResponseEntity<Object> adds(@Valid @RequestBody List<Bemployees> bemployees){
        return new ResponseEntity<>(bemployeeServ.addEmployees(bemployees),HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getbyid( @PathVariable long id){
        return new ResponseEntity<>(bemployeeServ.getEmployee(id),HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<Object> getAll(){
        return new ResponseEntity<>(bemployeeServ.getEmployees(),HttpStatus.OK);
    }

    @GetMapping("/getbyname")
    //using firstname as a key and use value for search
    public ResponseEntity<Object> getbyname(@RequestParam String firstname){
        return new ResponseEntity<>(bemployeeServ.getEmployeebyname(firstname),HttpStatus.OK);
    }

    @GetMapping("/getbyphone")
    //using phoneNo as a  key and it searching without finished the value
    public ResponseEntity<Object> getbyphoneno( @RequestParam String phone){
        return new ResponseEntity<>(bemployeeServ.getEmployeebyphoneno(phone),HttpStatus.OK);
    }
    @GetMapping("/getbyemail")
    public ResponseEntity<Object> getbyemail( @RequestParam String email){
        return new ResponseEntity<>(bemployeeServ.getEmployeebyemail(email),HttpStatus.OK);
    }
    @GetMapping("/getbygender")
    public ResponseEntity<Object> getbygender(@RequestParam String gender){
        return new ResponseEntity<>(bemployeeServ.getEmployeebygender(gender),HttpStatus.OK);
    }
    @GetMapping("/getbystatus")
    public ResponseEntity<Object> getbystatus(@RequestParam String status){
        return new ResponseEntity<>(bemployeeServ.getEmployeebystatus(status),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
   public ResponseEntity<Object> delete(@PathVariable long id){
        return new ResponseEntity<>(bemployeeServ.deleteEmployee(id),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Object> update(@Valid @RequestBody Bemployees bemployees,@RequestParam long id){
        return new ResponseEntity<>(bemployeeServ.updateEmployee(bemployees,id),HttpStatus.OK);
    }
    @PatchMapping("/partial/{id}")
    public ResponseEntity<Object> partialUpdate(@PathVariable long id, @Valid @RequestBody Bemployees bemployees){
        return new ResponseEntity<>(bemployeeServ.partilaupadte(id,bemployees),HttpStatus.OK);
    }
}
