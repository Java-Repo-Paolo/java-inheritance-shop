package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Product {
    private int codeIMEI;
    private String memory;


    public Smartphone(String name, String description, double price, double iva, String memory) {
        super(name, description, price, iva);
        this.codeIMEI = generateCodeIMEI();
        this.memory = memory;
    }

    public int getCodeIMEI() {
        return codeIMEI;
    }

    public String getMemory() {
        return memory;
    }

    private int generateCodeIMEI() {
        Random random = new Random();
        return random.nextInt(1, 100000);
    }
}
