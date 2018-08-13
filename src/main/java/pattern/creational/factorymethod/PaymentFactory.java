package pattern.creational.factorymethod;

/**
 * Factory Method.
 * Esta clase contiene la responsabilida de crear los objetos de una familia.
 * Abstrae al desarrollador de saber como son creados.
 * Se aprovecha el polimorfismo.
 */
public class PaymentFactory {
    public static Payment createPayment(PaymentType paymentType) {
        if (paymentType.equals(PaymentType.CASH)) {
            return new Cash();
        } else if (paymentType.equals(PaymentType.CREDIT_CARD)) {
            return new CreditCard();
        }
        return null;
    }
}
