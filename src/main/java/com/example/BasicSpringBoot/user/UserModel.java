package com.example.BasicSpringBoot.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
//@NoArgsConstructor
//@AllArgsConstructor //auto generating constructor and Getter/Setter
@Entity
@Table(name = "users")

public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String username;
    private String password;
    private String message;

    public UserModel(){}

    public UserModel(int id, String name, String username, String password, String message) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.message = message;
    }

    public UserModel(int id, String name, String username, String password) {
        this(id, name, username, password, "None");
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
