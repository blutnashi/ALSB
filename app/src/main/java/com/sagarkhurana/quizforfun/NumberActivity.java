package com.sagarkhurana.quizforfun;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NumberActivity extends Activity {

    Button num_0, num_1,num_2,num_3,num_4,num_5,num_6,num_7,num_8,num_9,num_10;
    ImageView persona_numeros, numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

        ini();
        proce();

        persona_numeros.setBackgroundResource(R.drawable.n1);
        numeros.setBackgroundResource(R.drawable.np_1);
    }

    private void proce(){
        num_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona_numeros.setBackgroundResource(R.drawable.cero);
                numeros.setBackgroundResource(R.drawable.np_0);

                MediaPlayer mp = MediaPlayer.create(NumberActivity.this, R.raw.cero);
                mp.start();
            }
        });
        num_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona_numeros.setBackgroundResource(R.drawable.n1);
                numeros.setBackgroundResource(R.drawable.np_1);

                MediaPlayer mp = MediaPlayer.create(NumberActivity.this, R.raw.uno);
                mp.start();
            }
        });
        num_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona_numeros.setBackgroundResource(R.drawable.n2);
                numeros.setBackgroundResource(R.drawable.np_2);

                MediaPlayer mp = MediaPlayer.create(NumberActivity.this, R.raw.dos);
                mp.start();
            }
        });
        num_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona_numeros.setBackgroundResource(R.drawable.n3);
                numeros.setBackgroundResource(R.drawable.np_3);

                MediaPlayer mp = MediaPlayer.create(NumberActivity.this, R.raw.tres);
                mp.start();
            }
        });
        num_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona_numeros.setBackgroundResource(R.drawable.n4);
                numeros.setBackgroundResource(R.drawable.np_4);

                MediaPlayer mp = MediaPlayer.create(NumberActivity.this, R.raw.cuatro);
                mp.start();
            }
        });
        num_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona_numeros.setBackgroundResource(R.drawable.n5);
                numeros.setBackgroundResource(R.drawable.np_5);

                MediaPlayer mp = MediaPlayer.create(NumberActivity.this, R.raw.cinco);
                mp.start();
            }
        });
        num_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona_numeros.setBackgroundResource(R.drawable.n6);
                numeros.setBackgroundResource(R.drawable.np_6);

                MediaPlayer mp = MediaPlayer.create(NumberActivity.this, R.raw.seis);
                mp.start();
            }
        });
        num_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona_numeros.setBackgroundResource(R.drawable.n7);
                numeros.setBackgroundResource(R.drawable.np_7);

                MediaPlayer mp = MediaPlayer.create(NumberActivity.this, R.raw.siete);
                mp.start();
            }
        });
        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona_numeros.setBackgroundResource(R.drawable.n8);
                numeros.setBackgroundResource(R.drawable.np_8);

                MediaPlayer mp = MediaPlayer.create(NumberActivity.this, R.raw.ocho);
                mp.start();

            }
        });
        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona_numeros.setBackgroundResource(R.drawable.n9);
                numeros.setBackgroundResource(R.drawable.np_9);

                MediaPlayer mp = MediaPlayer.create(NumberActivity.this, R.raw.nueve);
                mp.start();
            }
        });
        num_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona_numeros.setBackgroundResource(R.drawable.n10);
                numeros.setBackgroundResource(R.drawable.np_10);

                MediaPlayer mp = MediaPlayer.create(NumberActivity.this, R.raw.diez);
                mp.start();
            }
        });

    }
    private void ini() {
        persona_numeros = findViewById(R.id.PersonaNumeros);
        numeros = findViewById(R.id.Numeros);

        num_0 = findViewById(R.id.btn_cero);
        num_1 = findViewById(R.id.btn_uno);
        num_2 = findViewById(R.id.btn_dos);
        num_3 = findViewById(R.id.btn_tres);
        num_4 = findViewById(R.id.btn_cuatro);
        num_5 = findViewById(R.id.btn_cinco);
        num_6 = findViewById(R.id.btn_seis);
        num_7 = findViewById(R.id.btn_siete);
        num_8 = findViewById(R.id.btn_ocho);
        num_9 = findViewById(R.id.btn_nueve);
        num_10 = findViewById(R.id.btn_diez);
    }


}