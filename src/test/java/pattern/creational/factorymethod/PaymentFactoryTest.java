package pattern.creational.factorymethod;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PaymentFactoryTest {
    @Test
    public void shouldCreateCorrectObject() {
	assertThat(PaymentFactory.createPayment(PaymentType.CASH)).isInstanceOf(Cash.class);
	assertThat(PaymentFactory.createPayment(PaymentType.CREDIT_CARD)).isInstanceOf(CreditCard.class);
    }
}