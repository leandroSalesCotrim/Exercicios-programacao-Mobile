package com.example.playstationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class ConvidadoActivity extends AppCompatActivity {

    public static final int NOTIFICATION_ID = 50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convidado);
    }

    public void Home(View view) {
        Intent intent = new Intent(this, HomeActivity.class);


        EditText nomeConvidado = findViewById(R.id.guestName);
        Spinner spinner = findViewById(R.id.spinner);

        String nome = nomeConvidado.getText().toString();
        String opcao = spinner.getSelectedItem().toString();

        RadioButton opcao1 = findViewById(R.id.opcao1);
        RadioButton opcao2 = findViewById(R.id.opcao2);

        String iconeprimeiro ;
        String iconesegundo ;
        if (opcao1.isChecked()){
            iconeprimeiro = "v";
            intent.putExtra("iconeprimeiro", iconeprimeiro);
        }else{
            iconeprimeiro = "f";
            intent.putExtra("iconeprimeiro", iconeprimeiro);
        }
        if (opcao2.isChecked()){
            iconesegundo = "v";
            intent.putExtra("iconesegundo", iconesegundo);
        }else{
            iconesegundo = "f";
            intent.putExtra("iconesegundo", iconesegundo);
        }

        intent.putExtra("nome", nome);
        intent.putExtra("opcao", opcao);




        startActivity(intent);

    }

}
