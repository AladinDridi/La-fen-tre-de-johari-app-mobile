package com.example.meher.appjhr;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import utils.contentdetails;
public class EtudierJohari extends AppCompatActivity implements View.OnClickListener {
Button btn1 ,btn2 ,btn3 ;
    CardView cardView ;
    TextView text1  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etudier_johari);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       btn1 =(Button)findViewById(R.id.cquoijohaributton);
        btn1.setOnClickListener(this);
        btn2 =(Button)findViewById(R.id.inventedbutton);
        btn2.setOnClickListener(this);
        btn3 =(Button)findViewById(R.id.utilisable_ou);
        btn3.setOnClickListener(this);
        cardView=(CardView)findViewById(R.id.cardview2);
        text1 =(TextView)findViewById(R.id.TextVisible01);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardView.setVisibility(View.INVISIBLE);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==btn1.getId()){
            cardView.setVisibility(View.VISIBLE);
            text1.setText(contentdetails.childText1);

        } else if (v.getId()==btn2.getId()){
            cardView.setVisibility(View.VISIBLE);
            text1.setText(contentdetails.childText2);


        } else if (v.getId()==btn3.getId()){
            cardView.setVisibility(View.VISIBLE);
            text1.setText(contentdetails.childText3);


        } else {
            cardView.setVisibility(View.INVISIBLE);
        }
    }
}
