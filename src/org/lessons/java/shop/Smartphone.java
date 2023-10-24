package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product {
    private int codeIMEI;
    private String memory;


    public Smartphone(String name, String description, BigDecimal price, BigDecimal iva, String memory) {
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

    @Override
    public String toString() {
        return "Smartphone{" +
                "code = " + getCode() +
                ", name = '" + getName() + '\'' +
                ", description = '" + getDescription() + '\'' +
                ", price = " + getPrice() +
                ", vat = " + getIva() +
                ", imei = '" + codeIMEI + '\'' +
                ", memory = " + memory + "GB" +
                "} ";
    }
}
