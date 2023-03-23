package Polimorfismo;

public class Animal {
    private String specie;
    private String color;

    public Animal(){

    }
    public Animal(String specie) {
        this.specie = specie;
    }

    public Animal(String specie, String color) {
        this.specie = specie;
        this.color = color;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound(Animal animal){
        System.out.println("Sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "specie='" + specie + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
