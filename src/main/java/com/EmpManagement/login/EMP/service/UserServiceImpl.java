package com.EmpManagement.login.EMP.service;

import com.EmpManagement.login.EMP.model.Role;
import com.EmpManagement.login.EMP.model.User;
import com.EmpManagement.login.EMP.repository.UserRepository;
import com.EmpManagement.login.EMP.web.web.dto.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistration registration) {
        User user = new User(registration.getFirstName(), registration.getLastName(), registration.getEmail(), registration.getPassword(), Arrays.asList(new Role("Role_User")));
        return userRepository.save(user);
    }
}
