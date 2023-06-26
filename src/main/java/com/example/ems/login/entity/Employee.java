package com.example.ems.login.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email_address", nullable = false)
    private String emailId;
    @ManyToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="department")
    private Department department;




    public Employee(Department department) {
        this.department = department;
    }

    public Employee(){

    }

    public Employee(String firstName, String lastName, String emailId,String password) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;

    }


}

