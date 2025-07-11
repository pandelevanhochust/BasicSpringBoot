package com.example.BasicSpringBoot.user;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("api/user")

public class UserController {

    @GetMapping("/")
    public List<UserModel> getUsers(){}

    @PostMapping("/")
    public Object createUsers(@RequestBody UserModel user){}

    @PutMapping("/{id}")
    public Object updateUser(@PathVariable int id,@RequestBody UserModel user){}

    @DeleteMapping("/{id}")
    public Object deleteUser(@PathVariable int id,@RequestBody UserModel user){}
}
