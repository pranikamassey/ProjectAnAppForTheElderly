package com.example.chato.symbiosis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class FourthActivity extends AppCompatActivity {

    ArrayList<ShortPerson>shortpersonArrayList;
    ArrayList<Person> personArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);




        final FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerDetail);
        personArrayList = new ArrayList<>();
        shortpersonArrayList = new ArrayList<>();

        shortpersonArrayList.add(new ShortPerson("Pramod Sharma", "64yrs", "Male"));
        shortpersonArrayList.add(new ShortPerson("Mrs. Shikha Jain ", "67yrs", "Female"));
        shortpersonArrayList.add(new ShortPerson("Col. Amit Sehgal ", "61yrs", "Male"));
        shortpersonArrayList.add(new ShortPerson("Mrs. Sheetal Massey ", "64yrs", "Female"));
        shortpersonArrayList.add(new ShortPerson("Mr. Wasim Fazal ", "67yrs", "Male"));
        shortpersonArrayList.add(new ShortPerson("Mrs. Haseena Khan", "62yrs", "Female"));


        personArrayList.add(new Person("Name: Dr. Pramod Sharma", "Age: 64", "Gender: Male", "Qualifications: Masters of Dental Surgery", "Job Profile: Professor , HOD in Mulana Azad College", "This gentleman served as a dentist for children and was a professor in a renowned medical college. He is retired and would be happy to work for children and be their mentor.He lives in a big house with a front and back yard with his wife who would also love some company of children. They have to two daughters who are happily married and settled abroad."));
        personArrayList.add(new Person("Name: Mrs. Shikha Jain", "Age: 67", "Gender: Female", " Qualifications: 1. BA 2.B. Ed", "Job Profile: Retired Government teacher", "She served as an English teacher in a government middle school. She works exceptionally good and was applauded both by the students and her colleagues. She has plenty of time to devote to children. "));
        personArrayList.add(new Person("Name: Col.Amit Sehgal", "Age: 61", "Gender: Male", "Qualifications: Masters of Dental Surgery", "Job Profile: Professor , HOD in Mulana Azad College", "This gentleman served as a dentist for children and was a professor in a renowned medical college. He is retired and would be happy to work for children and be their mentor.He lives in a big house with a front and back yard with his wife who would also love some company of children. They have to two daughters who are happily married and settled abroad."));
        personArrayList.add(new Person("Name: Mrs. Sheetal Massey", "Age: 64", "Gender: Female", " Qualifications: 1. BA 2.B. Ed", "Job Profile: Retired Government teacher", "She served as an English teacher in a government middle school. She works exceptionally good and was applauded both by the students and her colleagues. She has plenty of time to devote to children. "));
        personArrayList.add(new Person("Name: Mr. Wasim Fazal", "Age: 67", "Gender: Male", "Qualifications: Masters of Dental Surgery", "Job Profile: Professor , HOD in Mulana Azad College", "This gentleman served as a dentist for children and was a professor in a renowned medical college. He is retired and would be happy to work for children and be their mentor.He lives in a big house with a front and back yard with his wife who would also love some company of children. They have to two daughters who are happily married and settled abroad."));
        personArrayList.add(new Person("Name: Mrs. Haseena Khan", "Age: 62", "Gender: Female", " Qualifications: 1. BA 2.B. Ed", "Job Profile: Retired Government teacher", "She served as an English teacher in a government middle school. She works exceptionally good and was applauded both by the students and her colleagues. She has plenty of time to devote to children. "));


        ListView listView = (ListView) findViewById(R.id.studentsListView);
        PersonAdapter personAdapter = new PersonAdapter(shortpersonArrayList,this);
        listView.setAdapter(personAdapter);
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