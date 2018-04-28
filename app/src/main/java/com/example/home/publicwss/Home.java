package com.example.home.publicwss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


    private Button btne;
    private Button btna;
    private Button btnr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btne = (Button) findViewById(R.id.button4);

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(Home.this,Events.class);
                startActivity(e);
            }
        });


        btna =(Button) findViewById(R.id.btn_app);

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent app = new Intent(Home.this,Application.class);
                startActivity(app);
            }
        });

        btnr = (Button) findViewById(R.id.button5);

        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rep = new Intent(Home.this, Reports.class);
                startActivity(rep);
            }
        });
    }
}
