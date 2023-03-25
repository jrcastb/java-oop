package SOLID.SO;

import SOLID.SO.Carro;

public class Hyundai extends Carro {
    public static final int PRECIO_HYUNDAI = 15000;

    @Override
    int precioCarro() {
        return PRECIO_HYUNDAI;
    }
}
