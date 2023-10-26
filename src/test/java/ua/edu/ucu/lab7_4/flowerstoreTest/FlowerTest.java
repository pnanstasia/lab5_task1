package ua.edu.ucu.lab7_4.flowerstoreTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab7_4.flowers.Flower;
import ua.edu.ucu.lab7_4.flowers.FlowerColor;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("red", flower.getColor());
    }
}