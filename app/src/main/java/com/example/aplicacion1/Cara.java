package com.example.aplicacion1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class Cara extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara);

        Bundle recibido2 = this.getIntent().getExtras();
        final String mensaje2 = recibido2.getString("mensaje");

        ImageButton inimg = (ImageButton) findViewById(R.id.btnImagen);

        if(mensaje2.equals("Ok")){
            inimg.setImageResource(R.drawable.feliz22);

        } else {

            inimg.setImageResource(R.drawable.triste22);

        }
    }
}
