package com.example.coffeshop;

import org.springframework.stereotype.Component;

@Component
public class Barista {
    public String prepareCoffee(){
        return "Przygotowywuje kawe.....";
    }
}
