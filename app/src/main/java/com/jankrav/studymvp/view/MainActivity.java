package com.jankrav.studymvp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import com.jankrav.studymvp.R;

import com.jankrav.studymvp.presenter.FacebookPresenter;
import com.jankrav.studymvp.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements MainView{
    private Presenter presenter;
    private EditText name, age, hobby, inLove, status;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new FacebookPresenter(this);
    }

    public void addUserInfo(View view) {

//        presenter.addUserInfo();
    }

    @Override
    public void updateFriendsList() {

    }

}
