package com.jankrav.studymvp.presenter;


import com.jankrav.studymvp.model.User;
import com.jankrav.studymvp.view.MainView;

public class FacebookPresenter implements Presenter {

    private User user;
    private MainView view;

    public FacebookPresenter(MainView view) {
        this.view = view;
    }


    @Override
    public void addUserInfo(User user) {
        this.user = new User(user);
    }

    @Override
    public void addFriendInfo(User user) {

    }
}
