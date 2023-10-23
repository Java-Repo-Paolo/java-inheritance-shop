package org.lessons.java.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Smartphone[] smartphone = new Smartphone[6];

        smartphone[0] = new Smartphone(
            "Realme 9 5G", "Realme phone",239.90 , 0.22, "64 GB"
        );
        smartphone[1] = new Smartphone(
            "Realme 9 Pro Plus 5G", "Realme phone",289.90 , 0.22, "128 GB"
        );
        smartphone[2] = new Smartphone(
            "Realme GT 5G", "Realme phone",329.90 , 0.22, "128 GB"
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
            "Samsung - Smart TV", "Samsung television with SmartTV included", 599.00, 0.22, "45 pollici", true
        );
        Television[1] = new Television(
            "Samsung 4K", "Samsung television with maximum 4K resolution", 799.00, 0.22, "45 pollici", false
        );
        Television[3] = new Television(
            "Samsung 8K", "Samsung television with maximum 8K resolution", 799.00, 0.22, "45 pollici", false
        );
    }
}
