package com.EmpManagement.login.EMP.model;

import jakarta.persistence.*;

import java.util.Collection;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Firstname;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;

    public User(String firstname, String lastName, String email, String password, Collection<Role> roles) {
        Firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public User() {
    }
@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
@JoinTable(

        name = "users_roles",
        joinColumns = @JoinColumn(
                name = "user_id",referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(
                name = "role_id",referencedColumnName = "id"))
    private Collection<Role> roles;
}
