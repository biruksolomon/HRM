package com.entreprise.HRM.EmployeeManagement.Models.Basic;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bdepartments") // Fixed table name consistency
public class Bdepartements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String name;
    private String description;

    public Bdepartements(@NonNull String name, String description) {
        this.name = name;
        this.description = description;
    }

    @OneToMany(mappedBy = "bdepartements", cascade = CascadeType.ALL)
    private List<Bemployees> bemployees;

    @OneToMany(mappedBy = "bdepartements",cascade = CascadeType.ALL)
    private List<Bdesignation> bdesignations;

    @OneToMany(mappedBy = "bdepartements", cascade = CascadeType.ALL)
    private List<Bwork_history> bworkHistories;
}
