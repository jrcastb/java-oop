package Abstraccion;

public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double payment(){
        System.out.println("Dentro del pago computado al empleado");
        return 0.0d;
    }
    public void emailPayment(){
        System.out.println("Enviando el cheque del pago por correo a " + this.name + " " + this.address);
    }
}
