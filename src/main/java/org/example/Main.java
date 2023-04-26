package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Persona> personas = GeneradorPersonas.generarPersonas(10);

        // Filtrar personas mayores de 30 años y crear una lista con sus nombres
        List<String> nombresMayores30 = personas.stream()
                .filter(p -> p.getEdad() > 30)
                .map(Persona::getNombre)
                .collect(Collectors.toList());

        // Imprimir la lista de nombres de personas mayores de 30 años
        System.out.println("Nombres de personas mayores de 30 años: " + nombresMayores30);

        // Calcular la edad promedio de las personas en la lista
        double edadPromedio = personas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0.0);

        // Imprimir la edad promedio de las personas en la lista
        System.out.println("Edad promedio de las personas en la lista: " + edadPromedio);
    }
}