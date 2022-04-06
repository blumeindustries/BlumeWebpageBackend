package com.blumeindustries.BlumeWebpage.services.implementation;

import com.blumeindustries.BlumeWebpage.model.User;
import com.blumeindustries.BlumeWebpage.repository.UserRepository;
import com.blumeindustries.BlumeWebpage.services.interfaces.IUserRegistration;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.*;


public class UserRegistration implements IUserRegistration {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user)
    {
        if(isAlreadyexist(user.getMobileNo())){
            return null;
        }

        user.setId(user.getMobileNo());
        user.setAge(ageclculator(user.getDob()));
        return userRepository.save(user);
    }

    public void deleteUser()
    {
        userRepository.deleteAll();
    }


    public List<User> listUser()
    {
        return userRepository.findAll();

    }


    private boolean isAlreadyexist(String aadharid){
        Optional<User> exictingUser = userRepository.findById(aadharid);
        return Objects.isNull(exictingUser);
    }

    public LocalDate dateInput(String userInput) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate date = LocalDate.parse(userInput, dateFormat);
        return date;
    }

    public  String ageclculator(String dob)
    {
        LocalDate birthday = dateInput(dob);
        LocalDate current= LocalDate.now();
        Period length= Period.between(birthday,current);
        return String.valueOf(length.getYears());
    }
}
