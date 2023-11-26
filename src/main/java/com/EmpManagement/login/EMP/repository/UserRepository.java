package com.EmpManagement.login.EMP.repository;

import com.EmpManagement.login.EMP.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
