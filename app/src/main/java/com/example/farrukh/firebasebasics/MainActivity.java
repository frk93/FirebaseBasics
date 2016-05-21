package com.example.farrukh.firebasebasics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {


    TextView text;
    Button button1;
    Button button2;

    DatabaseReference myRef = FirebaseDatabase.getInstance().getReference(); //getting the root node of your database
    DatabaseReference answer = myRef.child("answer"); //Write your child reference

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text = (TextView) findViewById(R.id.textview1);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setValue("Yess");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setValue("Nooo");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        answer.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Text = dataSnapshot.getValue(String.class);  //get value from database
                text.setText(Text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
