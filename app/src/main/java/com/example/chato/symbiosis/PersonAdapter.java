package com.example.chato.symbiosis;

/**
 * Created by chato on 8/8/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by welcome on 6/19/2017.
 */

public class PersonAdapter extends BaseAdapter {

    ArrayList<ShortPerson> shortpersonArrayList;
    Context c;

    public PersonAdapter(ArrayList<ShortPerson> arrayList, Context context) {
        this.shortpersonArrayList = arrayList;
        this.c = context;
    }

    @Override
    public int getCount() {
        return shortpersonArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater l = LayoutInflater.from(c);
        View v;
        ViewHolder viewHolder;

        if (convertView == null){
            v = l.inflate(R.layout.single_layout,
                    parent,false);

            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) v.findViewById(R.id.nameTextview);
            viewHolder.age = (TextView) v.findViewById(R.id.ageTextview);

            viewHolder.gender = (TextView) v.findViewById(R.id.genderTextview);
            v.setTag(viewHolder);
        }
        else{
            v = convertView;
            viewHolder = (ViewHolder) v.getTag();
        }

        ShortPerson s = shortpersonArrayList.get(position);
        viewHolder.name.setText(s.getName());
        viewHolder.age.setText(s.getAge());
        viewHolder.gender.setText(s.getGender());
        return v;
    }

    static class ViewHolder{
        TextView name,age,gender;
    }
}