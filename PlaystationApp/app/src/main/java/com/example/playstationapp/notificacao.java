package com.example.playstationapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

public class notificacao {
    private static final String CHANNEL_ID = "br.com.dominio.android.canal";
    private static final String CHANNEL_NAME = "canal";

    public static String getChannelId(Context context){
        if(Build.VERSION.SDK_INT <26){
            return CHANNEL_ID;
        }

        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationChannel channel = nm.getNotificationChannel(CHANNEL_ID);

        if(channel==null){
            channel = new NotificationChannel(CHANNEL_ID,CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
            nm.createNotificationChannel(channel);
        }

        return CHANNEL_ID;
    }
}
