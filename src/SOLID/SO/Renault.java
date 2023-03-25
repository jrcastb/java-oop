package SOLID.SO;

import SOLID.SO.Carro;

public class Renault extends Carro {
    public static final int PRECIO_RENAULT = 12000;


    @Override
    int precioCarro() {
        return PRECIO_RENAULT;
    }
}
