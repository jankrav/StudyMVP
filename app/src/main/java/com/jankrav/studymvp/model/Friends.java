package com.jankrav.studymvp.model;

import java.util.ArrayList;

public class Friends {

    private ArrayList<User> friendsList = new ArrayList<>();

    private User user;
    public Friends(User user){
        this.user = user;
    }

    public ArrayList<User> getFriendsList() {
        return friendsList;
    }



    public void addFriend(User user){
        friendsList.add(user);

    }

    public void deleteFriend(User user){
        friendsList.remove(user);

    }
    public int getQuality(){
        return friendsList.size();
    }

}
