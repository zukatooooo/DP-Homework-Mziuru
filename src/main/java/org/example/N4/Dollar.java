package org.example.N4;

public class Dollar extends Currency {
    private double value;

    public Dollar(double value) {
        this.description = "Dollar";
        this.value = value;
    }

    @Override
    public double cost(double c) {
        return value * c;
    }
}
