package SQLITE;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

import utils.testfinale;
/**
 * Created by meher on 06/06/2016.
 */
public class DataBaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "Johari";
    // Contacts table name
    private static final String TABLE_Johari= "joharifn";
    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_individu = "individu";
    private static final String KEY_autrui = "autrui";
    private static final String KEY_Date= "date";

    public DataBaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_Johari_TABLE = "CREATE TABLE " + TABLE_Johari
                + "("
                + KEY_ID + " INTEGER PRIMARY KEY autoincrement,"
                + KEY_individu + " TEXT,"+
        KEY_autrui+ " TEXT,"+ KEY_Date + " TEXT"+");";
db.execSQL(CREATE_Johari_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_Johari);
        // Create tables again
        onCreate(db);
        db.close();
    }
  public  void open(){
        SQLiteDatabase db = this.getWritableDatabase();}

    public void addtests(testfinale test) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        Log.d("++++++++++++++", "start insert");
        values.put(KEY_individu, test.getIndividu()); // test case1
        values.put(KEY_autrui, test.getAutrui());
        values.put(KEY_Date,test.getDate());
// Contact Phone
        // Inserting Row
        db.insert(TABLE_Johari, null, values);
        db.close(); // Closing database connection// }

    }
  public  testfinale gettest(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query
                (TABLE_Johari,
                        new String[] { KEY_ID,
                                KEY_individu, KEY_autrui,KEY_Date },
                        KEY_ID + "=?",
                        new String[] { String.valueOf(id) },
                        null,
                        null,
                        null,
                        null);
        if (cursor != null)
            cursor.moveToFirst();
        testfinale test = new
                testfinale(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2),cursor.getString(3));
        // return test
        return test; }

    public ArrayList<testfinale> getAlltests() {
        ArrayList<testfinale> testfinaleArrayList = new ArrayList<testfinale>();
        // Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_Johari;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                testfinale test = new testfinale();
                test.setId(Integer.parseInt(cursor.getString(0)));
                test.setIndividu(cursor.getString(1));
                test.setAutrui(cursor.getString(2));
                test.setDate(cursor.getString(3));
                // Adding test to list
                testfinaleArrayList.add(test);
            } while (cursor.moveToNext()); }
        // return tests list
        return testfinaleArrayList; }


    public int gettestCount() {
        String countQuery = "SELECT * FROM " + TABLE_Johari;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
        // return count
        return cursor.getCount(); }
    public void deleteTest() {
        SQLiteDatabase db = this.getWritableDatabase();
      db.delete(TABLE_Johari,null,null);
        db.close(); }


}






