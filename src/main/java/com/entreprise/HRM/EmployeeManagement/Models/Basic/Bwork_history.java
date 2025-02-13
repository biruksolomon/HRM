package com.entreprise.HRM.EmployeeManagement.Models.Basic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bwork_history")
public class Bwork_history {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String oldDescription;
    private String newDescription;
    private double oldSalary;
    private double newSalary;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Bemployees bemployees;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Bdepartements bdepartements;

    @ManyToOne
    @JoinColumn(name = "designation_id", referencedColumnName = "id")
    private Bdesignation bdesignation;
}
