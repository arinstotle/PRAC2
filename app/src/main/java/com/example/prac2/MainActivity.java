package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.example.prac2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private String username;
    static final String ACCESS_MESSAGE="ACCESS_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(
                getLayoutInflater()
        );
        setContentView(binding.getRoot());

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.mainlayout,
                            RegistrationFragment.class, null)
                    .commit();
        }

    }
}