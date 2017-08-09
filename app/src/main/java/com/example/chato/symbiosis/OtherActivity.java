package com.example.chato.symbiosis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class OtherActivity extends AppCompatActivity {
ImageButton nextToCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        nextToCategory=(ImageButton)findViewById(R.id.nextToCategory) ;
        nextToCategory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtherActivity.this, YetAnotherActivity.class));
            }
        });


    }
}
