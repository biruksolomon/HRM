package com.entreprise.HRM.EmployeeManagement.service;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import com.entreprise.HRM.EmployeeManagement.Models.payroll.salary_structure;
import com.entreprise.HRM.EmployeeManagement.repository.BRepo.BemployeeRepo;
import com.entreprise.HRM.EmployeeManagement.repository.payrollRepo.salary_structureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class salaryService {
    @Autowired
    salary_structureRepo salaryStructureRepo;
    @Autowired
    BemployeeRepo bemployeeRepo;

    public salary_structure addSalary(long id, salary_structure sal) {
        if(bemployeeRepo.findById(id).isPresent()){
            Bemployees emp = bemployeeRepo.findById(id).get();
            salary_structure salary = new salary_structure();
            salary.setBaseSalary(sal.getBaseSalary());
            salary.setHouslyAllowance(sal.getHouslyAllowance());
            salary.setTaxDeduction(sal.getTaxDeduction());
            salary.setTransportAllowance(sal.getTransportAllowance());
            salary.setEffectiveDate(sal.getEffectiveDate());
            emp.setSalaryStructure(salary);
            //salaryStructureRepo.save(salary);
            bemployeeRepo.save(emp);
        }
        else return null;

        return salaryStructureRepo.save(sal);
    }
}
