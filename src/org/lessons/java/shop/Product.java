package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    //Attributi
    private int code;
    private String name;
    private String description;
    //private double price;
    private double price;
    private double iva;

    //Costruttori
    public Product(String name, String description, double price, double iva){
        this.code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }


    //METODI

    //Metodi - Getter e Setter

    //Codice
    public int getCode() {
        return code;
    }

    //Nome
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Descrizione
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    //Prezzo
    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //Iva
    public double getIva() {
        return iva;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }

    //Metodi - Operazioni

    //Codice
    private int generateCode() {
        Random random = new Random();
        return random.nextInt(1, 100000);
    }
    // Metodo - prezzo + iva
    public double getFullPrice() {
        // prezzo base + prezzo base * iva
        return price = price  + (price * iva);
    }
    // Metodo - nome + codice
    public String getFullName() {
        return name + " - " + code;
    }

}


