package ua.edu.ucu.lab7_4.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(Flower flower) {
    }

    public Flower() {
    }

    public String getColor() {
        return color.toString();
    }
}
