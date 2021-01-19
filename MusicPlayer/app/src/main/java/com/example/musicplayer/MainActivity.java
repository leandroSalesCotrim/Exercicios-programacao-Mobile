package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer audio;
    int atualAudio = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio = MediaPlayer.create(getApplicationContext(), R.raw.obey);

        final SeekBar seekBar = findViewById(R.id.seekBar);

        seekBar.setMax(audio.getDuration()/1000);

        final Handler mHandler = new Handler();


        //Make sure you update Seekbar on UI thread

        MainActivity.this.runOnUiThread(new Runnable() {

            @Override
            public void run() {
                if(audio != null) {
                    int mCurrentPosition = audio.getCurrentPosition() / 1000;
                    seekBar.setProgress(mCurrentPosition);
                }
                mHandler.postDelayed(this, 1000);
            }
        });
    }

    public void start(View view) {
            if (!audio.isPlaying()){
                audio.start();
            }else {
                audio.pause();
            }


    }

    public void pause(View view) {
        if (audio.isPlaying()){
            audio.pause();
        }
    }

    public void next(View view) {
        atualAudio++;
        if(atualAudio == 0){
            audio.reset();
            audio = MediaPlayer.create(getApplicationContext(), R.raw.obey);
            audio.start();
            ImageView thumb = findViewById(R.id.imageView4);  //resgatando miniatura
            thumb.setImageResource(R.drawable.obey); //definindo imagem da miniatura
            TextView titleBg = findViewById(R.id.titleBg); //resgatando fundo do titulo
            titleBg.setBackgroundColor(getResources().getColor(R.color.thumb1)); //alterando cor do fundo do titulo
            TextView title = findViewById(R.id.title);
            title.setText("Bring me the horizon-Obey");
        }else if(atualAudio == 1){
            audio.reset();
            audio = MediaPlayer.create(getApplicationContext(), R.raw.numb);
            audio.start();
            ImageView thumb = findViewById(R.id.imageView4); //resgatando miniatura
            thumb.setImageResource(R.drawable.numb);//definindo imagem da miniatura
            TextView titleBg = findViewById(R.id.titleBg);//resgatando fundo dotitulo
            titleBg.setBackgroundColor(getResources().getColor(R.color.thumb2));//alterando cor do fundo do titulo
            titleBg.setText("teste");
            TextView title = findViewById(R.id.title);
            title.setText("Linkin park-Numb");
        }else if (atualAudio == 2){
            audio.reset();
            audio = MediaPlayer.create(getApplicationContext(), R.raw.parasiteeve);
            audio.start();
            ImageView thumb = findViewById(R.id.imageView4); //resgatando miniatura
            thumb.setImageResource(R.drawable.parasiteeve);//definindo imagem da miniatura
            TextView titleBg = findViewById(R.id.titleBg);//resgatando fundo do titulo
            titleBg.setBackgroundColor(getResources().getColor(R.color.thumb3));//alterando cor do fundo do titulo
            TextView title = findViewById(R.id.title);
            title.setText("Bring me the horizon-Parasite Eve");
        }
    }

    public void previous(View view) {
        atualAudio--;
        if(atualAudio == 0){
            audio.reset();
            audio = MediaPlayer.create(getApplicationContext(), R.raw.obey);
            audio.start();
            ImageView thumb = findViewById(R.id.imageView4);  //resgatando miniatura
            thumb.setImageResource(R.drawable.obey); //definindo imagem da miniatura
            TextView titleBg = findViewById(R.id.titleBg); //resgatando fundo do titulo
            titleBg.setBackgroundColor(getResources().getColor(R.color.thumb1)); //alterando cor do fundo do titulo
            TextView title = findViewById(R.id.title);
            title.setText("Bring me the horizon - Obey");
        }else if(atualAudio == 1){
            audio.reset();
            audio = MediaPlayer.create(getApplicationContext(), R.raw.numb);
            audio.start();
            ImageView thumb = findViewById(R.id.imageView4); //resgatando miniatura
            thumb.setImageResource(R.drawable.numb);//definindo imagem da miniatura
            TextView titleBg = findViewById(R.id.titleBg);//resgatando fundo do titulo
            titleBg.setBackgroundColor(getResources().getColor(R.color.thumb2));//alterando cor do fundo do titulo
            TextView title = findViewById(R.id.title);
            title.setText("Linkin park-Numb");
        }else if (atualAudio == 2){
            audio.reset();
            audio = MediaPlayer.create(getApplicationContext(), R.raw.parasiteeve);
            audio.start();
            ImageView thumb = findViewById(R.id.imageView4); //resgatando miniatura
            thumb.setImageResource(R.drawable.parasiteeve);//definindo imagem da miniatura
            TextView titleBg = findViewById(R.id.titleBg);//resgatando fundo do titulo
            titleBg.setBackgroundColor(getResources().getColor(R.color.thumb3));//alterando cor do fundo do titulo
            TextView title = findViewById(R.id.title);
            title.setText("Bring me the horizon-Parasite Eve");
        }
    }
}
