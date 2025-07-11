package com.example.BasicSpringBoot.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor //Ignore the constructor for UserService

public class UserService {

    private final UserRepository userRepo;

//    public UserService(UserRepository userRepo, UserRepository userRepo1) {
//        this.userRepo = userRepo1;
//    }

    public List<UserModel> getAllUsers(){
        return userRepo.findAll();
    }

    public UserModel getUserById(Integer id){
        Optional<UserModel> userFound = userRepo.findById(id);
        if(userFound.isPresent()){
            System.out.printf("User found with id %d%n",id);
            return userFound.get();
        }
        return null;
    }

    public UserModel createUser(UserModel userModel){
        return userRepo.save(userModel);
    }

    public UserModel updateUser(Integer id, UserModel userModel) {
        Optional<UserModel> optionalUser = userRepo.findById(id);
        if (optionalUser.isPresent()) {
            UserModel userFound = optionalUser.get();
            userFound.setName(userModel.getName());
            userFound.setUsername(userModel.getUsername());
            userFound.setPassword(userModel.getPassword());
            userFound.setMessage(userModel.getMessage());
            return userRepo.save(userFound);
        } else {
            return null;
        }
    }


    public  void deleteUser(Integer id){
        userRepo.deleteById(id);
    }
}
