package pattern.creational.factorymethod;

public class CreditCard implements Payment {
    @Override
    public void doPayment(double money) {
        System.out.printf("Paid with credit card: %.2f\n", money);
    }
}
