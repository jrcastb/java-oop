package Polimorfismo;

public class Cat extends Animal{
    @Override
    public void makeSound(Animal animal) {
        System.out.println("Miau...");
    }
}
