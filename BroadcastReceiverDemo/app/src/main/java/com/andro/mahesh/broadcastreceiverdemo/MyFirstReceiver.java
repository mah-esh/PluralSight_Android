package com.andro.mahesh.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by mahes on 1/3/2017.
 */

public class MyFirstReceiver extends BroadcastReceiver{
    private final static String TAG = MyFirstReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {


            Log.i(TAG, "Hello from 1st Receiver");
            Toast.makeText(context, "Hello from 1st Receiver", Toast.LENGTH_LONG).show();



        }
}
