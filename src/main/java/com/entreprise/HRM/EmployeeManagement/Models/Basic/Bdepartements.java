package com.entreprise.HRM.EmployeeManagement.Models.Basic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "bdepartments") // Fixed table name consistency
public class Bdepartements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "bdepartements", cascade = CascadeType.ALL)
    private List<Bemployees> bemployees;

    @OneToMany(mappedBy = "bdepartements",cascade = CascadeType.ALL)
    private List<Bdesignation> bdesignations;

    @OneToMany(mappedBy = "bdepartements", cascade = CascadeType.ALL)
    private List<Bwork_history> bworkHistories;
}
