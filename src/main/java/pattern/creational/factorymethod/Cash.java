package pattern.creational.factorymethod;

public class Cash implements Payment {
    @Override
    public void doPayment(double money) {
        System.out.printf("Paid with cash: %.2f\n", money);
    }
}
