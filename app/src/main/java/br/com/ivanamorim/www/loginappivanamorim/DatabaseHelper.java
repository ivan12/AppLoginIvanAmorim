package br.com.ivanamorim.www.loginappivanamorim;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by ivan on 26/02/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "usuarios.db";
    private static final String TABLE_NAME = "user";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_UNAME = "user_name";
    private static final String COLUMN_PASS = "passwd";

    private static final String TABLE_NAME_LOCATION = "location";
    private static final String COLUMN_ID_USER = "id_user";
    private static final String COLUMN_LAT = "latitude";
    private static final String COLUMN_LONG = "longitude";
    SQLiteDatabase db;
    Context contextGlobal;
    private static final String TABLE_CREATE = "create table user (id integer primary key not null , " +
            "user_name text not null , passwd text not null);";

    private static final String TABLE_CREATE_LOCATION = "create table location (id integer primary key not null , " +
            "id_user INTEGER, latitude text, longitude text);";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        contextGlobal = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        db.execSQL(TABLE_CREATE_LOCATION);
        this.db = db;
    }

    public void insertContact(Usuario c) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        try {
            String query = "select * from user";
            Cursor cursor = db.rawQuery(query , null);
            int count = cursor.getCount();

            values.put(COLUMN_ID , count);
            values.put(COLUMN_UNAME, c.getUname());
            values.put(COLUMN_PASS, c.getPass());

            db.insert(TABLE_NAME, null, values);
            db.close();
            Toast pass = Toast.makeText(contextGlobal , "Usuario Salvo com sucesso!!" , Toast.LENGTH_SHORT);
            pass.show();
        }catch (Exception e){
            Toast pass = Toast.makeText(contextGlobal , "Nao conseguiu salvar!!" , Toast.LENGTH_SHORT);
            pass.show();
        }
    }

    public void insertLocation(Location location) {
        this.db = this.getWritableDatabase();
        ContentValues values2 = new ContentValues();
        try {
            values2.put(COLUMN_ID_USER, location.getUserId());
            values2.put(COLUMN_LAT, location.getLatitude());
            values2.put(COLUMN_LONG, location.getLongitude());

            this.db.insert(TABLE_NAME_LOCATION, null, values2);
            this.db.close();
            Toast pass = Toast.makeText(contextGlobal , "Localizacao Salva com sucesso!!" , Toast.LENGTH_SHORT);
            pass.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
            Toast pass = Toast.makeText(contextGlobal , "Nao conseguiu salvar localizacao Usuario!!" , Toast.LENGTH_SHORT);
            pass.show();
        }

    }


    public Usuario getUser(String username)
    {
        Usuario user = null;
        this.db = this.getReadableDatabase();
        Cursor cursor = this.db.rawQuery("select * from user where user_name = ?", new String[]{""+username});
        if (cursor.moveToFirst()) {
                int id = cursor.getInt(cursor.getColumnIndex(COLUMN_ID));
                String nome = cursor.getString(cursor.getColumnIndex(COLUMN_UNAME));
                String pass = cursor.getString(cursor.getColumnIndex(COLUMN_PASS));
                user = new Usuario();
                user.setId(id);
                user.setUname(nome);
                user.setPass(pass);
        }

        return user;
    }

    public Location getLocationByUserId(int idUser)
    {

        Location location = null;
        this.db = this.getReadableDatabase();
        Cursor cursor = this.db.rawQuery("select * from location where id_user = ?", new String[]{""+idUser});
        if(cursor != null)
        if (cursor.moveToFirst()) {
            int id = cursor.getInt(cursor.getColumnIndex(COLUMN_ID));
            int id_user = cursor.getInt(cursor.getColumnIndex(COLUMN_ID_USER));
            String longitude = cursor.getString(cursor.getColumnIndex(COLUMN_LONG));
            String latitude = cursor.getString(cursor.getColumnIndex(COLUMN_LAT));
            location = new Location();
            location.setId(id);
            location.setUserId(id_user);
            location.setLatitude(latitude);
            location.setLongitude(longitude);
        }

        return location;

    }

    public String searchPass(String userNameParam)
    {
        db = this.getReadableDatabase();
        String query = "select user_name, passwd from "+TABLE_NAME;
        Cursor cursor = db.rawQuery(query , null);
        String a, b;
        b = "not found";
        if(cursor.moveToFirst())
        {
            do{
                a = cursor.getString(0);

                if(a.equals(userNameParam))
                {
                    b = cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
        }

        return b;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}
