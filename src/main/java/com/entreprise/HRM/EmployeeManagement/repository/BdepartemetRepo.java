package com.entreprise.HRM.EmployeeManagement.repository;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bdepartements;
import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bdesignation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface BdepartemetRepo extends JpaRepository<Bdepartements,Long> {
    public Optional<List<Bdepartements>> findByName(String departement);
}
