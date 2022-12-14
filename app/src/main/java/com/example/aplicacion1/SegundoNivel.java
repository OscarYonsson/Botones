package com.example.aplicacion1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class SegundoNivel extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_segundo_nivel);

      try{
        Bundle recibido = this.getIntent().getExtras();
        final String mensaje = recibido.getString("mensaje");
      }
      catch (Exception e)
      {}

        ArrayList<Button> listado = new ArrayList<Button>();

        listado.add((Button) findViewById(R.id.but1));
        listado.add((Button) findViewById(R.id.but2));
        listado.add((Button) findViewById(R.id.but3));
        listado.add((Button) findViewById(R.id.but4));
        listado.add((Button) findViewById(R.id.but5));
        listado.add((Button) findViewById(R.id.but6));
        listado.add((Button) findViewById(R.id.but7));
        listado.add((Button) findViewById(R.id.but8));
        listado.add((Button) findViewById(R.id.but9));
        listado.add((Button) findViewById(R.id.but10));
        listado.add((Button) findViewById(R.id.but11));
        listado.add((Button) findViewById(R.id.but12));
        listado.add((Button) findViewById(R.id.but13));
        listado.add((Button) findViewById(R.id.but14));
        listado.add((Button) findViewById(R.id.but15));
        listado.add((Button) findViewById(R.id.but16));
        listado.add((Button) findViewById(R.id.but17));
        listado.add((Button) findViewById(R.id.but18));
        listado.add((Button) findViewById(R.id.but19));
        listado.add((Button) findViewById(R.id.but20));
        listado.add((Button) findViewById(R.id.but21));
        listado.add((Button) findViewById(R.id.but22));
        listado.add((Button) findViewById(R.id.but23));
        listado.add((Button) findViewById(R.id.but24));

        final TextView texto = (TextView)findViewById(R.id.texto);

        final ArrayList numeros = new ArrayList();

        for (final Button bt:listado) {
            int num = (int) (Math.random() * 24) + 1;
            numeros.add(num);
            bt.setText(num + "");
            bt.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    texto.setText(texto.getText() + " " + bt.getText());
                    bt.setVisibility(View.INVISIBLE);
                }
            });
        }
        Button validar2 =(Button)findViewById(R.id.btValidar2);
        Button automatico =(Button)findViewById(R.id.btautomatico);

        validar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                validarContenido2(texto, numeros);}
        });

        automatico.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                automatizar(texto, numeros);}
        });

    }
    public void validarContenido2(TextView texto, ArrayList numeros){
        Collections.sort(numeros);
        String cadena="";
        for (Object num: numeros){
            cadena+=(int)num+"";
        }
        String cadena2 = texto.getText().toString().replaceAll(" ","");
        String mensaje;

        if(cadena.equals(cadena2)){
            mensaje= "Ok";
            Intent in = new Intent(this,TercerNivel.class);
            Bundle b = new Bundle();
            b.putString("mensaje",mensaje);
            in.putExtras(b);
            startActivity(in);
        } else {

            mensaje = "fail";

            finish();
            startActivity(getIntent());
        }
    }
//hola
    public void automatizar(TextView texto, ArrayList numeros){
        String mensaje;


        Collections.sort(numeros);
        for (int i =0; i<numeros.size();i++){
            texto.setText(texto.getText() + " " + numeros.get(i));;
        }



    }
}
