package com.example.administrator.ku.receiver;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;

import com.example.administrator.ku.service.AutoUpdateService;

/**
 * Created by Administrator on 2016/5/15.
 */
public class AutoUpdateReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent){
        Intent i=new Intent(context,AutoUpdateService.class);
        context.startService(i);
    }
}
