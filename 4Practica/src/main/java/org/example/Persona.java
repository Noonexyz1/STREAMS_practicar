package org.example;

public class Persona {
    private int id;
    private String nombre;
    private String apellidos;
    private String celular;
    private int edad;
    private double estatura;

    public Persona(int id, String nombre, String apellidos, String celular, int edad, double estatura) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Persona(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", celular='" + celular + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                '}';
    }
}
