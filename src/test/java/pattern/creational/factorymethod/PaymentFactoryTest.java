package pattern.creational.factorymethod;

import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class PaymentFactoryTest {
    @Test
    public void shouldCreateCorrectObject() {
        assertThat(PaymentFactory.createPayment(PaymentType.CASH), instanceOf(Cash.class));
        assertThat(PaymentFactory.createPayment(PaymentType.CREDIT_CARD), instanceOf(CreditCard.class));
    }
}