package com.example.administrator.secondtask.collect;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ASUS on 2017/1/9.
 */

public class DB_M extends SQLiteOpenHelper{
    public static final String table_name="info";

    public DB_M(Context context) {
        super(context, "Urls.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String  table_sql="create table "+table_name+"( _id  integer primary key autoincrement," +
                " title varchar(100) not null, url varchar(100), img varchar(100) )";
        db.execSQL(table_sql);


//        String  table_sql="create table "+table_name+"( _id  integer primary key autoincrement," +
//                " title varchar(100) , url varchar(100), img varchar(100)";
//        db.execSQL(table_sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
