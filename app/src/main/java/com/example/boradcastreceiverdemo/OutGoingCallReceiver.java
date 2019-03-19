package com.example.boradcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class OutGoingCallReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        String number = sp.getString("number", "");


        String num = getResultData();

        setResultData(number + num);
    }
}
