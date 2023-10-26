package ua.edu.ucu.lab.deliverTest;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab.deliverly.DHLDeliverlyStrategy;
import ua.edu.ucu.lab.deliverly.PostDeliveryStrategy;

public class DeliveryTest {
    private PostDeliveryStrategy postDelivery;
    private DHLDeliverlyStrategy dhldelivery;

    @BeforeEach
    public void init() {
        postDelivery = new PostDeliveryStrategy();
        dhldelivery = new DHLDeliverlyStrategy(); 
    }

    @Test
    public void testPostDelivery() {
        Assertions.assertEquals(postDelivery.deliver(null), "You selected post deliverly");
    }

    @Test
    public void testDHLDelivery() {
        Assertions.assertEquals(dhldelivery.deliver(null),
         "DHL deliver, thanks for your choise!");
    }
}

