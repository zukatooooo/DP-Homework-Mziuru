package org.example.N4;

public class Rupee extends Currency {
    private double value;

    public Rupee(double value) {
        this.description = "Rupee";
        this.value = value;
    }

    @Override
    public double cost(double c) {
        return value * c;
    }
}
