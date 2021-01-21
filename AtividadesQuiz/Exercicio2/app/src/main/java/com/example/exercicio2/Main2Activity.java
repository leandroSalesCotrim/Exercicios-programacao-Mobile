package com.example.exercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void Personagem(View view) {
        Spinner spinner = findViewById(R.id.spinner);
        String opcao = spinner.getSelectedItem().toString();

        if(opcao.equals("Aatrox")){
                Intent intent = new Intent(this,Main3Activity.class);
                startActivity(intent);
        }else if(opcao.equals("Varus")){
            Intent intent = new Intent(this,VarusActivity.class);
            startActivity(intent);
        }else if(opcao.equals("Kayn")){
            Intent intent = new Intent(this,KaynActivity.class);
            startActivity(intent);
        }

    }
}
