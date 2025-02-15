package com.entreprise.HRM.EmployeeManagement.Models.payroll;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;
import java.util.List;

//Contains details about the employee's salary breakdown.
@Entity
@Table(name = "salary")
public class salary_structure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull(message = "Salary can not be null")
    private double baseSalary;
    private double houslyAllowance;
    private double transportAllowance;
    private double taxDeduction;
    private Date effectiveDate;

    @OneToOne(cascade = CascadeType.ALL)
    private Bemployees bemployees;

}
