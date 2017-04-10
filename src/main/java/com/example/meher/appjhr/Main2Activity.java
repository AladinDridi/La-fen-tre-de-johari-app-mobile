package com.example.meher.appjhr;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import SQLITE.DataBaseHandler;
import adapters.resultAdapter;
import utils.testfinale;

public class Main2Activity extends AppCompatActivity {
    ListView listresultatJohari ;
    List<testfinale> testfinaleList=new ArrayList<>();
    resultAdapter adapter;
    DataBaseHandler db;
    String date = new SimpleDateFormat("MMM MM dd, yyyy h:mm a").format(new Date());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listresultatJohari=(ListView)findViewById(R.id.listView);
        adapter =new resultAdapter(this,testfinaleList);
        db = new DataBaseHandler(getApplicationContext());
        //   Inserting test
        Log.d("Insert: ", "Inserting ..");
        db.addtests(new testfinale((String) getIntent().getStringExtra("individu"), (String) getIntent().getStringExtra("autrui"), date));
        testfinaleList = db.getAlltests();
        adapter = new resultAdapter(getApplicationContext(),testfinaleList);
        listresultatJohari.setAdapter(adapter);
        adapter.notifyDataSetChanged();



        FloatingActionButton fab2 = (FloatingActionButton)findViewById(R.id.fabhome2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),introductionActivity.class);
                startActivity(intent);

            }
        });
    }
}
