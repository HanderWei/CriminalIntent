package me.chen_wei.criminalintent;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by Hander on 16/11/21.
 *
 * Email : hander_wei@163.com
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
