package com.example.meher.appjhr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class introductionActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static int requesttolistactivity= 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),EvaluationActivity.class);
                startActivity(intent1);
            }
        });

        FloatingActionButton fab2 = (FloatingActionButton)findViewById(R.id.fab2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent1 = new Intent(getApplicationContext(),EtudierJohari.class);
                startActivity(intent1);

            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.begin) {
            Intent commence = new Intent(this,EvaluationActivity.class);
            startActivity(commence);

        } else if (id == R.id.informationget) {
            Intent intent = new Intent(this,EtudierJohari.class);
            startActivity(intent);

        } else if (id == R.id.nav_results) {
            Intent mylist = new Intent(this,Main2Activity.class);
            startActivity(mylist);

        } else if (id == R.id.setting_get) {
            Intent intent1 = new Intent(this,ParametreActivity.class);
            startActivity(intent1);


        } else if (id == R.id.contact_access) {

            Intent apropos =new Intent(this,aproposActivity.class);
            startActivity(apropos);

        } else if (id == R.id.exit_click) {
                Intent notrehashtag = new Intent(this,ourHashtag.class);
             startActivity(notrehashtag);
        }  else if (id==R.id.quitter){
            this.finishAffinity();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
