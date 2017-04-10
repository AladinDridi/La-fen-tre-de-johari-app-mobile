package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.meher.appjhr.R;

import java.util.List;

import utils.testfinale;
/**
 * Created by meher on 11/05/2016.
 */
public class resultAdapter extends BaseAdapter {
String chaine ,chaine1,chaine3 ;
    int resource ;
Context context;
    testfinale test = new testfinale();
List<testfinale>testfinales ;
    public resultAdapter(Context context,List<testfinale> testfinales) {
        this.testfinales=testfinales;
        this.context=context;
    }


    @Override
    public int getCount() {
        return testfinales.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView ;
        testHolder holder=new testHolder();
        if (view==null){
            LayoutInflater inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_results,parent,false);
            holder.textdedate=(TextView)view.findViewById(R.id.textdedate);
            holder.textResultat=(TextView)view.findViewById(R.id.textdevaluation);
            view.setTag(holder);

        } else {holder=(testHolder)view.getTag();}

            holder.textdedate.setText(testfinales.get(position).getDate());
            holder.textResultat.setText( testfinales.get(position).getIndividu()+"/"+ testfinales.get(position).getAutrui() );


        return view;



    }






    public class testHolder {
        TextView textdedate ;
        TextView textResultat ;

    }
}
