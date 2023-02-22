package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prac2.databinding.CourseActivityBinding;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CourseActivityBinding courseActivityBinding = CourseActivityBinding.inflate(
                getLayoutInflater()
        );

        setContentView(courseActivityBinding.getRoot());

        Bundle arguments = getIntent().getExtras();
        String nameUser = arguments.get("userName").toString();
        nameUser = (nameUser.equals(""))? "User" : nameUser;

        courseActivityBinding.greetingMessage.setText("Hello, " + nameUser);
    }
}