package com.example.resueltointentimplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button musica;
    private Button navegar;
    private Button app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musica = (Button) findViewById(R.id.boton_mp3);
        musica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.acdc);
                mp.start();
            }
        });

        navegar = (Button) findViewById(R.id.boton_Url);
        navegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.iesdoctorbalmis.com"));
                startActivity(intent);
            }
        });

        app = (Button) findViewById(R.id.boton_app);
        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse("tel:676813768");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });

    }
}
