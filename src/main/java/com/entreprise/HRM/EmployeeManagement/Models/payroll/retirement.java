package com.entreprise.HRM.EmployeeManagement.Models.payroll;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class retirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String retirementplan;//type of the retirement plan.
    private String contribution;// Employee’s contribution amount.
    private String employeeMach;//Amount the employer contributes as a match.
    private double currentbalance;//Current accumulated balance in the retirement account

    //one-one or one-many based on business logic
    @OneToMany(mappedBy = "retirement" ,cascade = CascadeType.ALL)
    private List<Bemployees> bemployees;
}
