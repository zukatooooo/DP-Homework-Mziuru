package org.example.N4;

public class Main {
    public static void main(String[] args) {
        Currency rupee = new Rupee(100.0);// ar minaxavs kursi me davwere ubralod
        Currency dollar = new Dollar(1.0);
        Currency usdRupee = new USDDecorator(rupee);

        System.out.println("Rupee Description: " + rupee.getCurrencyDescription());
        System.out.println("Rupee Cost in Rupee: " + rupee.cost(10));

        System.out.println("Dollar Description: " + dollar.getCurrencyDescription());
        System.out.println("Dollar Cost in Rupee: " + dollar.cost(10));

        System.out.println("USD Rupee Description: " + usdRupee.getCurrencyDescription());
        System.out.println("USD Rupee Cost in Rupee: " + usdRupee.cost(10));
    }
}
