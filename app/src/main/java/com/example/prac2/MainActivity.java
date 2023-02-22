package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameOfCompany = (TextView)findViewById(R.id.company_name);
        Button notRegister = (Button)findViewById(R.id.anon);
        ImageView logo = (ImageView)findViewById(R.id.logo);
        Button googleRegistration = (Button)findViewById(R.id.google);

        nameOfCompany.setText(R.string.someName);
        logo.setImageResource(R.drawable.ssssssssssssssssssss);

    }
}