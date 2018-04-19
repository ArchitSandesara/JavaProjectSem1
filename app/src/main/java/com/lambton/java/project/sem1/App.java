package com.lambton.java.project.sem1;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import org.greenrobot.greendao.database.Database;

public class App extends Application {
    /** A flag to show how easily you can switch from standard SQLite to the encrypted SQLCipher. */
    public static final boolean ENCRYPTED = true;

     private DaoSession daoSession;
    SharedPreferences sharedPref;
    @Override
    public void onCreate() {
        super.onCreate();
        sharedPref = getBaseContext().getSharedPreferences("armo", Context.MODE_PRIVATE);
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, ENCRYPTED ? "notes-db-encrypted" : "notes-db");
        Database db = ENCRYPTED ? helper.getEncryptedWritableDb("armo-secret") : helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
        checkLogin();
    }

    public void checkLogin(){
        if(sharedPref.getInt("isLoggedIn",0)==0){

        }
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
