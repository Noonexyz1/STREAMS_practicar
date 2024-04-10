package org.example;

public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }


    // metodo para enviar el compotamiento nada mas,
    // con que cumpla con la firma de la interfaz Consumer =)
    public static void metodoRefMostrarNombrePersona(Persona per){
        System.out.println(per.nombre);
    }

}
