package com.entreprise.HRM.EmployeeManagement.repository;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface BemployeeRepo extends JpaRepository<Bemployees,Long> {
    public Optional<List<Bemployees>> findByFirstName(String firstname);
    public Optional<Bemployees> findByPhoneNo(String phoneNo);
    public Optional<List<Bemployees>> findByGender(String geneder);
    public Optional<Bemployees> findByEmail(String email);
    public Optional<List<Bemployees>> findByStatus(String status);
}
