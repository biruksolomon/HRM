package com.entreprise.HRM.EmployeeManagement.Models.payroll;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

//health insurance, bonus
@Entity
@Table(name = "benefit")
public class employee_benefit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String benefit_name;
    private double benefit_amount;
    private String benefit_status;
    private Date effective_date;


    @OneToMany(mappedBy = "benefit",cascade = CascadeType.ALL)
    private List<Bemployees> bemployees;
}
