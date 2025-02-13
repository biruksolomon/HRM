package com.entreprise.HRM.EmployeeManagement.repository;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bwork_history;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bwork_historyRepo extends JpaRepository<Bwork_history,Long> {
}
