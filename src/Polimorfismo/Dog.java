package Polimorfismo;

public class Dog extends Animal{
    @Override
    public void makeSound(Animal animal) {
        System.out.println("Guau...");
    }
}
