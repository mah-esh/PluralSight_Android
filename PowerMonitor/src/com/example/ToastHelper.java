package com.example;

import android.content.Context;
import android.widget.Toast;


public class ToastHelper {
    public static void show(Context context, CharSequence message){
        Toast t = Toast.makeText(context, message, Toast.LENGTH_LONG);
        t.show();
    }

}
