package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneradorPersonas {
    private static final String[] nombres = {"María", "Juan", "Ana", "Luis", "Lucía", "Pablo", "Elena", "Javier", "Cristina", "Miguel",
            "Lucas", "Laura", "Pedro", "Sara", "Carlos", "Ángela", "Fernando", "Adriana", "Sergio", "Beatriz",
            "David", "Silvia", "Ismael", "Marina", "Diego", "Esther", "Rafael", "Alba", "Antonio", "Paula",
            "Raúl", "Alicia", "Francisco", "Nuria", "Gabriel", "Carmen", "Manuel", "Inés", "Jorge", "Sandra",
            "Mario", "Marta", "Óscar", "Celia", "Daniel", "Clara", "Diego", "Teresa", "José", "Victoria",
            "Iván", "Verónica", "Jesús", "Cristina", "Lorenzo", "Mónica", "Eduardo", "Gloria", "Roberto", "Rocío",
            "Enrique", "Ainhoa", "Héctor", "Lidia", "Julia", "Mariano", "María", "Joaquín", "Carmen", "Salvador",
            "Elvira", "Francisco", "Paula", "Guillermo", "Sonia", "Santiago", "Estefanía", "Eva", "Alberto", "Natalia",
            "José Luis", "Amparo", "Andrés", "Nerea", "Rubén", "Aurora", "Elena", "Jordi", "Paloma", "Xavier"};
    private static final String[] ciudades = {"Tokio", "Nueva York", "Mumbai", "São Paulo", "Delhi", "Shanghái", "Ciudad de México", "El Cairo", "Dhaka", "Pekín",
            "Buenos Aires", "Moscú", "Estambul", "Chongqing", "Londres", "Kolkata", "Teherán", "Lima", "Bangkok", "Shenzhen",
            "Lagos", "Estambul", "Bogotá", "Johannesburgo", "Wuhan", "Taipéi", "Chennai", "Bangalore", "Hong Kong", "Bagdad",
            "Hanoi", "Riad", "Singapur", "Santiago de Chile", "Madrid", "Toronto", "Dallas", "San Francisco", "Filadelfia", "Miami",
            "Seattle", "Minneapolis", "Denver", "Houston", "Detroit", "Phoenix", "San Diego", "Tampa", "Orlando", "Pittsburgh",
            "Washington D.C.", "San Luis", "Portland", "Nashville", "Albuquerque", "Cleveland", "Cincinnati", "Nueva Orleans", "Honolulu",
            "Austin", "Las Vegas", "Indianápolis", "Charlotte", "Salt Lake City", "Kansas City", "Baltimore", "Milwaukee", "Raleigh", "Omaha",
            "Memphis", "Louisville", "Jacksonville", "Richmond", "Oklahoma City", "Providence", "Bridgeport", "Charleston", "Wichita", "Buffalo",
            "Springfield", "Birmingham", "Baton Rouge", "Tucson", "Fargo", "Sioux Falls", "Helena", "Juneau", "Anchorage", "Honolulu"};

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
