package pattern.creational.factorymethod;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.createPayment(PaymentType.CASH);

        payment.doPayment(1000.50); // Salida: Paid with cash: 1000.50
    }
}
