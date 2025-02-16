package com.entreprise.HRM.EmployeeManagement.service;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import com.entreprise.HRM.EmployeeManagement.Models.payroll.salary_structure;
import com.entreprise.HRM.EmployeeManagement.repository.BRepo.BemployeeRepo;
import com.entreprise.HRM.EmployeeManagement.repository.payrollRepo.salary_structureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class salaryService {

    @Autowired
    private salary_structureRepo salaryStructureRepo;

    @Autowired
    private BemployeeRepo bemployeeRepo;

    public salary_structure addSalary(long id, salary_structure sal) {
        if (sal == null) {
            throw new IllegalArgumentException("Salary structure cannot be null");
        }

        return bemployeeRepo.findById(id).map(emp -> {
            salary_structure salary = emp.getSalaryStructure();
            if (salary == null) {
                salary = new salary_structure();
                salary.setBemployees(emp); // Link salary to employee
                emp.setSalaryStructure(salary);
            }

            salary.setBaseSalary(sal.getBaseSalary());
            salary.setHouslyAllowance(sal.getHouslyAllowance());
            salary.setTaxDeduction(sal.getTaxDeduction());
            salary.setTransportAllowance(sal.getTransportAllowance());
            salary.setEffectiveDate(sal.getEffectiveDate());
            salary.setBemployees(emp);

            salaryStructureRepo.save(salary);
            bemployeeRepo.save(emp); // Save the updated employee

            return salary;
        }).orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }

    public List<salary_structure> viewSalary() {
        return salaryStructureRepo.findAll();
    }
}
