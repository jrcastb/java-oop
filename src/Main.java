import SOLID.L.Duck;
import SOLID.L.Ostrich;
import SOLID.SO.Audi;
import SOLID.SO.Carro;
import SOLID.SO.Hyundai;
import SOLID.SO.Renault;
import Utils.Comparator.ComparadorNombre;
import Utils.Comparator.Persona;
import Utils.Generics.Box;
import Utils.Generics.GenericBox;
import Utils.Generics.OrderedPair;
import Utils.Generics.Pair;
import Utils.Week;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int numero;
    public static void main(String[] args) {

        /*
        Person person = new Person();
        Person camila = new Person("Camila");
        Person alejandra = new Person("Alejandra","Martinez", 19, 'F');

        int number = 10;
        //person.firstName = "Jose";//Mal
        person.setFirstName("Jose");//Bien
        System.out.println(person.isOlder(20));
        number = 15;
        person.setFirstName("Daniel");
        person.setLastName("Ramirez");
        person.setAge(18);
        person.setGender('M');


        System.out.println(person);

        System.out.println(person.getFirstName() +" "+ person.getLastName());

        Sportsman sportsman = new Sportsman();
        sportsman.setFirstName("Carolina");
        sportsman.setAge(18);
        sportsman.Run();

        System.out.println(person.isOlder(person.getAge()));//true
        System.out.println(sportsman.isOlder(sportsman.getAge()));//false
        */
        /**
         * Polimorfismo Animals
         * */
        /*
        Animal dog = new Dog();
        dog.setSpecie("Bulldog");
        dog.setColor("White");
        Animal cat = new Cat();
        cat.setSpecie("Egipcio");
        cat.setColor("Gray");
        System.out.println("=============== Animal : Dog ===================");
        System.out.println(dog);
        dog.makeSound(dog);
        System.out.println("=============== Animal : Cat ===================");
        System.out.println(cat);
        cat.makeSound(cat);*/

        /**
         * Abstracción Employee
         * */

        //Employee employee = new Employee();
        //Clase abstracta
        /*Employee employee = new Salary("Sabrina", "calle falsa 123", 1, 58080.58);

        employee.emailPayment();
        //Interfaces
        IFigure rectangulo = new Rectangle(10d, 15d);
        IFigure cuadrado = new Square(10d);
        rectangulo.Draw();
        rectangulo.calculateArea();
        System.out.println(rectangulo.calculateArea());
        cuadrado.Draw();
        System.out.println(cuadrado.calculateArea());*/

        /* FRACCIONES
        System.out.println("=================================== Fracciones ==================================");
        System.out.println("=============== 1. Suma de Fracciones ===================");

        String resultadoSuma = Fraccion.sumar("1/2", "2/3");
        System.out.println("resultado = " + resultadoSuma);
        System.out.println("=============== 2. Resta de Fracciones ===================");
        String resultadoResta = Fraccion.restar("1/2", "2/3");
        System.out.println("resultadoResta = " + resultadoResta);
        System.out.println("=============== 3. Multiplicación de Fracciones ===================");
        String resultadoMultiplicacion = Fraccion.multiplicar("1/2", "2/3");
        System.out.println("resultadoMultiplicacion = " + resultadoMultiplicacion);
        System.out.println("=============== 4. División de Fracciones ===================");
        String resultadoDivision = Fraccion.dividir("1/2", "2/3");
        System.out.println("resultadoDivision = " + resultadoDivision); //"1/2" + 1
        */
        /*
        List<Carro> carros = new ArrayList<>();
        carros.add(new Audi());
        carros.add(new Renault());
        carros.add(new Hyundai());
        //carros.add(new Carro("Audi"));
        //carros.add(new Carro("Renault"));
        //carros.add(new Carro("Hyundai"));

        Carro.imprimirPrecioCarro(carros);

        Duck pato = new Duck();
        pato.Run();
        Ostrich avestruz = new Ostrich();
        avestruz.Run();
        */

        /*for (Week day : Week.values()) {
            System.out.println("day = "+day + " is " + day.ordinal());
        }

        GenericBox<Integer> integerBox = new GenericBox<>();
        GenericBox<String> stringBox = new GenericBox<>();
        GenericBox<Box> box = new GenericBox<>();

        integerBox.setT(2);
        stringBox.setT("nombre");
        Box boxx = new Box();
        box.setT(boxx);

        Pair<String, Integer> pair1 = new OrderedPair<>("Jose", 26);
        OrderedPair<String, Integer> pair2 = new OrderedPair<>("Carolina",30);
        Pair<Integer, String> pair3 = new OrderedPair<>(10, "Felipe");
        Pair<GenericBox<Integer>, String> genericBoxStringPair = new OrderedPair<>(integerBox, "Generic Box Integer");
        */

        Persona p1 = new Persona("Jose", "Castillo", 26);
        Persona p2 = new Persona("Carlos", "Bermudez", 24);

        Persona p3 = new Persona("Carolina", "Quintero", 30);
        Persona p4 = new Persona("Breylin", "Velasquez", 21);
        Persona p5 = new Persona("Luis", "Arredondo", 19);

        List<Persona> personas = Arrays.asList(p1, p2, p3, p4, p5);
        personas.forEach(System.out::println);
        System.out.println("=============================================");
        personas.sort((pa, pb) -> pa.getNombre().compareTo(pb.getNombre()));
        personas.forEach(System.out::println);
        personas.sort((pa, pb)-> pa.getApellido().compareTo(pb.getApellido()));
        System.out.println("==============================================");
        personas.forEach(System.out::println);
        System.out.println("==============================================");
        personas.sort((pa, pb) -> pa.getEdad().compareTo(pb.getEdad()));
        personas.forEach(System.out::println);
        System.out.println("=============================================");
        personas.sort(new ComparadorNombre());
        personas.forEach(System.out::println);

    }

}
