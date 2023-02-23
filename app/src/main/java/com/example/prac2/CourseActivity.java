package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
        final String nameUser = arguments.get("userName").toString();
        String nameUserEnd = (nameUser.equals(""))? "User" : nameUser;

        courseActivityBinding.greetingMessage.setText("Hello, " + nameUserEnd);

        courseActivityBinding.pprofileButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (nameUser.equals(""))
                            returnActivity("You didn't enter a name!");
                        else
                            returnActivity("You have entered a name: " + nameUser);
                    }
                }
        );


    }

    private void returnActivity(String message) {

        Intent data = new Intent();
        data.putExtra(MainActivity.ACCESS_MESSAGE, message);
        setResult(RESULT_OK, data);
        finish();
    }

}