package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneradorPersonas {
    private static final String[] nombres = {"Juan", "Ana", "Pedro", "Maria", "Luis", "Carmen", "Carlos", "Laura"};
    private static final String[] ciudades = {"Buenos Aires", "Madrid", "Lima", "Santiago", "México", "Bogotá", "Londres", "Nueva York"};

    public static List<Persona> generarPersonas(int cantidad) {
        List<Persona> personas = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[rand.nextInt(nombres.length)];
            int edad = rand.nextInt(61) + 20;
            String ciudad = ciudades[rand.nextInt(ciudades.length)];

            personas.add(new Persona(nombre, edad, ciudad));
        }

        return personas;
    }
}
