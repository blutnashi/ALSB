package com.sagarkhurana.quizforfun;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AbecedarioActivity extends AppCompatActivity {

    Button a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, ch, nn, ll, rr;
    ImageView persona, letra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abecedario);

        ini();
        proce();

        persona.setBackgroundResource(R.drawable.personaa);
        letra.setBackgroundResource(R.drawable.a);
    }

    private void ini() {
        persona = findViewById(R.id.Persona);
        letra = findViewById(R.id.Letra);

        a = findViewById(R.id.btn_A);
        b = findViewById(R.id.btn_B);
        c = findViewById(R.id.btn_C);
        ch = findViewById(R.id.btn_Ch);
        d = findViewById(R.id.btn_D);
        e = findViewById(R.id.btn_E);
        f = findViewById(R.id.btn_F);
        g = findViewById(R.id.btn_G);
        h = findViewById(R.id.btn_H);
        i = findViewById(R.id.btn_I);
        j = findViewById(R.id.btn_J);
        k = findViewById(R.id.btn_K);
        l = findViewById(R.id.btn_L);
        ll = findViewById(R.id.btn_Ll);
        m = findViewById(R.id.btn_M);
        n = findViewById(R.id.btn_N);
        nn = findViewById(R.id.btn_Nn);
        o = findViewById(R.id.btn_O);
        p = findViewById(R.id.btn_P);
        q = findViewById(R.id.btn_Q);
        r = findViewById(R.id.btn_R);
        rr = findViewById(R.id.btn_Rr);
        s = findViewById(R.id.btn_S);
        t = findViewById(R.id.btn_T);
        u = findViewById(R.id.btn_U);
        v = findViewById(R.id.btn_V);
        w = findViewById(R.id.btn_W);
        x = findViewById(R.id.btn_X);
        y = findViewById(R.id.btn_Y);
        z = findViewById(R.id.btn_Z);


    }

    private void proce() {
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personaa);
                letra.setBackgroundResource(R.drawable.a);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.a);
                mp.start();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personab);
                letra.setBackgroundResource(R.drawable.b);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.b);
                mp.start();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personac);
                letra.setBackgroundResource(R.drawable.c);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.c);
                mp.start();
            }
        });
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personach);
                letra.setBackgroundResource(R.drawable.ch);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.ch);
                mp.start();
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personad);
                letra.setBackgroundResource(R.drawable.d);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.d);
                mp.start();
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personae);
                letra.setBackgroundResource(R.drawable.e);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.e);
                mp.start();
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personaf);
                letra.setBackgroundResource(R.drawable.f);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.f);
                mp.start();
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personag);
                letra.setBackgroundResource(R.drawable.g);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.g);
                mp.start();
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personah);
                letra.setBackgroundResource(R.drawable.h);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.h);
                mp.start();
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personai);
                letra.setBackgroundResource(R.drawable.i);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.i);
                mp.start();
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personaj);
                letra.setBackgroundResource(R.drawable.j);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.j);
                mp.start();
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personak);
                letra.setBackgroundResource(R.drawable.k);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.k);
                mp.start();
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personal);
                letra.setBackgroundResource(R.drawable.l);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.l);
                mp.start();
            }
        });
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personall);
                letra.setBackgroundResource(R.drawable.ll);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.ll);
                mp.start();
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personam);
                letra.setBackgroundResource(R.drawable.m);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.m);
                mp.start();
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personan);
                letra.setBackgroundResource(R.drawable.n);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.n);
                mp.start();
            }
        });
        nn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.persona_nn);
                letra.setBackgroundResource(R.drawable.n);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.nn);
                mp.start();
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personao);
                letra.setBackgroundResource(R.drawable.o);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.o);
                mp.start();
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personap);
                letra.setBackgroundResource(R.drawable.p);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.p);
                mp.start();
            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personaq);
                letra.setBackgroundResource(R.drawable.q);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.q);
                mp.start();
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personar);
                letra.setBackgroundResource(R.drawable.r);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.r);
                mp.start();
            }
        });
        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personarr);
                letra.setBackgroundResource(R.drawable.rr);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.rr);
                mp.start();
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personas);
                letra.setBackgroundResource(R.drawable.s);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.s);
                mp.start();
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personat);
                letra.setBackgroundResource(R.drawable.t);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.t);
                mp.start();
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personau);
                letra.setBackgroundResource(R.drawable.u);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.u);
                mp.start();
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personav);
                letra.setBackgroundResource(R.drawable.v);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.v);
                mp.start();
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personaw);
                letra.setBackgroundResource(R.drawable.w);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.w);
                mp.start();
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personax);
                letra.setBackgroundResource(R.drawable.x);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.x);
                mp.start();
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personay);
                letra.setBackgroundResource(R.drawable.y);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.y);
                mp.start();
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persona.setBackgroundResource(R.drawable.personaz);
                letra.setBackgroundResource(R.drawable.z);

                MediaPlayer mp = MediaPlayer.create(AbecedarioActivity.this, R.raw.z);
                mp.start();
            }
        });
    }
}