package com.example.BasicSpringBoot.user;

public class UserModel {
    private final int id;
    private String name;
    private String username;
    private String password;
    private String message;

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

}
