package com.entreprise.HRM.EmployeeManagement.Models.Basic;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "bdesignations")
public class Bdesignation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull(message = "designation can not be null")
    private String title;

    @OneToMany(mappedBy = "bdesignation", cascade = CascadeType.ALL)
    private List<Bemployees> bemployees;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id") // Fix: One department has multiple designations
    private Bdepartements bdepartements;

    @OneToMany(mappedBy = "bdesignation", cascade = CascadeType.ALL)
    private List<Bwork_history> bworkHistories;
}
