package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Persona> personas = GeneradorPersonas.generarPersonas(10);

        // Filtrar personas mayores de 30 años y crear una lista con sus nombres
        List<String> nombresMayores30 = personas.stream()
                .filter(p -> p.getEdad() > 30)
                .map(Persona::getNombre)
                .toList();

        // Imprimir la lista de nombres de personas mayores de 30 años
        System.out.println("Nombres de personas mayores de 30 años: " + nombresMayores30);

        // Calcular la edad promedio de las personas en la lista
        double edadPromedio = personas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0.0);

        // Imprimir la edad promedio de las personas en la lista
        System.out.println("Edad promedio de las personas en la lista: " + edadPromedio);



        System.out.println("-------------------------------------------------------");
        List<Persona> listaDePersonas = GeneradorPersonas.generarPersonas(50);
        listaDePersonas.forEach(persona -> System.out.println(persona.getNombre()));

        //Imprimir todos nombres de personas sque empiezan con J
        System.out.println("-------------------------------------------------------");
        listaDePersonas.stream()
                .filter(persona -> persona.getNombre().startsWith("J"))
                .forEach(x -> System.out.println(x.getNombre()));

        //del anterior sacar la edad media de todos los nombre que empiezen con D
        System.out.println("-------------------------------------------------------");
        double mediaEdad = listaDePersonas.stream()
                .filter(x -> x.getNombre().startsWith("J"))
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0.0);

        System.out.println(mediaEdad);


    }


}