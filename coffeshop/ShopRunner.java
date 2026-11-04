package com.example.coffeshop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShopRunner implements CommandLineRunner {

    private final CoffeeShop coffeeShop;

    public ShopRunner(CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
    }

    @Override
    public void run(String... args) {
        coffeeShop.sellCoffee(3);
    }
}