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
import Utils.Streams.Author;
import Utils.Streams.Book;
import Utils.Week;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

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
        /*
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
        personas.sort((pa, pb) -> pa.getApellido().compareTo(pb.getApellido()));
        System.out.println("==============================================");
        personas.forEach(System.out::println);
        System.out.println("==============================================");
        personas.sort((pa, pb) -> pa.getEdad().compareTo(pb.getEdad()));
        personas.forEach(System.out::println);
        System.out.println("=============================================");
        personas.sort(new ComparadorNombre());
        personas.forEach(System.out::println);
        */

        
        Author jhon = new Author("Jhon", "Kaz", "masculino", 28);
        Book book1 = new Book("Psicoanalista", jhon,"ABC12345", 358L);
        Author jkr = new Author("JK", "Rowling", "femenino", 37);
        Book book2 = new Book("Harry Potter", jkr,"DBC67891", 269L);
        Author stephen = new Author("Stephen", "King", "masculino", 74);
        Book book3 = new Book("It", jhon,"ITI348975", 1028L);
        Author mario = new Author("Mario", "Mendoza", "masculino", 40);
        Book book4 = new Book("satanas", jhon,"STN89235", 652L);
        Author gabo = new Author("Gabriel", "Garcia", "masculino", 82);
        Book book5 = new Book("Cien años de soledad", jhon,"CND100135", 522L);


        List<Book> books = Arrays.asList(book1, book2, book3, book4, book5);
        System.out.println("=====================");

       Integer result = books.stream().map(Book::getAuthor)
               .filter(author -> Objects.equals(author.getGender(), Author.MASCULINO))
               .map(Author::getAge)
               .reduce(0, Integer::sum);


       System.out.println("result = " + result);

       /*
       *
                .filter(age -> age > 40)
                .reduce(0, Integer::sum);
       * */

       Date date = new Date();
       System.out.println("date = " + date);
       LocalDate localDate = LocalDate.now();
       System.out.println("localDate = " + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        Calendar calendar = new GregorianCalendar();

    }

}
