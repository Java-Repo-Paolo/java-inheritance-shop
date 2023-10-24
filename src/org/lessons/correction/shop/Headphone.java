//QUESTO  è LA CORREZIONE DELL'ESERCIO E NON L'ESERCIZIO FATTO DA ME
//
//PAOLO

package org.lessons.correction.shop;

import java.math.BigDecimal;

public class Headphone extends Product{
    // ATTRIBUTI
    private String color;
    private boolean wireless;

    // COSTRUTTORI

    public Headphone(String name, String description, BigDecimal price,
                   BigDecimal vat, String color, boolean wireless) {
        super(name, description, price, vat);
        this.color = color;
        this.wireless = wireless;
    }

    // METODI

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Headphone{" +
                "code = " + getCode() +
                ", name = '" + getName() + '\'' +
                ", description = '" + getDescription() + '\'' +
                ", price = " + getPrice() +
                ", vat = " + getVat() +
                ", color = '" + color + '\'' +
                ", wireless = " + wireless +
                "} ";
    }
}

