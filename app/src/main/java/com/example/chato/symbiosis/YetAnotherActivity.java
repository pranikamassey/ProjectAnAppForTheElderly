package com.example.chato.symbiosis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.chato.symbiosis.R.id.nextToCategory;

public class YetAnotherActivity extends AppCompatActivity {
    //https://github.com/coding-blocks-archives/DwarkaAndroid2017Summer/blob/master/Lecture06/ListFragmentIntent/app/src/main/java/com/codingblocks/listfragment/MainActivity.java
Button privateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yet_another);
        privateButton=(Button)findViewById(R.id.button2);
        privateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(YetAnotherActivity.this, FourthActivity.class));
            }
        });


    }
}
