package com.example.coffeshop;

import org.springframework.stereotype.Component;
@Component
public class CoffeeShop {
    private final PriceList priceList;
    private final Barista barista;
    private final Cashier cashier;

    public CoffeeShop(PriceList priceList, Barista barista, Cashier cashier){
        this.barista = barista;
        this.cashier = cashier;
        this.priceList = priceList;
    }

    public void sellCoffee(int cups){
        System.out.println(barista.prepareCoffee());
        double total = cashier.calculateTotal(cups);
        System.out.println("Do zapłaty: " + total + " zł");
    }
}
