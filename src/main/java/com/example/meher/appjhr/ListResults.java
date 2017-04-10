package com.example.meher.appjhr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;

import SQLITE.DataBaseHandler;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import adapters.resultAdapter;
import utils.testfinale;

public class ListResults extends AppCompatActivity {
    ListView listresultatJohari ;
    List<testfinale> testfinaleList=new ArrayList<>();
    resultAdapter adapter;
    DataBaseHandler db;
   // String ch = (String) getIntent().getStringExtra("individu");
 //   String chaine= (String) getIntent().getStringExtra("autrui");
    String date = new SimpleDateFormat("MMM MM dd, yyyy h:mm a").format(new Date());
FrameLayout framelt ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_results);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listresultatJohari=(ListView)findViewById(R.id.listView);
        adapter =new resultAdapter(this,testfinaleList);
        db = new DataBaseHandler(getApplicationContext());
        //   Inserting test
        Log.d("Insert: ", "Inserting ..");
        db.addtests(new testfinale((String) getIntent().getStringExtra("individu"), (String) getIntent().getStringExtra("autrui"), date));
        testfinaleList = db.getAlltests();
        adapter = new resultAdapter(getApplicationContext(),testfinaleList);
        adapter.notifyDataSetChanged();
        listresultatJohari.setAdapter(adapter);

        FloatingActionButton fab2 = (FloatingActionButton)findViewById(R.id.fabhome);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),introductionActivity.class);
                startActivity(intent);

            }
        });



    }








    }






