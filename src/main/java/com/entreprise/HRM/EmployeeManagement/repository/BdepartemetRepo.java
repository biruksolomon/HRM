package com.entreprise.HRM.EmployeeManagement.repository;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bdepartements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BdepartemetRepo extends JpaRepository<Bdepartements,Long> {
}
