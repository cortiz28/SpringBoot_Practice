package com.java.practice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "users_table")
public class Users {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private int mobile_num;
    private String password;
    private boolean status;

}
