package com.example.meher.appjhr;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import utils.contentdetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import adapters.expandleAdater;
public class DefnitionJohari extends AppCompatActivity {
    expandleAdater adapter ;
ExpandableListView expandableListView ;
    List<String> listdataHeader ;
    HashMap<String,List<String>> ListchildData ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defnition_johari);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        expandableListView =(ExpandableListView)findViewById(R.id.expandableListView);
        adapter = new expandleAdater(this,listdataHeader,ListchildData) ;
        preparelistexp();
        expandableListView.setAdapter(adapter);
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Toast.makeText(getApplicationContext(), listdataHeader.get(groupPosition) + ":" + ListchildData.get(listdataHeader.get(groupPosition)).get(childPosition), Toast.LENGTH_LONG).show();

                return false;
            }
        });
       expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
           @Override
           public void onGroupExpand(int groupPosition) {
               Toast.makeText(getApplicationContext(), listdataHeader.get(groupPosition) + "élargi", Toast.LENGTH_LONG).show();
           }
       });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(), listdataHeader.get(groupPosition) + "effondré", Toast.LENGTH_LONG).show();

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
 public  void preparelistexp (){
listdataHeader = new ArrayList<String>();
     ListchildData = new HashMap<String,List<String>>();
     listdataHeader.add("C'est quoi Johari fenetre?");
     listdataHeader.add("a inventé par") ;
     listdataHeader.add("pourquoi est-il utile?");
     listdataHeader.add("où peut-il être utilisé?");
     listdataHeader.add("maniere de test");

     List<String> Cquoijohari = new ArrayList<String>();
     Cquoijohari.add(contentdetails.childText1);

     List<String>inventedby = new ArrayList<String>() ;
     inventedby.add(contentdetails.childText2);

     List<String>reasonForapp = new ArrayList<String>();
     reasonForapp.add(contentdetails.childText3);

     List<String>Locationusing = new ArrayList<String>();
     Locationusing.add(contentdetails.childText4);
     List<String>wayJohari = new ArrayList<String>();
     wayJohari.add(contentdetails.childText5);

     ListchildData.put(listdataHeader.get(0), Cquoijohari);
     ListchildData.put(listdataHeader.get(1),inventedby);
     ListchildData.put(listdataHeader.get(2),reasonForapp);
     ListchildData.put(listdataHeader.get(3),Locationusing);
     ListchildData.put(listdataHeader.get(4),wayJohari);




 }
}
