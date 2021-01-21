package com.example.exercicio;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Verificar(View view) {
        CheckBox Rhaast = findViewById(R.id.rhaast);
        CheckBox Varus = findViewById(R.id.varus);
        CheckBox Veigar = findViewById(R.id.veigar);
        RadioButton Darkin = findViewById(R.id.darkin);
        RadioButton Anjo = findViewById(R.id.anjo);
        CheckBox Pantheon = findViewById(R.id.pantheon);
        CheckBox Zoe = findViewById(R.id.zoe);
        CheckBox Sion = findViewById(R.id.sion);
        RadioButton Mago = findViewById(R.id.mago);
        RadioButton imortal = findViewById(R.id.imortal);
        RadioButton Vinganca = findViewById(R.id.vingaca);
        RadioButton Dominacao = findViewById(R.id.dominacao);

        Rhaast.setTextColor(Color.WHITE);
        Varus.setTextColor(Color.WHITE);
        Veigar.setTextColor(Color.WHITE);
        Zoe.setTextColor(Color.WHITE);
        Mago.setTextColor(Color.WHITE);
        Dominacao.setTextColor(Color.WHITE);
        Anjo.setTextColor(Color.WHITE);
        Vinganca.setTextColor(Color.WHITE);
        imortal.setTextColor(Color.WHITE);
        Darkin.setTextColor(Color.WHITE);
        Sion.setTextColor(Color.WHITE);
        Pantheon.setTextColor(Color.WHITE);


        if(Rhaast.isChecked()) {
            Rhaast.setTextColor(Color.GREEN);
        }
        if(Varus.isChecked()) {
            Varus.setTextColor(Color.GREEN);
        }
        if(Veigar.isChecked()) {
            Veigar.setTextColor(Color.RED);
        }
        if(Zoe.isChecked()) {
            Zoe.setTextColor(Color.GREEN);
        }
        if(Mago.isChecked()) {
            Mago.setTextColor(Color.RED);
        }
        if(Dominacao.isChecked()) {
            Dominacao.setTextColor(Color.RED);
        }
        if(Pantheon.isChecked()) {
            Pantheon.setTextColor(Color.GREEN);
        }
        if(Sion.isChecked()) {
            Sion.setTextColor(Color.RED);
        }
        if(Darkin.isChecked()) {
            Darkin.setTextColor(Color.GREEN);
        }
        if(imortal.isChecked()) {
            imortal.setTextColor(Color.GREEN);
        }
        if(Vinganca.isChecked()) {
            Vinganca.setTextColor(Color.RED);
        }
        if(Anjo.isChecked()) {
            Anjo.setTextColor(Color.RED);
        }
    }
}
