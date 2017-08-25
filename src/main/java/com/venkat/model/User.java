package com.venkat.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PASSWORD")
    private String password;

    @ManyToMany//this is the owning side
    @JoinTable(name="User_Role", joinColumns = {@JoinColumn(name="POST_ID")},
            inverseJoinColumns = {@JoinColumn(name="ROLE_ID")})
    private List<Role> roles = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
