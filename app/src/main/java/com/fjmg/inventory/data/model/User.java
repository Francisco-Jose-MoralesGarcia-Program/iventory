package com.fjmg.inventory.data.model;

public class User
{

    String email;
    String password;
    public User(String email, String password)
    {
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}