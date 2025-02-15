package com.entreprise.HRM.EmployeeManagement.repository.BRepo;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bdepartements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BdepartemetRepo extends JpaRepository<Bdepartements,Long> {
    public Optional<List<Bdepartements>> findByName(String name);
}
