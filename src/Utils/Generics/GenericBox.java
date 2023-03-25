package Utils.Generics;
/**
 * Versión generica de Box
 * @Paaram <T> T -> Type
 * */
public class GenericBox<T> {
    //T es para Type
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    /**
     * E -> Element
     * K -> Key
     * V -> Value
     * T -> Type
     * N -> Number
     * S, U, V -> Ordinales
     * */
}
