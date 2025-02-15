package com.entreprise.HRM.EmployeeManagement.service;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import com.entreprise.HRM.EmployeeManagement.Models.payroll.payroll;
import com.entreprise.HRM.EmployeeManagement.Models.payroll.salary_structure;
import com.entreprise.HRM.EmployeeManagement.repository.BRepo.BemployeeRepo;
import com.entreprise.HRM.EmployeeManagement.repository.payrollRepo.payrollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class payrollservice {

    @Autowired
    private payrollRepo payrollRepo;
    @Autowired
    private BemployeeRepo bemployeeRepo;

    private Bemployees bemployees;
   salary_structure salaryStructure = new salary_structure();



    public payroll payroll(

            String method,
            boolean status,
            Date monthdate
    ){

        payroll payrollobj = new payroll();
        List<Bemployees> bemployees = bemployeeRepo.findAll();
        for(Bemployees b : bemployees){
            long id =b.getId();
           Optional<Bemployees> emp= bemployeeRepo.findById(id);
           Bemployees bemp = emp.get();
           double basesalary= bemp.getSalaryStructure().getBaseSalary();
           double tax =basesalary*0.1;//10% tax
           double retirement = basesalary*0.05;// 5% retirement
           double netsalary = basesalary-tax-retirement;



            payrollobj.setNetsalary(netsalary);
            payrollobj.setGrosssalary(basesalary);
            payrollobj.setDeduction(retirement-tax);
            payrollobj.setProccessedAt(Date.valueOf(LocalDate.now()));


            // form admin

            payrollobj.setPaymentmethod(method);
            payrollobj.setPaymentstatus(status);
            //payroll.setEmployees();
            payrollobj.setSalarymonth(monthdate);

            bemp.setPayroll(payrollobj);


        }
        return payrollRepo.save(payrollobj);


    };

}
