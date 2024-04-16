package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        List<Empleado> empleados = leerListaArchivoJSON();
        empleados.forEach(System.out::println);

        //stream().filter()
        empleados.stream()
                .filter(emp -> emp.getNombre().startsWith("J"))
                .filter(emp -> emp.getPuesto().equals("Ingeniero Civil"))
                .filter(emp -> emp.getEstatura() > 175)
                .forEach(System.out::println);

        //stream().limit()
        empleados.stream().limit(10)
                .forEach(System.out::println);

        //stream().skip() - salta los primero n elementos
        empleados.stream().skip(10)
                .forEach(System.out::println);

        //stream().map()
        empleados.stream()
                .map(emp -> new Empleado(emp.getId() + 100,
                                        emp.getNombre(),
                                        emp.getApellidos(),
                                        emp.getEdad(),
                                        emp.getPuesto(),
                                        emp.getSalario(),
                                        emp.getEstatura())
                )
                .forEach(System.out::println);

        //stream().reduce()
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        int a = empleados.stream()
                .map(Empleado::getSalario)
                .reduce(0, binaryOperator);
        System.out.println(a);

        //stream().count()
        long numElem = empleados.stream().count();
        System.out.println(numElem);

        //stream().findFirst()
        Optional<Empleado> miEmp = empleados.stream().findFirst();
        System.out.println(miEmp.get());

        //stream().max()
        Optional<Integer> miEmp2 = empleados.stream()
                .map(Empleado::getSalario)
                .max(Integer::compare);
        System.out.println(miEmp2.get());



        //stream().peek().forEach() - modifica la estructura origen (tener mucho cuidado)
        empleados.stream()
                .peek(emp -> emp.setId(emp.getId() + 100))
                .forEach(System.out::println);
        empleados.forEach(System.out::println);



        //lista.removeIf() - modifica la estructura origen (tener cuidado)
        empleados.removeIf(emp -> emp.getEstatura() < 150);
        empleados.forEach(System.out::println);

        //lista.forEach()
        empleados.forEach(System.out::println);
    }

    public static List<Empleado> leerListaArchivoJSON() throws URISyntaxException, IOException {
        LeerArchivo leerArchivo = new LeerArchivo();
        File fichero = leerArchivo.getFileFromResourceFile("persona-lista.json");
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(fichero, new TypeReference<>(){});
    }

}