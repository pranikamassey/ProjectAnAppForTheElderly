package com.example.chato.symbiosis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class FourthActivity extends AppCompatActivity {

    ArrayList<Person> personArrayList;
    ArrayList<String> stringArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


        ListView listView = (ListView) findViewById(R.id.listViewStudnt);
        final FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerDetail);
        personArrayList = new ArrayList<>();
        stringArrayList = new ArrayList<>();
        personArrayList.add(new Person("Shikha Verma", "67", "Female","B.A  B.ed","Retired teacher","she was a ghjbhihi bygu"));
        personArrayList.add(new Person("gvg Verma", "60", "male"," B.ed"," teacher","she is a ghjbhihi bygu"));
        stringArrayList.add("Shikha Verma");
        stringArrayList.add("gvg Verma");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,
                android.R.id.text1,
//                android.R.layout.simple_expandable_list_item_2,
//                android.R.id.text2,
                stringArrayList
        );

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Person currentPerson = personArrayList.get(position);

                if (frameLayout != null) {
                    getSupportFragmentManager().
                            beginTransaction().
                            replace(R.id.containerDetail, PersonFragment.newInstance(currentPerson.getName(),
                                    currentPerson.getAge(),
                                    currentPerson.getGender(),
                                    currentPerson.getQualification(),
                                    currentPerson.getOccupation(),
                                    currentPerson.getAbout())).
                            commit(); }
                else {
                        Intent intent = new Intent(getBaseContext(), DetailActivity.class);
                        intent.putExtra("NAME", currentPerson.getName());
                        intent.putExtra("AGE", currentPerson.getAge());
                        intent.putExtra("GENDER", currentPerson.getGender());
                    intent.putExtra("QUALIFICATION", currentPerson.getQualification());
                    intent.putExtra("OCCUPATION", currentPerson.getOccupation());
                    intent.putExtra("ABOUT", currentPerson.getAbout());
                        startActivity(intent);
                    }
                }
            });
        }

    }