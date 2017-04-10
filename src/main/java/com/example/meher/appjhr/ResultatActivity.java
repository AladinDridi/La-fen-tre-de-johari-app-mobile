package com.example.meher.appjhr;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import utils.contentdetails;
import utils.testfinale;

public class ResultatActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView drawingImageView;
TextView textTitre ,textinterpretation ,textmeanibtn ;

    Button btn ;
    testfinale test = new testfinale() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);
        textTitre = (TextView)findViewById(R.id.textrsltrtetat);
        textinterpretation =(TextView)findViewById(R.id.interpreter);
        textmeanibtn=(TextView)findViewById(R.id.textwindowmeaning);
    btn = (Button)findViewById(R.id.btn_cquoifenetrecolonnes);
        btn.setOnClickListener(this);
   afficheresultat(Integer.parseInt((String) getIntent().getExtras().getString("individu")), Integer.parseInt((String) getIntent().getExtras().getString("autrui")));



        drawingImageView=(ImageView)findViewById(R.id.DrawingImageView);
        Bitmap bitmap =Bitmap.createBitmap((int)getWindowManager().getDefaultDisplay().getWidth(),(int)getWindowManager().getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas =new Canvas(bitmap);
        drawingImageView.setImageBitmap(bitmap);

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(8);
        int startx0 =0 ;
        int starty0 =0 ;
        int endx0 =350 ;
        int endy0 =0 ;

        int startx1= 0;
        int starty1=0 ;
        int endx1 =0 ;
        int endy1=350;

        int startx2=350;
        int starty2=0 ;
        int endx2 =350;
        int endy2 =350;

        int startx3=0 ;
        int starty3=350;
        int endx3=350;
        int endy3=350;

int         atr = Integer.parseInt((String)getIntent().getExtras().getString("individu"));
   int      atr2 = Integer.parseInt((String)getIntent().getExtras().getString("autrui"));

        int startx4=atr*7;
        int starty4=0 ;
        int endx4 =atr*7;
        int endy4 =350;

        int startx5=0 ;
        int starty5=atr2*7;
        int endx5=350;
        int endy5=atr2*7;

        canvas.drawLine(startx0,starty0,endx0,endy0,paint);
        canvas.drawLine(startx1,starty1,endx1,endy1,paint);
        canvas.drawLine(startx2,starty2,endx2,endy2,paint);
        canvas.drawLine(startx3,starty3,endx3,endy3,paint);
        canvas.drawLine(startx4,starty4,endx4,endy4,paint);
        canvas.drawLine(startx5,starty5,endx5,endy5,paint);



    }

    public void afficheresultat (int resultat1 ,int resultat2){

        if( (resultat1>25)&&(resultat2>25) ){
            textTitre.setText("SCORES : Receptivité à la rétroaction:"+String.valueOf(resultat1)+">25"+"/ Ouverture à autrui:"+String.valueOf(resultat2)+">25" );

            textinterpretation.setText(contentdetails.messageinterpreation1);

        }  else if ( (resultat1>25)&&(resultat2<25)){
            textTitre.setText("SCORES : Receptivité à la rétroaction:"+String.valueOf(resultat1)+">25"+"/ Ouverture à autrui:"+String.valueOf(resultat2)+"<25" );
            textinterpretation.setText(contentdetails.Messageinterpreation2);

        } else if ( (resultat1<25)&&(resultat2>25)){
            textTitre.setText("SCORES : Receptivité à la rétroaction:"+String.valueOf(resultat1)+"<25"+"/ Ouverture à autrui:"+String.valueOf(resultat2)+">25" );
            textinterpretation.setText(contentdetails.Messageinterpretation3);


        } else if ( (resultat1<25)&&(resultat2<25)){

            textTitre.setText("SCORES : Receptivité à la rétroaction:"+String.valueOf(resultat1)+"<25"+"/ Ouverture à autrui:"+String.valueOf(resultat2)+"<25" );
            textinterpretation.setText(contentdetails.Messageinterpretation4);

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_results,menu);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String         chr = (String)getIntent().getExtras().getString("individu");
        String      chr1 = (String)getIntent().getExtras().getString("autrui");

        int id = item.getItemId() ;
        if (id == R.id.action_create_task){
            Intent listeAct = new Intent(getApplicationContext(),Main2Activity.class);
          listeAct.putExtra("individu",chr);
            listeAct.putExtra("autrui",chr1);
            startActivity(listeAct);

        }  if (id==R.id.actionpouractualiser){

            textmeanibtn.setVisibility(View.INVISIBLE);

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==btn.getId()){
            textmeanibtn.setVisibility(View.VISIBLE);
            textmeanibtn.setText(contentdetails.messageforwindowmeanning);
        }
    }
}
