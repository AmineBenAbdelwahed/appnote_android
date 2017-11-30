package com.example.myideapad.appnote;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by My IdeaPad on 29/11/2017.
 */
public class DB extends SQLiteOpenHelper{
    private static final String database_Name = "NoteDB.db";


    public DB (Context context){
        super (context,database_Name,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table mytable (id INTEGER PRIMARY KEY AUTOINCREMENT , note TEXT , date TEXT , heure TEXT");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS mytable");
        onCreate(db);
    }
}
