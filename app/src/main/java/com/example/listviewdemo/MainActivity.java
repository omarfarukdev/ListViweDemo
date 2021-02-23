package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_item);

        ArrayList<Integer> imager=new ArrayList<>();
        imager.add(R.drawable.laptop1);
        imager.add(R.drawable.laptop2);
        imager.add(R.drawable.macbook1);
        imager.add(R.drawable.macbook2);
        imager.add(R.drawable.macbook3);
        imager.add(R.drawable.macbook4);
        imager.add(R.drawable.macbook5);
        imager.add(R.drawable.macbook6);
        imager.add(R.drawable.macbook7);
        imager.add(R.drawable.macbook8);
        ListViewAdapter adapter=new ListViewAdapter(MainActivity.this,imager);
        listView.setAdapter(adapter);
    }
}