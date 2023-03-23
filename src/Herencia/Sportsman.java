package Herencia;

import Encapsulamiento.Person;

public class Sportsman extends Person {

    //constructor
    public Sportsman() {
    }

    public void Run(){
        System.out.println("El deportista: "+ this.getFirstName() + " empezó a correr");
    }

    @Override
    public boolean isOlder(int age) {
        boolean older = false;
        if (age >= 21){
            older = true;
        }
        return older;
    }
}
