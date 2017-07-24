package kaku.myservice;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by 410 on 2017/7/20 0020.
 */
public class MyIntentService extends IntentService{

    public MyIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
