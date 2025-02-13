package com.entreprise.HRM.EmployeeManagement.repository;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bdesignation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BdesignationRepo extends JpaRepository<Bdesignation,Long> {
}
