package com.example.meher.appjhr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "3w52bt7IRptfvzjanbw5SiTQ3";
    private static final String TWITTER_SECRET = "UG20vQPoFpWaufM9aY9Akvyu9RECYTexvg8NiqjCRoy4UpyfaP";

public int Splash_Dialog_length = 5000 ;
    ProgressBar progressBar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        setContentView(R.layout.activity_main);
        progressBar =(ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
        progressBar.postDelayed(new Runnable() {
            @Override
            public void run() {
              progressBar.setVisibility(View.GONE);
                Intent introduction = new Intent(getApplicationContext(),introductionActivity.class);
                startActivity(introduction);
                MainActivity.this.finish();
            }
        },Splash_Dialog_length);
    }  
}
