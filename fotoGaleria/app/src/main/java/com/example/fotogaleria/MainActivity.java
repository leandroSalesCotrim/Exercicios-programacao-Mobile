package com.example.fotogaleria;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    ImageView foto ;
    ImageView imgGaleria;
    ImageView imgFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFoto = findViewById(R.id.botaoCamera);
        imgGaleria = findViewById(R.id.botaoCamera);
        foto = findViewById(R.id.imagem);


    }

    public void abrirGaleria(View view) {
        Intent intent = new Intent (Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, 2 );
    }

    public void abrirCamera(View view) {
        Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 1 );
    }
    public void onActivityResult(int requestCode,int resultCode, Intent data ){
        super.onActivityResult(requestCode, resultCode,data);
        Bitmap imagem = null;
        try{
            switch (requestCode){
                case 1:
                    imagem = (Bitmap) data.getExtras().get("data");
                    break;
                case 2:

                    Uri localImagem = data.getData();
                    imagem = MediaStore.Images.Media.getBitmap(getContentResolver(),localImagem);
                    break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        if (imagem != null){
            foto.setImageBitmap(imagem);
        }
    }
}
