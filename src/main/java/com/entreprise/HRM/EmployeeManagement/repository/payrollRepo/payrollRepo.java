package com.entreprise.HRM.EmployeeManagement.repository.payrollRepo;

import com.entreprise.HRM.EmployeeManagement.Models.payroll.payroll;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface payrollRepo extends PagingAndSortingRepository<payroll, Long> {

}
