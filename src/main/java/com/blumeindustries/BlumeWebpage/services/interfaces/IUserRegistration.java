package com.blumeindustries.BlumeWebpage.services.interfaces;

import com.blumeindustries.BlumeWebpage.model.User;

import java.util.List;

public interface IUserRegistration {
    public User createUser(User user);
    public void deleteUser();
    public List <User> listUser();

}
