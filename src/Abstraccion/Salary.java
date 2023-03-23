package Abstraccion;

public class Salary  extends Employee{
    private double salary;
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);//Employee(name, addres, number);
        setSalary(salary);
    }

    @Override
    public void emailPayment() {
        System.out.println("emailPayment from Employee");
        System.out.println("Enviando cheque a " + this.getName() + " con la dirección " + this.getAddress()
                        + " y un salario de " + this.getSalary()
                );
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double payment(){
        double salaryByMoth = this.getSalary()/12;
        System.out.println("El pago por mes del empleado " + this.getName()
        + " es " + salaryByMoth);
        return salaryByMoth;
    }
}
