package com.blumeindustries.BlumeWebpage.controller;

import com.blumeindustries.BlumeWebpage.model.User;
import com.blumeindustries.BlumeWebpage.services.interfaces.IUserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {


    @Autowired
    private IUserRegistration userRegistration;

    @PostMapping("/submit")
    public  User createuser(@RequestBody User user)
    {
        return  userRegistration.createUser(user);

    }

    @DeleteMapping("/delete")
    public void deleteUser(){userRegistration.deleteUser();}

    @GetMapping("/list")
    public List<User> listUser(){
        return  userRegistration.listUser();
    }

}
