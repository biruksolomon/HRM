package com.entreprise.HRM.EmployeeManagement.Models.Basic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "bdesignations")
public class Bdesignation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    @OneToMany(mappedBy = "bdesignation", cascade = CascadeType.ALL)
    private List<Bemployees> bemployees;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id") // Fix: One department has multiple designations
    private Bdepartements bdepartements;

    @OneToMany(mappedBy = "bdesignation", cascade = CascadeType.ALL)
    private List<Bwork_history> bworkHistories;
}
