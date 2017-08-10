package com.example.chato.symbiosis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class YetAnotherActivity extends AppCompatActivity {

Button privateButton;
    Button oldage;
    Button otherButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yet_another);
        privateButton=(Button)findViewById(R.id.button2);
        oldage=(Button)findViewById(R.id.oldage);
        otherButton=(Button)findViewById(R.id.otherButton);
        privateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(YetAnotherActivity.this, FourthActivity.class));
            }
        });
        oldage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(YetAnotherActivity.this, HomeActivity.class));
            }
        });
        otherButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(YetAnotherActivity.this, HomeActivity.class));
            }
        });


    }
}
