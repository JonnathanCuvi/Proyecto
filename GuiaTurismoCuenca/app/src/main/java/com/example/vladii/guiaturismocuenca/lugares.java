package com.example.vladii.guiaturismocuenca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class lugares extends Activity {

    ListViewAdapter adapter;

    String[] titulo = new String[]{
            "Lugares de Comida",
            "Lugares para Dormir",
            "Sitios de Emergencia",
            //"Favoritos",
    };

    int[] imagenes = {
            R.drawable.restaurant,
            R.drawable.dormir,
            R.drawable.emergencia,
            //R.drawable.facoritos,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);//cambiamos el activity_my por activity_lugares_interes

        final ListView lista = (ListView) findViewById(R.id.listView1);
        adapter = new ListViewAdapter(this, titulo, imagenes);
        lista.setAdapter(adapter);

        //Nos permite realizar accioes al aplastar los listview
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(), "poscion "+ (position+1)+titulo[position], Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0 :
                        Intent ii = new Intent(getApplicationContext(), mapaRestaurantes.class);//mapa de restaurantes
                        startActivity(ii);
                        break;
                    case 1 :
                        Intent ee = new Intent(getApplicationContext(), mapa.class);//mapa de hoteles
                        startActivity(ee);
                        break;
                    case 2 :
                        Intent aa = new Intent(getApplicationContext(), mapaEmergencias.class);//mapa de emergencias
                        startActivity(aa);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Opcion incorrecta", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
