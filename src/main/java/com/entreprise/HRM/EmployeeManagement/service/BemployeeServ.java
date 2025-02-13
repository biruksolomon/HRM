package com.entreprise.HRM.EmployeeManagement.service;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import com.entreprise.HRM.EmployeeManagement.repository.BemployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.apache.catalina.security.SecurityUtil.remove;

@Service
public class BemployeeServ {
    @Autowired
    private BemployeeRepo bemployeeRepo;


    public Bemployees addEmployee(Bemployees bemployees){
        return bemployeeRepo.save(bemployees);
    }

    public List<Bemployees> addEmployees(List<Bemployees> bemployees){
        return bemployeeRepo.saveAll(bemployees);
    }
    public Optional<Bemployees> getEmployee(long id){
       return  bemployeeRepo.findById(id);
    }
    public List<Bemployees> getEmployees(){
        return bemployeeRepo.findAll();
    }
    public Optional<List<Bemployees>> getEmployeebyname(String firstname){
       return bemployeeRepo.findByFirstName(firstname);
    }
    public Optional<Bemployees> getEmployeebyphoneno(String phoneno){
       return bemployeeRepo.findByPhoneNo(phoneno);
    }
    public Optional<Bemployees> getEmployeebyemail(String email){
        return bemployeeRepo.findByEmail(email);
    }
    public Optional<List<Bemployees>> getEmployeebystatus(String status){
        return bemployeeRepo.findByStatus(status);
    }
    public Optional<List<Bemployees>> getEmployeebygender(String gender){
       return bemployeeRepo.findByGender(gender);
    }
// Need more Maintanance
    public void deletebyid(long id) {
        if (!bemployeeRepo.existsById(id)){
            bemployeeRepo.deleteById(id);
        }
    }

}
