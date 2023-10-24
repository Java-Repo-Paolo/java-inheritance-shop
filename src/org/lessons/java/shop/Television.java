package org.lessons.java.shop;

import java.math.BigDecimal;

public class Television extends Product{

    private int dimensionsTV;
    private boolean smartTV;

    public Television(String name, String description, BigDecimal price, BigDecimal iva, int dimensionsTV, boolean smartTV) {
        super(name, description, price, iva);
        this.dimensionsTV = dimensionsTV;
        this.smartTV = smartTV;
    }

    public int getDimensionsTV() {
        return dimensionsTV;
    }

    public void setDimensionsTV(int dimensions) {
        this.dimensionsTV = dimensionsTV;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public void setSmartTV(boolean smart) {
        this.smartTV = smart;
    }

    @Override
    public String toString() {
        return "Television{" +
                "code = " + getCode() +
                ", name = '" + getName() + '\'' +
                ", description = '" + getDescription() + '\'' +
                ", price = " + getPrice() +
                ", vat = " + getIva() +
                ", dimensions = "+ dimensionsTV +
                ", smart = " + smartTV +
                "} ";
    }
}
