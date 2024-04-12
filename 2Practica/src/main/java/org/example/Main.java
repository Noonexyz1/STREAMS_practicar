package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List jedis = List.of("Yoda", "Windu", "Anakin", "Luke", "Rey");

        // forEach() es una funcion high order
        jedis.forEach(param -> System.out.println(param));
        jedis.forEach(System.out::println);


        // ejemplo Map, Map. Reduce
        var theJedis = jedis.stream()
                .peek(System.out::println)  //peek() para auditoria
                .filter(s -> !s.equals("Rey"))
                .peek(System.out::println)
                .map(j -> j.toString().toUpperCase())
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Resultado: " + theJedis);

    }
    
    
}