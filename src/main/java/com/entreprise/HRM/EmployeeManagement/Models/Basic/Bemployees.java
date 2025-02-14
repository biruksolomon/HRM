package com.entreprise.HRM.EmployeeManagement.Models.Basic;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
    @NotBlank(message = "FirstName can not be blank")
    private String firstName;
    @NotBlank(message = "LastName can not be blank")
    private String lastName;
    @NotNull(message = "Gender can not be null")
    private String gender;
    @Email
    @NotBlank(message = "Email Should be Valid")
    private String email;
    @Size(min = 10 , max = 20, message = "phone  number should between 15 and 20")
    private String phoneNo;
    @NotNull(message = "status should be valid")
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
