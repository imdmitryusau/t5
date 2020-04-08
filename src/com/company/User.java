package com.company;

public class User{
    private String name;
    private String lastname;
    private String email;
    private long password;
    private UserType who;


    public User(String name, String lastname, String email, long password, UserType who) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.who=UserType.USER;
    }

    public User(String email, UserType who) {
        this.email = email;
        this.who =UserType.GUEST;
    }

    public String getEmail() {
        return email;
    }

    public UserType getWho() {
        return who;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public long getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public void setWho(UserType who) {
        this.who = who;
    }
}
