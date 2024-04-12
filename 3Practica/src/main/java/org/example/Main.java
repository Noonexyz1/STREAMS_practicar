package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static List<Integer> createRamdomList(int size){
        var ramdom = new Random();
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < size; i++){
            numbers.add(ramdom.nextInt(100));
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(createRamdomList(5_000_000));
    }
}