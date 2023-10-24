package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many products? ");
        int cartSize = Integer.parseInt(scanner.nextLine());
        Product[] cart = new Product[cartSize];

        for (int i = 0; i < cart.length ; i++) {
            System.out.println("Insert product " + (i + 1));

            boolean quit;

            do {
                //Chiedere quale tipologia di prodotto sceglie il cliente
                System.out.println("Choose an type of product: ");
                System.out.println("1 - Smartphones");
                System.out.println("2 - Televisions");
                System.out.println("3 - Headphones");
                System.out.println("4 - Exit");

                System.out.println("Write the chosen option: ");
                String choseProduct = scanner.nextLine();
                switch (choseProduct){
                    case "1":
                        System.out.println("Enter your smartphone data");
                        quit = false;
                        System.out.println("Smartphones - name: ");
                        String namePhone = scanner.nextLine();
                        System.out.println("Smartphones - description: ");
                        String descriptionPhone = scanner.nextLine();
                        System.out.println("Smartphones - memory: ");
                        String memoryPhone = scanner.nextLine();
                        System.out.println("Smartphones - price: ");
                        String pricePhone = scanner.nextLine();
                        System.out.println("Smartphones - Iva: ");
                        String ivaPhone = scanner.nextLine();
                        Smartphone smartphone = new Smartphone(
                                namePhone,
                                descriptionPhone,
                                new BigDecimal(pricePhone),
                                new BigDecimal(ivaPhone),
                                memoryPhone
                        );
                        cart[i] = smartphone;
                        break;
                    case "2":
                        System.out.println("Enter your television data");
                        quit = false;
                        System.out.println("Television - name: ");
                        String nameTelevision = scanner.nextLine();
                        System.out.println("Television - description: ");
                        String descriptionTelevision = scanner.nextLine();
                        System.out.println("Television - dimension of TV: ");
                        int dimensionsTV = Integer.parseInt(scanner.nextLine());
                        System.out.println("Television - price: ");
                        String priceTelevision = scanner.nextLine();
                        System.out.println("Television - Iva: ");
                        String ivaTV = scanner.nextLine();
                        System.out.println("Smart? yes/no");
                        boolean isSmartTV = scanner.nextLine().equalsIgnoreCase("yes");

                        Television television = new Television(
                                nameTelevision,
                                descriptionTelevision,
                                new BigDecimal(priceTelevision),
                                new BigDecimal(ivaTV),
                                dimensionsTV,
                                isSmartTV);
                        cart[i] = television;
                        break;
                    /*case "3":

                        System.out.println("Enter your Headphone data: ");
                        quit = false;
                        String nameHPhone = scanner.nextLine();
                        String descriptionHPhone = scanner.nextLine();
                        double priceHPhone = scanner.nextDouble();
                        double ivaHPhone = scanner.nextDouble();

                        products[productIndex] = new Headphone(nameHPhone, descriptionHPhone, priceHPhone, ivaHPhone);
                        productIndex++;
                    break;*/
                    default:
                        System.out.println("Invalid choice");
                        quit = true;
                    break;
                }
            }
            while(quit);
        }

        System.out.println(
                "\n" +
                        "Cart with your products: " +
                        "\n"
        );
        // Stampa il riepilogo dei dati inseriti
        BigDecimal total = new BigDecimal(0);
        for (Product p : cart) {
            System.out.println(p);
            //aggiorno il totale
            total = total.add(p.getFullPrice());
        }
        System.out.println("Total: " + total + "€");
        scanner.close();
    }
}
