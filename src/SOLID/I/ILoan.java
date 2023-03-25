package SOLID.I;

public interface ILoan extends IPayment {
    void initiateLoanSettelment();
    void initiateRepayment();
}
