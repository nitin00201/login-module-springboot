package com.EmpManagement.login.EMP.service;

import com.EmpManagement.login.EMP.repository.UserRepository;
import com.EmpManagement.login.EMP.web.web.dto.UserRegistration;
import com.EmpManagement.login.EMP.model.User;


public interface UserService {
    User save(UserRegistration registration);
}
