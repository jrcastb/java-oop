package Ejercicios;

public class Fraccion {
    /**
     * Crea una clase Fraccion con métodos necesarios para sumar, restar, multiplicar y dividir fracciones.
     * Todos los métodos deben estar sobrecargados de modo que también puedan
     * usarse para operar entre fracciones y números enteros (por ejemplo: ⅗+2 o ⅝*4).
     * */
     public static String sumar(String a, String b){
         /**
          * Separar la cadena en un numerador y un denominador.
          * Usando la función split  '/'
          */
         String[] operadorA = a.split("/"); // a = 1/2 ---- b = 2/3 --> ["1","2"] ---- ["2", "3"] == [numerador, denominador] [index0, index1]
         String[] operadorB = b.split("/");

         /**
          * extraer el indice 0 para el numerador y el indice 1 para el denominador en ambas fracciones.
          * */
         Integer numeradorA = Integer.valueOf(operadorA[0]);
         Integer denominadorA = Integer.valueOf(operadorA[1]);

         Integer numeradorB = Integer.parseInt(operadorB[0]);
         Integer denominadorB = Integer.parseInt(operadorB[1]);

         /**
          * Realizar el calculo de la suma de fracciones
          * a/d+b/c = (a*d + b*c)/b*d
          * */
         String Numerador = String.valueOf(numeradorA * denominadorB + numeradorB * denominadorA);
         String Denominador = String.valueOf(denominadorA * denominadorB);

         return Numerador + "/" + Denominador;

     }

     public static String restar(String a, String b){
         // restar(String a, Integer b)
         /**
          * Separar la cadena en un numerador y un denominador.
          * Usando la función split  '/'
          */
         String[] operadorA = a.split("/");
         String[] operadorB = b.split("/");

         /**
          * extraer el indice 0 para el numerador y el indice 1 para el denominador en ambas fracciones.
          * */
         Integer numeradorA = Integer.valueOf(operadorA[0]);
         Integer denominadorA = Integer.valueOf(operadorA[1]);

         Integer numeradorB = Integer.parseInt(operadorB[0]);
         Integer denominadorB = Integer.parseInt(operadorB[1]);

         /**
          * Realizar el calculo de la suma de fracciones
          * a/d-b/c = (a*d - b*c)/b*d
          * */
         String Numerador = String.valueOf(numeradorA * denominadorB - numeradorB * denominadorA);
         String Denominador = String.valueOf(denominadorA * denominadorB);

         return Numerador + "/" + Denominador;

     }

     public static String multiplicar(String a, String b){
         String[] operadorA = a.split("/");
         String[] operadorB = b.split("/");

         Integer numeradorA = Integer.parseInt(operadorA[0]);
         Integer denominadorA = Integer.parseInt(operadorA[1]);

         Integer numeradorB = Integer.parseInt(operadorB[0]);
         Integer denominadorB = Integer.parseInt(operadorB[1]);

         //Realizar el calculo de la multiplicación de dos fracciones a/d * b/c -> a*b / d*c
         String Numerador = String.valueOf(numeradorA * numeradorB);
         String Denominador = String.valueOf(denominadorA * denominadorB);

         return Numerador + "/" + Denominador;
     }

     public static String dividir(String a, String b){
         String[] operadorA = a.split("/");
         String[] operadorB = b.split("/");

         Integer numeradorA = Integer.parseInt(operadorA[0]);
         Integer denominadorA = Integer.parseInt(operadorA[1]);

         Integer numeradorB = Integer.parseInt(operadorB[0]);
         Integer denominadorB = Integer.parseInt(operadorB[1]);

         //Realizamos el calculo de la división de fracciones a/d / b/c -> a*c/d*b
         String Numerador = String.valueOf(numeradorA*denominadorB);
         String Denominador = String.valueOf(denominadorA * numeradorB);

         return Numerador + "/" + Denominador;
     }
}
