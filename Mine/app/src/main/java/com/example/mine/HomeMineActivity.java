package com.example.mine;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class HomeMineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_mine);
    }

    public void Home(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        EditText nomeConvidado = findViewById(R.id.guestName);
        Spinner spinner = findViewById(R.id.spinner);

        String nome = nomeConvidado.getText().toString();
        String opcao = spinner.getSelectedItem().toString();

        intent.putExtra("nome", nome);
        intent.putExtra("opcao", opcao);



        startActivity(intent);

    }
}
