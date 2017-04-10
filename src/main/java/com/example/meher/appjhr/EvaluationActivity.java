package com.example.meher.appjhr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EvaluationActivity extends AppCompatActivity {
       TextView text1;
    Button btn1 ,btn2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);
        text1=(TextView)findViewById(R.id.textView9);
        text1.setText("Merci d'utiliser l'application johari, l'évaluation de la fenêtre de Johari a vingt questions, et ne devrait pas prendre plus de 15 minutes, mais prendre aussi longtemps que vous avez besoin, doit être honnête et choisissez la réponse que vous reflète le mieux sur une journée moyenne.");


        btn1=(Button)findViewById(R.id.suivant_btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent example = new Intent(getApplicationContext(),EvaluationTesting.class);
                    startActivity(example);
            }
        });
        btn2=(Button)findViewById(R.id.precedent_btn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),introductionActivity.class);
                startActivity(intent);
            }
        });
    }
}
