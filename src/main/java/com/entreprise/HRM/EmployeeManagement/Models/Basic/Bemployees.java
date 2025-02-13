package com.entreprise.HRM.EmployeeManagement.Models.Basic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "bemployees")
public class Bemployees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private String status;
    private Date createdAt;
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Bdepartements bdepartements;

    @ManyToOne
    @JoinColumn(name = "designation_id", referencedColumnName = "id")
    private Bdesignation bdesignation;

    @OneToMany(mappedBy = "bemployees", cascade = CascadeType.ALL)
    private List<Bwork_history> bworkHistories;
}
