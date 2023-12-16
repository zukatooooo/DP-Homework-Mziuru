package org.example.N4;

public class USDDecorator extends Decorator {
    private Currency currency;

    public USDDecorator(Currency currency) {
        this.currency = currency;
        this.description = "USD";
    }

    @Override
    public String getDescription() {
        return currency.getCurrencyDescription() + ", " + this.description;
    }

    @Override
    public double cost(double c) {
        return currency.cost(c);
    }
}
