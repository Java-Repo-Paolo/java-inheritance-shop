package org.lessons.java.shop;

public class Television extends Product{

    private String dimensionsTV;
    private boolean smartTV;

    public Television(String name, String description, double price, double iva, String dimensionsTV, boolean smartTV) {
        super(name, description, price, iva);
        this.dimensionsTV = dimensionsTV;
        this.smartTV = false;
    }
}
