package utils;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by meher on 29/04/2016.
 */
public class testfinale implements Parcelable {
   private int id ;
   private String autrui , individu , date ;
    public testfinale(){

    }

    public testfinale(int id, String autrui, String individu,String date) {
        this.id = id;
        this.autrui = autrui;
        this.individu = individu;
        this.date=date ;
    }

    public testfinale( String autrui, String individu,String date) {
        this.autrui = autrui;
        this.individu = individu;
        this.date=date ;
    }



    protected testfinale(Parcel in){
        id=in.readInt();
        individu=in.readString();
        autrui=in.readString();
        date=in.readString();


    }

    public static final Creator<testfinale> CREATOR = new Creator<testfinale>() {
        @Override
        public testfinale createFromParcel(Parcel in) {
            return new testfinale(in);
        }

        @Override
        public testfinale[] newArray(int size) {
            return new testfinale[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutrui() {
        return autrui;
    }

    public void setAutrui(String autrui) {
        this.autrui = autrui;
    }

    public String getIndividu() {
        return individu;
    }

    public void setIndividu(String individu) {
        this.individu = individu;
    }

    @Override
    public String toString() {
        return  "[Contact] id : " + id + " Mesure de reception a autrui : " + autrui + " Dégre de l'individu"+individu +"Date de resultat"+date ;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(autrui);
        dest.writeString(individu);
        dest.writeString(date);
    }
}
