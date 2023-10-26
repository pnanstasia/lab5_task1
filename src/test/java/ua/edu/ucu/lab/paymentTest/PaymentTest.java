package ua.edu.ucu.lab.paymentTest;

import org.junit.jupiter.api.Assertions;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab.payment.CreditCartPaymentStrategy;
import ua.edu.ucu.lab.payment.PayPalPaymentStrategy;

public class PaymentTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private CreditCartPaymentStrategy creditCardPayment;
    private PayPalPaymentStrategy PayPalPayment;

    @BeforeEach
    public void init() {
        creditCardPayment = new CreditCartPaymentStrategy();
        PayPalPayment = new PayPalPaymentStrategy();
    }

    @Test
    public void testCreditCardPaymentStrategy() {
        double price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        Assertions.assertEquals(creditCardPayment.pay(price), "You chose payment by card");
    }

    @Test
    public void testPayPalPaymentStrategy() {
        double price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        Assertions.assertEquals(PayPalPayment.pay(price), "You choose Pay Pal payment");
    }
}