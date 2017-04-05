package com.example.android.personas;

/**
 * Created by android on 04/04/2017.
 */

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String pasatiempo;

    public Persona(String nombre, String apellido, int edad, String pasatiempo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pasatiempo = pasatiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getPasatiempo() {
        return pasatiempo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPasatiempo(String pasatiempo) {
        this.pasatiempo = pasatiempo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
