package org.lessons.java.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Smartphone[] smartphone = new Smartphone[6];

        smartphone[0] = new Smartphone(
            "Realme 9 5G",
            "Realme phone",
            239.90 ,
            0.22,
            "64 GB"
        );
        smartphone[1] = new Smartphone(
            "Realme 9 Pro Plus 5G",
            "Realme phone",
            289.90 ,
            0.22,
            "128 GB"
        );
        smartphone[2] = new Smartphone(
            "Realme GT 5G",
            "Realme phone",
            329.90 ,
            0.22,
            "128 GB"
        );
        /*smartphone[3] = new Smartphone(
            "Realme GT Pro Plus 5G", "Realme phone",389.90 , 0.22, "128 GB")
        ;
        smartphone[4] = new Smartphone(
            "Realme GT2 5G", "Realme phone",439.90 , 0.22, "128 GB"
        );
        smartphone[5] = new Smartphone(
            "Realme GT2 Pro 5G", "Realme phone",489.90 , 0.22, "128 GB"
        );*/


        Television[] Television = new Television[6];

        Television[0] = new Television(
            "Samsung - Smart TV",
            "Samsung television with SmartTV included",
            599.00,
            0.22,
            "45 pollici",
            true
        );
        Television[1] = new Television(
            "Samsung 4K",
            "Samsung television with maximum 4K resolution",
            799.00,
            0.22,
            "45 pollici",
            false
        );
        Television[3] = new Television(
            "Samsung 8K",
            "Samsung television with maximum 8K resolution",
            799.00,
            0.22,
            "45 pollici",
            false
        );

        //Chidere quale tipologia di prodotto sceglie il cliente


        boolean quit = false;
        while(!quit){
            System.out.println("Choose an type of product: ");
            System.out.println("1 - Smartphones");
            System.out.println("2 - Televisions");
            System.out.println("3 - Headphones");
            System.out.println("4 - Exit");

            System.out.println("Write the chosen option: ");
            int choseProduct = scanner.nextInt();

            switch (choseProduct){
                case 1:
                    for (int i = 0; i < smartphone.length; i++) {
                        System.out.println("Choose one smartphone: ");
                        System.out.println("1 - Realme 9 5G");
                        System.out.println("2 - Realme 9 Pro Plus 5G");
                        System.out.println("3 - Realme phone");
                        System.out.println("4 - Exit");
                    }
                    break;
            }
        }

    }
}
