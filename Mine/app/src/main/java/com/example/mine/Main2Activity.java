package com.example.mine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       /* TextView textoEntrada = findViewById(R.id.textoEntrada);
        TextView textoTitulo = findViewById(R.id.textoTitulo);


        String valor1 = getIntent().getStringExtra("nome");
        String valor2= getIntent().getStringExtra("opcao");
        textoEntrada.setText("Seja bem vindo, "+valor1+"!");
        textoTitulo.setText("O "+valor2+"!");*/


    }




    public void EntrarHome(View view) {
        /*FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frag, PerfilFragment );
        fragmentTransaction.commit();*/
    }



}
