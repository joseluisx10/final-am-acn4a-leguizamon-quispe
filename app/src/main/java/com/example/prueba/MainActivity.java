package com.example.prueba;

import static com.example.prueba.R.drawable.dado1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.FieldClassification;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pulsar = findViewById(R.id.button3);
        ImageView dado1 = findViewById(R.id.img1);
        ImageView dado2 = findViewById(R.id.img2);
        ImageView dado3 = findViewById(R.id.img3);
        ImageView dado4 = findViewById(R.id.img4);
        ImageView dado5 = findViewById(R.id.img5);
        LinearLayout ll = findViewById(R.id.linearLayout);
        TextView username;

        {
            username = new TextView(ll.getContext());
        }

        ll.addView(username);

        pulsar.setOnClickListener(new View.OnClickListener() {


            private Integer[] imagenesID = new Integer[]{R.drawable.dado1, R.drawable.dado2, R.drawable.dado3, R.drawable.dado4, R.drawable.dado5};
            @Override
            public void onClick(View view) {

                username.setText("User name: Matias");
                username.setTextColor(getResources().getColor(R.color.white));

                Random r = new Random();

                int valorDado1 = imagenesID[r.nextInt(imagenesID.length)];
                int valorDado2 = imagenesID[r.nextInt(imagenesID.length)];
                int valorDado3 = imagenesID[r.nextInt(imagenesID.length)];
                int valorDado4 = imagenesID[r.nextInt(imagenesID.length)];
                int valorDado5 = imagenesID[r.nextInt(imagenesID.length)];


                dado1.setImageResource(valorDado1);
                dado2.setImageResource(valorDado2);
                dado3.setImageResource(valorDado3);
                dado4.setImageResource(valorDado4);
                dado5.setImageResource(valorDado5);




            }


        });
    }
}