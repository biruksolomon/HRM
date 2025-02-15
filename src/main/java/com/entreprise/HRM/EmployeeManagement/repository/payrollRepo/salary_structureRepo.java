package com.entreprise.HRM.EmployeeManagement.repository.payrollRepo;

import com.entreprise.HRM.EmployeeManagement.Models.payroll.salary_structure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface salary_structureRepo extends JpaRepository<salary_structure, Long> {
}
