package com.example.moon.parseabledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(1,"Moon","mooncseru14@gmail.com"));
        arrayList.add(new Student(2,"Mahmud","moon14@gmail.com"));

          //For Single object passing using parceable
//        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//        intent.putExtra("student",new Student(1,"Moon","mooncseru14@gmail.com"));
//        startActivity(intent);

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putParcelableArrayListExtra("student",arrayList);
        startActivity(intent);

    }
}
