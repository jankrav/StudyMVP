package com.jankrav.studymvp.model;

import java.util.ArrayList;

public class User {
    private int id = this.hashCode();
    private String name;
    private int age;
    private String hobby;
    private User inLove;
    private String status;
    private ArrayList<Friends> friendsList;

    public User(String name, int age, String hobby, User inLove, String status){
        setName(name);
        setAge(age);
        setHobby(hobby);
        setInLove(inLove);
        setStatus(status);
    }
    public User(User user){
        setName(user.getName());
        setAge(user.getAge());
        setHobby(user.getHobby());
        setInLove(user.getInLove());
        setStatus(user.getStatus());
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public User getInLove() {
        return inLove;
    }

    public void setInLove(User inLove) {
        this.inLove = inLove;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Friends> getFriendsList() {
        return friendsList;
    }

}
