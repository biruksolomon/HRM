package com.entreprise.HRM.EmployeeManagement.service;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bdepartements;
import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bdesignation;
import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import com.entreprise.HRM.EmployeeManagement.repository.BRepo.BdepartemetRepo;
import com.entreprise.HRM.EmployeeManagement.repository.BRepo.BdesignationRepo;
import com.entreprise.HRM.EmployeeManagement.repository.BRepo.BemployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BemployeeServ {
    @Autowired
    private BemployeeRepo bemployeeRepo;

    @Autowired
    private BdepartemetRepo bdepartemetRepo;

    @Autowired
    private BdesignationRepo bdesignationRepo;


    public Bemployees addEmployee(Bemployees bemployees) {
        return bemployeeRepo.save(bemployees);
    }



    public List<Bemployees> addEmployees(List<Bemployees> bemployees) {
        return bemployeeRepo.saveAll(bemployees);
    }

    public Optional<Bemployees> getEmployee(long id) {
        return bemployeeRepo.findById(id);
    }

    public List<Bemployees> getEmployees() {
        return bemployeeRepo.findAll();
    }

    public Optional<List<Bemployees>> getEmployeebyname(String firstname) {
        return bemployeeRepo.findByFirstName(firstname);
    }

    public Optional<Bemployees> getEmployeebyphoneno(String phoneno) {
        return bemployeeRepo.findByPhoneNo(phoneno);
    }

    public Optional<Bemployees> getEmployeebyemail(String email) {
        return bemployeeRepo.findByEmail(email);
    }

    public Optional<List<Bemployees>> getEmployeebystatus(String status) {
        return bemployeeRepo.findByStatus(status);
    }

    public Optional<List<Bemployees>> getEmployeebygender(String gender) {
        return bemployeeRepo.findByGender(gender);
    }

    // Need more Maintanance
    public boolean deleteEmployee(long id) {
        if (bemployeeRepo.existsById(id)) {
            bemployeeRepo.deleteById(id);
            return true;
        } else return false;
    }

    //full update  ADMIN Role
    public Bemployees updateEmployee(Bemployees bemployees, long id) {
        if (bemployeeRepo.findById(id).isPresent()) {
            Bemployees emp = new Bemployees();
            emp.setId(id);
            emp.setFirstName(bemployees.getFirstName());
            emp.setLastName(bemployees.getLastName());
            emp.setPhoneNo(bemployees.getPhoneNo());
            emp.setEmail(bemployees.getEmail());
            emp.setGender(bemployees.getGender());
            emp.setStatus(bemployees.getStatus());
            return bemployeeRepo.save(emp);
        } else return null;
    }

    //Partial update User Role
    public Bemployees partilaupadte(long id, Bemployees bemployees) {
        if (bemployeeRepo.findById(id).isPresent()) {
            Bemployees emp = new Bemployees();
            // emp.setStatus(bemployees.getStatus());
            emp.setFirstName(bemployees.getFirstName());
            emp.setLastName(bemployees.getFirstName());
            emp.setPhoneNo(bemployees.getPhoneNo());
            emp.setEmail(bemployees.getEmail());
            emp.setGender(bemployees.getGender());
            return bemployeeRepo.save(emp);
        } else return null;

    }

    public List<Bdepartements> adddepartemnet(List<Bdepartements> departemnet) {
        return bdepartemetRepo.saveAll(departemnet);
    }
    public List<Bdesignation> adddesignation(List<Bdesignation> designation) {
        return bdesignationRepo.saveAll(designation);
    }
}
