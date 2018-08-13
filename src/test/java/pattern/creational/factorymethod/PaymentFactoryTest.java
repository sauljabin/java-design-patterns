package pattern.creational.factorymethod;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class PaymentFactoryTest {
    @Test
    public void shouldCreateCorrectObject() {
        assertThat(PaymentFactory.createPayment(PaymentType.CASH), instanceOf(Cash.class));
        assertThat(PaymentFactory.createPayment(PaymentType.CREDIT_CARD), instanceOf(CreditCard.class));
    }

    /**
     * Este es un ejemplo de como se utilizaría el patrón.
     */
    @Ignore
    @Test
    public void exampleFactoryMethod() {
        Payment payment = PaymentFactory.createPayment(PaymentType.CASH);

        payment.doPayment(1000.50);
    }
}