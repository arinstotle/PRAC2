package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prac2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    final private String TAG = "Main Activity";
    private String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(
                getLayoutInflater()
        );
        setContentView(binding.getRoot());
        // setContentView(R.layout.activity_main);

        binding.companyName.setText("Binding!");
        binding.logo.setImageResource(R.drawable.ssssssssssssssssssss);

        binding.enterName.setOnKeyListener((v, keyCode, event) -> {
            if(event.getAction() == KeyEvent.ACTION_DOWN &&
                    (keyCode == KeyEvent.KEYCODE_ENTER))
            {
                name = binding.enterName.getText().toString();
                binding.next.setVisibility(View.VISIBLE);
                return true;
            }
            return false;
        }
        );

        TextView nameOfCompany = (TextView)findViewById(R.id.company_name);
        TextView enterName = (TextView)findViewById(R.id.entering_mes);
        EditText enteringName = (EditText) findViewById(R.id.enter_name);
        Button notRegister = (Button)findViewById(R.id.anon);
        ImageView logo = (ImageView)findViewById(R.id.logo);
        Button googleRegistration = (Button)findViewById(R.id.google);

    //        nameOfCompany.setText(R.string.someName);
    //        logo.setImageResource(R.drawable.ssssssssssssssssssss);

        binding.anon.setOnClickListener(v -> {
            enterName.setVisibility(View.VISIBLE);
            enteringName.setVisibility(View.VISIBLE);
        }

        );

        binding.next.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CourseActivity.class);
            name = (name == null)? "User" : name;
            intent.putExtra("userName", name);
            startActivity(intent);
        });

//        notRegister.setOnClickListener(new View.OnClickListener() { //программный способ установки слушателя
//            @Override
//            public void onClick(View v) {
//                enterName.setVisibility(View.VISIBLE);
//                enteringName.setVisibility(View.VISIBLE);
//            }
//        });
    }

    public void continueWithGoogle(View view) { //декларативный способ установки слушателя
        Log.i(TAG, "Once there will be a normal registration. But not today.");
    }
}