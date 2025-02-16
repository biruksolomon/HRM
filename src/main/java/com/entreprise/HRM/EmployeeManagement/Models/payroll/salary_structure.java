package com.entreprise.HRM.EmployeeManagement.Models.payroll;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;
@Getter
@Setter
//Contains details about the employee's salary breakdown.
@Entity
@Table(name = "salary")
public class salary_structure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double baseSalary;
    private double houslyAllowance;
    private double transportAllowance;
    private double taxDeduction;
    private Date effectiveDate;

    @OneToOne
    @JsonBackReference // Prevent recursion
    @JoinColumn(name = "employee_id", referencedColumnName = "id", unique = true)
    private Bemployees bemployees;
}
