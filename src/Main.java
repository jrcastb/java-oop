import Abstraccion.*;
import Ejercicios.Fraccion;
import Encapsulamiento.Person;
import Herencia.Sportsman;
import Polimorfismo.Animal;
import Polimorfismo.Cat;
import Polimorfismo.Dog;

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
    }

}

/**
 * class Coche {
 *     String marca;
 *
 *     Coche(String marca){ this.marca = marca; }
 *
 *     String getMarcaCoche(){ return marca; }
 *
 *     void guardarCocheDB(Coche coche){ ... }
 * }
 *
 * */