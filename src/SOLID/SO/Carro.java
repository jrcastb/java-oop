package SOLID.SO;

import java.util.List;

public abstract class Carro {
    private String marca;
    private String color;
    private String placa;
    //public Carro(String marca){ this.marca = marca; }
    public String getMarcaCarro(){ return marca; }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    //Agregar metodos que no pertenecen a esta clase viola el principio de responsabilidad única.
    /*void guardarCarroDB(Carro carro){
        //AbrirConexión
        //Guardar
        //CerrarConexion
        carro.marca = "Audi";
    }*/
    /*public static void imprimirPrecioCarro(List<Carro> carros){
        //carros.forEach(carro -> System.out.println("carro = " + carro));
        //carros.forEach(System.out::println);//element -
        for (Carro carro: carros) {
            //System.out.println("carro = " + carro);
            if (carro.marca.equals("Audi")) System.out.println(18000);
            if (carro.marca.equals("Renault")) System.out.println(12000);
            if (carro.marca.equals("Hyundai")) System.out.println(15000);
        }*/
    abstract int precioCarro();
    public static void imprimirPrecioCarro(List<Carro> carros){
        for (Carro carro :
                carros) {
            System.out.println("Precio del " + carro.getClass() + "=" + carro.precioCarro());
        }
    }
}


