package com.example.home.publicwss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuthException;


public class Signup extends AppCompatActivity {


    private EditText inputEmail,inputPassword;
    private Button btnReg;
    private ProgressBar progressBar;
   // private FirebaseApp auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        inputEmail = (EditText) findViewById(R.id.txtEmail);
        inputPassword = (EditText) findViewById(R.id.txtPassword);
        btnReg = (Button) findViewById(R.id.button6);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);


       // auth = FirebaseApp.getInstance();


        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signup.this,"Registered",Toast.LENGTH_SHORT);

                Intent aj = new Intent(Signup.this,Home.class);
                startActivity(aj);

            }
        });

    }
}
