package com.example.home.publicwss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {


    private Button bth;
    private EditText email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        bth = (Button) findViewById(R.id.button3);
        email =(EditText) findViewById(R.id.editText);
        pass = (EditText ) findViewById(R.id.editText2);
        bth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String passw = pass.getText().toString();
                String id = email.getText().toString();

                if(id.equals("user@gmail.com") && passw.equals("user")|| id.equals("ahmed.abbas@gmail.com") && passw.equals("ahmed.abbas")) {
                    Toast.makeText(SignIn.this,"Logging In",Toast.LENGTH_SHORT).show();
                    Intent home = new Intent(SignIn.this, Home.class);
                    startActivity(home);
                }
                else{
                    Toast.makeText(SignIn.this,"Invalid Address",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }


}
