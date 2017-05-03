package com.example.android.personas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarPersonas extends AppCompatActivity {
    private ListView lista;
    private ArrayList<Persona> personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);

        lista=(ListView)findViewById(R.id.lvListadoPersonas);
        personas=Datos.getPersonas();

        AdaptadorPersona adapter= new AdaptadorPersona(this,personas);
        lista.setAdapter(adapter);
    }
}
