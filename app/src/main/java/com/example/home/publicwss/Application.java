package com.example.home.publicwss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Application extends AppCompatActivity {


    private Button btns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);

        btns = (Button) findViewById(R.id.btn_submit);

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Application.this,"Application Submitted",Toast.LENGTH_LONG);
                Intent sub = new Intent(Application.this,Home.class);
                startActivity(sub);
            }
        });


    }
}
