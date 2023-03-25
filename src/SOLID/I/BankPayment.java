package SOLID.I;

import java.util.ArrayList;
import java.util.List;

public class BankPayment implements IBank{


    @Override
    public Boolean status() {
        return true;
    }

    @Override
    public List<String> getPayments() {
        List<String> payments = new ArrayList<>();
        payments.add("pago 1");
        payments.add("pago 2");
        return payments;
    }


    @Override
    public void initiatePayment() {

    }
}
