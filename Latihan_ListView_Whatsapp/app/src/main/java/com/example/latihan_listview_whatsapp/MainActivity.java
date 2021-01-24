package com.example.latihan_listview_whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private String[] KontakWhatsapp = {"Muhammad Ariq Akbar","Nila Krishna","Endang Sukaningsih","Sabana Fried",
    "Mamang Daya","kakek","Nenek","Mamah","Endang Gustiana"};
    private ArrayList<String> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.ListContainer);
        data = new ArrayList<>();
        getData();
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);

    }
    private void getData(){
        Collections.addAll(data,KontakWhatsapp);
    }
}