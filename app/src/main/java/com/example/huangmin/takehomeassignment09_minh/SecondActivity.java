package com.example.huangmin.takehomeassignment09_minh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.UUID;

public class SecondActivity extends AppCompatActivity {
    private EditText personName, numberOfTickets;
    private CheckBox ifHaveKids;
    private boolean Kids;
    private DatabaseReference peopleReference = FirebaseDatabase.getInstance().getReference("People");
    private ArrayList<Person> people = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        personName = (EditText) findViewById(R.id.person_name);
        numberOfTickets = (EditText) findViewById(R.id.numberOfTickets);
        ifHaveKids = (CheckBox) findViewById(R.id.haveKids);

    }


    public void addPerson(View view) {
        String id = UUID.randomUUID().toString();
        Person p = new Person(id, personName.getText().toString(), numberOfTickets.getText().toString(), Kids);
        people.add(p);
        peopleReference.child(id).setValue(p);

    }

    public void checkBoxClicked(View view) {
        if (ifHaveKids.isChecked()) {
            Kids = true;
        } else {
            Kids = false;
        }
    }
}
