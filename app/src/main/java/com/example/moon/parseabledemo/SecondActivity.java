package com.example.moon.parseabledemo;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if(extras!=null) {
            //for Single Object
//            Parcelable parcelable = extras.getParcelable("student");
//            Student student = (Student)parcelable;
//            if(student!=null)
//            Log.i(TAG, "onCreate: "+student.getId());


            //for Arraylist
            ArrayList<Student> student_Data =  extras.getParcelableArrayList("student");
            if(student_Data!=null)
            for (Student s :student_Data) {
                Log.i(TAG, "onCreate: "+s.getId());
            }

        }
    }
}
