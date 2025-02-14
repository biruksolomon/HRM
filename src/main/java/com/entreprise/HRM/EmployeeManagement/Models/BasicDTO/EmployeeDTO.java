//package com.entreprise.HRM.EmployeeManagement.Models.BasicDTO;
//
//
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.sql.Date;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class EmployeeDTO {
//    private long id;
//    @NotBlank(message ="")
//    private String firstName;
//    private String lastName;
//    @NotNull(message="")
//    private String gender;
//    private String email;
//    private String phoneNo;
//    private String status;
//    private Date createdAt;
//    private Date updatedAt;
//
//    // Reference to related entities by their IDs
//    private Long departmentId;
//    private Long designationId;
//
//    // Optionally, you could include work history as a list of another DTO if needed
//    // private List<WorkHistoryDTO> workHistories;
//}
//
