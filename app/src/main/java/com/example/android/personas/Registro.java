package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Registro extends AppCompatActivity {
    private EditText nomb, apell, edad;
    private CheckBox leer, bailar, programar;
    private Resources res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        res = this.getResources();
        nomb = (EditText)findViewById(R.id.txtNombre);
        apell = (EditText)findViewById(R.id.txtApellido);
        edad = (EditText)findViewById(R.id.txtEdad);
        leer = (CheckBox)findViewById(R.id.chkLeer);
        bailar = (CheckBox)findViewById(R.id.chkBailar);
        programar = (CheckBox)findViewById(R.id.chkProgramar);
    }

    public void registrar(View v){
        String nombre,apellido, aux = "";
        int ed;
        nombre = nomb.getText().toString().trim();
        apellido = apell.getText().toString().trim();
        ed = Integer.parseInt(edad.getText().toString().trim());

        if(leer.isChecked()) aux = res.getString(R.string.leer);
        if(bailar.isChecked()) aux = aux+", "+res.getString(R.string.bailar);
        if(programar.isChecked()) aux = aux+", "+res.getString(R.string.programar);

        Persona p = new Persona(nombre,apellido,ed,aux);
        p.guardar();
        new AlertDialog.Builder(this).setMessage(res.getString(R.string.mensaje)).show();
        limpiar();
    }

    public void borrar(View v){
        limpiar();
    }

    public void limpiar(){
        nomb.setText("");
        apell.setText("");
        edad.setText("");
        leer.setChecked(true);
        bailar.setChecked(false);
        programar.setChecked(false);
        nomb.requestFocus();
    }
}
