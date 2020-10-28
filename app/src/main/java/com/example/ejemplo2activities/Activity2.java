package com.example.ejemplo2activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView  txt_recibido =  null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //-------------------------------------------
        txt_recibido = findViewById(R.id.txt_recibido);
        //--------------------------------------------------
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null){
            String ciudad = extras.getString(MainActivity.EXTRA_CIUDAD);
            //String ciudad = intent.getStringExtra(MainActivity.EXTRA_CIUDAD);
            if (ciudad != null) {
                //int habitantes = intent.getIntExtra(MainActivity.EXTRA_HABITANTES, 0);
                int habitantes = extras.getInt(MainActivity.EXTRA_HABITANTES);

                //-----------------------------------------------------
                String texto = "ciudad: " + ciudad + "\n" + "habitantes: " + String.valueOf(habitantes);
                //------------------------------------------------------
                txt_recibido.setText(texto);
            }
        }
    }

    public void cerrarActivity(View view) {
        finish();
    }
}