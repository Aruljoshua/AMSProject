package com.example.gymproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SessionActivity extends AppCompatActivity {

    private ListView listView;
    private Button btnBack;
    private CustomListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);

        // List items
        List<String> itemList = new ArrayList<>();
        itemList.add("Line Outs");
        itemList.add("Scrum");
        itemList.add("Kicking");
        itemList.add("LL Strength");
        itemList.add("UL Strength");
        itemList.add("TB Strength");
        itemList.add("Conditioning");
        itemList.add("NWB Conditioning");
        itemList.add("Speed");

        // Custom adapter
        adapter = new CustomListAdapter(this, itemList);

        // ListView setup
        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        btnBack=findViewById(R.id.btnBackSession);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SessionActivity.this,ClickForRpeRequest.class);
                startActivity(intent);
            }
        });
    }
}

