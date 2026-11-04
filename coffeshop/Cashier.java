package com.example.coffeshop;

import org.springframework.stereotype.Service;

@Service
public class Cashier {
    private final PriceList priceList;

    public  Cashier(PriceList priceList){
        this.priceList = priceList;
    }

    public double calculateTotal(int cups){
        return priceList.getCoffeePrice() * cups;
    }
}
