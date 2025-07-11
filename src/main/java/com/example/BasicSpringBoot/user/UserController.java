package com.example.BasicSpringBoot.user;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public List<UserModel> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserModel getUser(@PathVariable int id){
        return userService.getUserById(id);
    }

    @PostMapping("/")
    public Object createUsers(@RequestBody UserModel user){
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public Object updateUser(@PathVariable int id,@RequestBody UserModel user){
        return userService.updateUser(id,user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        try{
            userService.deleteUser(id);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Delete user successfully");
    }
}
