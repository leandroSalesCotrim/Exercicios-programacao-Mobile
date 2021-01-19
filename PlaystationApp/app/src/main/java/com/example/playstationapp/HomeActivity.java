package com.example.playstationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class HomeActivity extends AppCompatActivity {
    public static final int NOTIFICATION_ID = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView textoEntrada = findViewById(R.id.textoEntrada);
        TextView textoTitulo = findViewById(R.id.textoTitulo);

        ImageView iconeUsuario = findViewById(R.id.iconeUsuario);
        String avatar1 = getIntent().getStringExtra("iconeprimeiro");
        String avatar2 = getIntent().getStringExtra("iconesegundo");

        if(avatar1.equals("v") ){
            iconeUsuario.setImageResource(R.drawable.iconeprisioneiro);
        }else if(avatar2.matches("v") ){
            iconeUsuario.setImageResource(R.drawable.iconekratos2);
        }

        String valor1 = getIntent().getStringExtra("nome");
        String valor2= getIntent().getStringExtra("opcao");
        textoEntrada.setText("Seja bem vindo, "+valor1+"!");
        textoTitulo.setText("O "+valor2+"!");



        Notification.Builder builder = new Notification.Builder(this, notificacao.getChannelId(this));
        builder.setContentTitle("Playstation 5 em breve!");
        builder.setContentText("Fique atento "+valor1+", em breve a sony ira anunciar o preço e pré venda do novo playstation 5");
        builder.setSmallIcon(android.R.drawable.ic_dialog_info);

        Notification notification = builder.build();

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        if(nm!=null){
            nm.notify(NOTIFICATION_ID,notification);
        }
    }

    public void playstation(View view) {
        Intent intent = new Intent (this, Playstation.class);
        startActivity(intent);
    }
}
