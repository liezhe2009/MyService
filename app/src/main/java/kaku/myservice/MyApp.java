package kaku.myservice;

import android.app.Application;

/**
 * Created by 410 on 2017/7/22 0022.
 */
public class MyApp extends Application implements Thread.UncaughtExceptionHandler{
    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }
}
