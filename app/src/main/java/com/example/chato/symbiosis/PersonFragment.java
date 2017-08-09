package com.example.chato.symbiosis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by chato on 8/9/2017.
 */

public class PersonFragment extends Fragment {

    public static final String NAME = "NAME";
    //String name, String age, String gender, String qualification, String occupation, String about
    public static PersonFragment newInstance(String name,String age,String gender,String qualification, String occupation, String about) {
        Bundle args = new Bundle();
        args.putString(NAME,name);
        args.putString("AGE",age);
        args.putString("GENDER",gender);
        args.putString("QUALIFICATION",qualification);
        args.putString("OCCUPATION",occupation);
        args.putString("ABOUT",about);
        PersonFragment fragment = new PersonFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_person,container,false);

        Bundle b = getArguments();

        TextView name,age , gender,  qualification,  occupation,  about;
        name = (TextView) v.findViewById(R.id.nameTextview);
        age = (TextView) v.findViewById(R.id.ageTextview);
        gender = (TextView) v.findViewById(R.id.genderTextview);
        qualification = (TextView) v.findViewById(R.id.qualTextview);

        occupation = (TextView) v.findViewById(R.id.occTextview);
        about = (TextView) v.findViewById(R.id.aboutTextview);



        name.setText(b.getString(NAME));
        age.setText(b.getString("AGE"));
        gender.setText(b.getString("GENDER"));
        qualification.setText(b.getString("QUALIFICATION"));
        occupation.setText(b.getString("OCCUPATION"));
        about.setText(b.getString("ABOUT"));

        return v;
    }
}