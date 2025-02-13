package com.entreprise.HRM.EmployeeManagement.service;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import com.entreprise.HRM.EmployeeManagement.repository.BemployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BemployeeServ {

    @Autowired
    private BemployeeRepo bemployeeRepo;

    public void addEmployee(Bemployees bemployees){
        bemployeeRepo.save(bemployees);
    }
    public void addEmployees(List<Bemployees> bemployees){
        bemployeeRepo.saveAll(bemployees);
    }
    public void getEmployee(long id){
        bemployeeRepo.findById(id);
    }
    public void getEmployeebyname(String firstname){
        bemployeeRepo.findByFirstName(firstname);
    }
}
