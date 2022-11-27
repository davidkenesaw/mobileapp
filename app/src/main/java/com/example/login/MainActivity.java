package com.example.login;

//000859536
//David VanAsselberg
// 10/26/2022

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView log = findViewById(R.id.user);
        TextView pass = findViewById(R.id.pass);
        MaterialButton submit = findViewById(R.id.submit);
        submit.setOnClickListener(v -> {
            if(log.getText().toString().equals("user") && pass.getText().toString().equals("pass")){
                //if login was successful
                Toast.makeText(MainActivity.this,"Login was successful",Toast.LENGTH_SHORT).show();
            }else
                //if login failed
                Toast.makeText(MainActivity.this,"Failed to login",Toast.LENGTH_SHORT).show();
        });


    }
}