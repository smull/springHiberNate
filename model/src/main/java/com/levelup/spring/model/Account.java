package com.levelup.spring.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by java on 18.04.2015.
 */
@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String password;

    public Account() {
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
