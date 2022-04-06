package com.blumeindustries.BlumeWebpage.config;


import com.blumeindustries.BlumeWebpage.services.implementation.UserRegistration;
import com.blumeindustries.BlumeWebpage.services.interfaces.IUserRegistration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public IUserRegistration userRegistration(){
        return  new UserRegistration();
    }


}
