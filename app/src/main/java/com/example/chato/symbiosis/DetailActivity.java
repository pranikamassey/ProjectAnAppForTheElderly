package com.example.chato.symbiosis;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    //String name, String age, String gender, String qualification, String occupation, String about
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.containerDetail, PersonFragment.newInstance(intent.getStringExtra("NAME"),
                        intent.getStringExtra("AGE"),
                        intent.getStringExtra("GENDER"),
                        intent.getStringExtra("QUALIFICATION"),
                        intent.getStringExtra("OCCUPATION"),
                        intent.getStringExtra("ABOUT") ))
                .commit();
    }
}