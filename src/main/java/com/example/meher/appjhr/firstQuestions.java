package com.example.meher.appjhr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class firstQuestions extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {
    SeekBar seek1, seek2, seek3, seek4, seek5, seek6, seek7, seek8, seek9, seek10, seek11, seek12, seek13, seek14, seek15, seek16, seek17, seek18, seek19, seek20;
    TextView rep1, rep2, rep3, rep4, rep5, rep6, rep7, rep8, rep9, rep10, rep11, rep12, rep13, rep14, rep15, rep16, rep17, rep18, rep19, rep20, rec_retroaction, res_autrui;
    Button home, svt;
    int compteur_autrui;
    int compteur_individu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_questions);
        home = (Button) findViewById(R.id.button_acceuil);
        home.setOnClickListener(this);


        seek1 = (SeekBar) findViewById(R.id.seekquestion1);
        seek1.setProgress(0);
        seek1.incrementProgressBy(0);
        seek1.setMax(5);
        seek2 = (SeekBar) findViewById(R.id.seekquestion2);
        seek2.setProgress(0);
        seek2.incrementProgressBy(0);
        seek2.setMax(5);
        seek3 = (SeekBar) findViewById(R.id.seekquestion3);
        seek3.setProgress(0);
        seek3.incrementProgressBy(0);
        seek3.setMax(5);
        seek4 = (SeekBar) findViewById(R.id.seekquestion4);
        seek4.setProgress(0);
        seek4.incrementProgressBy(0);
        seek4.setMax(5);
        seek5 = (SeekBar) findViewById(R.id.seekquestion5);
        seek5.setProgress(0);
        seek5.incrementProgressBy(0);
        seek5.setMax(5);
        seek6 = (SeekBar) findViewById(R.id.seekquestion6);
        seek6.setProgress(0);
        seek6.incrementProgressBy(0);
        seek6.setMax(5);
        seek7 = (SeekBar) findViewById(R.id.seekquestion7);
        seek7.setProgress(0);
        seek7.incrementProgressBy(0);
        seek7.setMax(5);
        seek8 = (SeekBar) findViewById(R.id.seekquestion8);
        seek8.setProgress(0);
        seek8.incrementProgressBy(0);
        seek8.setMax(5);
        seek9 = (SeekBar) findViewById(R.id.seekquestion9);
        seek9.setProgress(0);
        seek9.incrementProgressBy(0);
        seek9.setMax(5);
        seek10 = (SeekBar) findViewById(R.id.seekquestion10);
        seek10.setProgress(0);
        seek10.incrementProgressBy(0);
        seek10.setMax(5);
        seek11 = (SeekBar) findViewById(R.id.seekquestion11);
        seek11.setProgress(0);
        seek11.incrementProgressBy(0);
        seek11.setMax(5);
        seek12 = (SeekBar) findViewById(R.id.seekquestion12);
        seek12.setProgress(0);
        seek12.incrementProgressBy(0);
        seek12.setMax(5);
        seek13 = (SeekBar) findViewById(R.id.seekquestion13);
        seek13.setProgress(0);
        seek13.incrementProgressBy(0);
        seek13.setMax(5);
        seek14 = (SeekBar) findViewById(R.id.seekquestion14);
        seek14.setProgress(0);
        seek14.incrementProgressBy(0);
        seek14.setMax(5);
        seek15 = (SeekBar) findViewById(R.id.seekquestion15);
        seek15.setProgress(0);
        seek15.incrementProgressBy(0);
        seek15.setMax(5);
        seek16 = (SeekBar) findViewById(R.id.seekquestion16);
        seek16.setProgress(0);
        seek16.incrementProgressBy(0);
        seek16.setMax(5);
        seek17 = (SeekBar) findViewById(R.id.seekquestion17);
        seek17.setProgress(0);
        seek17.incrementProgressBy(0);
        seek17.setMax(5);
        seek18 = (SeekBar) findViewById(R.id.seekquestion18);
        seek18.setProgress(0);
        seek18.incrementProgressBy(0);
        seek18.setMax(5);
        seek19 = (SeekBar) findViewById(R.id.seekquestion19);
        seek19.setProgress(0);
        seek19.incrementProgressBy(0);
        seek19.setMax(5);
        seek20 = (SeekBar) findViewById(R.id.seekquestion20);
        seek20.setProgress(0);
        seek20.incrementProgressBy(0);
        seek20.setMax(5);


        rep1 = (TextView) findViewById(R.id.reponseA);
        rep2 = (TextView) findViewById(R.id.reponseB);
        rep3 = (TextView) findViewById(R.id.reponse3);
        rep4 = (TextView) findViewById(R.id.reponse4);
        rep5 = (TextView) findViewById(R.id.reponse5);
        rep6 = (TextView) findViewById(R.id.reponse6);
        rep7 = (TextView) findViewById(R.id.reponse7);
        rep8 = (TextView) findViewById(R.id.reponse8);
        rep9 = (TextView) findViewById(R.id.reponse9);
        rep10 = (TextView) findViewById(R.id.reponse10);
        rep11 = (TextView) findViewById(R.id.reponse11);
        rep12 = (TextView) findViewById(R.id.reponse12);
        rep13 = (TextView) findViewById(R.id.reponse13);
        rep14 = (TextView) findViewById(R.id.reponse14);
        rep15 = (TextView) findViewById(R.id.reponse15);
        rep16 = (TextView) findViewById(R.id.reponse16);
        rep17 = (TextView) findViewById(R.id.reponse17);
        rep18 = (TextView) findViewById(R.id.reponse18);
        rep19 = (TextView) findViewById(R.id.reponse19);
        rep20 = (TextView) findViewById(R.id.reponse20);


        seek1.setOnSeekBarChangeListener(this);
        seek2.setOnSeekBarChangeListener(this);
        seek3.setOnSeekBarChangeListener(this);
        seek4.setOnSeekBarChangeListener(this);

        seek5.setOnSeekBarChangeListener(this);
        seek6.setOnSeekBarChangeListener(this);
        seek7.setOnSeekBarChangeListener(this);
        seek8.setOnSeekBarChangeListener(this);
        seek9.setOnSeekBarChangeListener(this);
        seek9.setOnSeekBarChangeListener(this);
        seek10.setOnSeekBarChangeListener(this);
        seek11.setOnSeekBarChangeListener(this);
        seek12.setOnSeekBarChangeListener(this);
        seek13.setOnSeekBarChangeListener(this);

        seek14.setOnSeekBarChangeListener(this);
        seek15.setOnSeekBarChangeListener(this);
        seek16.setOnSeekBarChangeListener(this);
        seek17.setOnSeekBarChangeListener(this);
        seek18.setOnSeekBarChangeListener(this);
        seek19.setOnSeekBarChangeListener(this);
        seek20.setOnSeekBarChangeListener(this);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EvaluationActivity.class);
                startActivity(intent);
            }
        });

        FloatingActionButton fab01 = (FloatingActionButton) findViewById(R.id.fab02);
        fab01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(),"res :"+String.valueOf(compteur_autrui),Toast.LENGTH_LONG).show();
                if ((compteur_autrui==0) ||(compteur_individu==0)){
                    Toast.makeText(getApplicationContext(),"0 Reponses déclaré ",Toast.LENGTH_LONG).show();

                }
                else if ((compteur_autrui==25) ||(compteur_individu==25)){
                    Toast.makeText(getApplicationContext(),"dans ce test, il n'existe pas de réponse médiane. Réfléchissez encore et essayez de trouver une réponse un peu plus proche de la réalité. ",Toast.LENGTH_LONG).show();

                } else {


                Intent resultat = new Intent(getApplicationContext(), ResultatActivity.class);
                resultat.putExtra("autrui",String.valueOf(compteur_autrui));
                resultat.putExtra("individu",String.valueOf(compteur_individu));
                startActivity(resultat); }
            }
        });
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        compteur_autrui = seek1.getProgress() + seek4.getProgress() + seek6.getProgress() + seek9.getProgress() + seek11.getProgress() + seek13.getProgress() + seek15.getProgress() + seek17.getProgress() + seek18.getProgress() + seek19.getProgress();
        compteur_individu = seek2.getProgress() + seek3.getProgress() + seek5.getProgress() + seek7.getProgress() + seek8.getProgress() + seek10.getProgress() + seek12.getProgress() + seek14.getProgress() + seek16.getProgress() + seek20.getProgress();

        rec_retroaction = (TextView) findViewById(R.id.textResultat_retroaction);
        rec_retroaction.setText("Receptivité à la rétroaction:" + String.valueOf(compteur_individu));

        res_autrui = (TextView) findViewById(R.id.textResultat_autrui);
        res_autrui.setText("Ouverture à autrui:" + String.valueOf(compteur_autrui));

        if (seekBar.getId() == seek1.getId()) {
            rep1.setText("Rep:" + String.valueOf(progress));

        }
        if (seekBar.getId() == seek2.getId()) {
            rep2.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek3.getId()) {
            rep3.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek4.getId()) {
            rep4.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek5.getId()) {
            rep5.setText("Rep:" + String.valueOf(progress));

        }
        if (seekBar.getId() == seek6.getId()) {
            rep6.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek7.getId()) {
            rep7.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek8.getId()) {
            rep8.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek9.getId()) {
            rep9.setText("Rep:" + String.valueOf(progress));

        }
        if (seekBar.getId() == seek10.getId()) {
            rep10.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek11.getId()) {
            rep11.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek12.getId()) {
            rep12.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek13.getId()) {
            rep13.setText("Rep:" + String.valueOf(progress));

        }
        if (seekBar.getId() == seek14.getId()) {
            rep14.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek15.getId()) {
            rep15.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek16.getId()) {
            rep16.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek17.getId()) {
            rep17.setText("Rep:" + String.valueOf(progress));

        }
        if (seekBar.getId() == seek18.getId()) {
            rep18.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek19.getId()) {
            rep19.setText("Rep:" + String.valueOf(progress));
        }
        if (seekBar.getId() == seek20.getId()) {
            rep20.setText("Rep:" + String.valueOf(progress));
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == home.getId()) {
            Intent acc = new Intent(this, introductionActivity.class);
            startActivity(acc);

        }

    }




}


