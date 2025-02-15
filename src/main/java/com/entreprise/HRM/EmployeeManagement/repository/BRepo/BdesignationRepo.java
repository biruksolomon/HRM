package com.entreprise.HRM.EmployeeManagement.repository.BRepo;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bdesignation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BdesignationRepo extends JpaRepository<Bdesignation,Long> {
    public Optional<List<Bdesignation>> findByTitle(String title);
}
