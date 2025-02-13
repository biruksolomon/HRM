package com.entreprise.HRM.EmployeeManagement.repository;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BemployeeRepo extends JpaRepository<Bemployees,Long> {
    public Optional<List<Bemployees>> findByFirstName(String firstname);
    public Optional<List<Bemployees>> findByPhoneNo(String phoneNo);
    public Optional<List<Bemployees>> findByEmail(String email);
    public Optional<List<Bemployees>> findByStatus(String status);
}
