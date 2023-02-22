package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final private String TAG = this.getLocalClassName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameOfCompany = (TextView)findViewById(R.id.company_name);
        TextView enterName = (TextView)findViewById(R.id.entering_mes);
        EditText enteringName = (EditText) findViewById(R.id.enter_name);
        Button notRegister = (Button)findViewById(R.id.anon);
        ImageView logo = (ImageView)findViewById(R.id.logo);
        Button googleRegistration = (Button)findViewById(R.id.google);

        nameOfCompany.setText(R.string.someName);
        logo.setImageResource(R.drawable.ssssssssssssssssssss);
        notRegister.setOnClickListener(new View.OnClickListener() { //программный способ установки слушателя
            @Override
            public void onClick(View v) {
                enterName.setVisibility(View.VISIBLE);
                enteringName.setVisibility(View.VISIBLE);
            }
        });
    }

    public void continueWithGoogle(View view) { //декларативный способ установки слушателя
        Log.i(TAG, "Once there will be a normal registration. But not today.");
    }
}