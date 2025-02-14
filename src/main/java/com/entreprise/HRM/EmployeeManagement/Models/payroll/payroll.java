package com.entreprise.HRM.EmployeeManagement.Models.payroll;

import com.entreprise.HRM.EmployeeManagement.Models.Basic.Bemployees;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

//Records payroll details for each salary period
@Entity
@Table(name = "payroll")
public class payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date salarymonth;
    private double grosssalary;
    private double netsalary;
    private double deduction;
    private String paymentstatus;
    private String paymentmethod;
    private Date proccessedAt;

    @OneToMany(mappedBy = "payroll" ,cascade = CascadeType.ALL)
    private List<Bemployees> employees;

}
