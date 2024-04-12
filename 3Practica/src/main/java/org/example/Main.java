package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static List<Integer> createRamdomList(int size){
        var ramdom = new Random();
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < size; i++){
            numbers.add(ramdom.nextInt(100));
        }
        return numbers;
    }

    public static void sortList(List<Integer> unsortedList){
        Collections.sort(unsortedList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
    }

    public static void sortLambdaList(List<Integer> unsortedList){
        Collections.sort(unsortedList, (o1, o2) -> o2.compareTo(o1));
    }

    public static boolean isPrimeNumber(int n){
        if (n <= 1)
            return false;

        var contador = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                contador++;

        }
        return contador <= 2;
    }



    public static void main(String[] args) {

        System.out.println("Iniciando Calculo");
        //var listadoPrimos = createRamdomList(Integer.parseInt(args[0])).stream()
        //var listadoPrimos = createRamdomList(50_000_000).parallelStream()
        var listadoPrimos = createRamdomList(50_000_000).stream()
                .filter(Main::isPrimeNumber)
                .sorted()
                .toList();

        System.out.println("Calculo Finalizado");
        System.out.println(listadoPrimos);


        //Generar un flujo de enteros de 0 a 100
        /*var primos = IntStream.range(0, 100).boxed()
                .filter(n -> isPrimeNumber(n))
                .toList();

        System.out.println(primos);*/

        //Ordenamiento con clase anonima y con funcion lambda
        /*var randomNumbers = createRamdomList(10);
        System.out.println(randomNumbers);
        //sortList(randomNumbers);
        sortLambdaList(randomNumbers);
        System.out.println(randomNumbers);*/

    }
}