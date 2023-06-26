package com.example.ems.login.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="dpt_id")
    private long dpt_id;

    @Column(name="dpt_name")
    private String dpt_name;
    public Department(){

    }

    public Department(long dpt_id, String dpt_name) {
        this.dpt_id = dpt_id;
        this.dpt_name = dpt_name;
    }


    public Department(String dpt_name) {
        this.dpt_name=dpt_name;
    }
}