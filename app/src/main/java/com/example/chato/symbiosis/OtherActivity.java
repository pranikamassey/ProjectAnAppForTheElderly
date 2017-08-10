package com.example.chato.symbiosis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OtherActivity extends AppCompatActivity {
ImageButton nextToCategory;
    Button contactButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        nextToCategory=(ImageButton)findViewById(R.id.nextToCategory) ;
        contactButton=(Button)findViewById(R.id.contactButton);
        nextToCategory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtherActivity.this, YetAnotherActivity.class));
            }
        });

        
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtherActivity.this, ContactActivity.class));
            }
        });


    }
}
