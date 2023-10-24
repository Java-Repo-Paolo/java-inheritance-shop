//QUESTO  è LA CORREZIONE DELL'ESERCIO E NON L'ESERCIZIO FATTO DA ME
//
//PAOLO

package org.lessons.correction.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many products? ");
        int cartSize = Integer.parseInt(scanner.nextLine());
        Product[] cart = new Product[cartSize];

        for (int i = 0; i < cart.length ; i++) {
            System.out.println("Insert product " +  (i + 1));

            boolean invalidChoice = false;
            do {
                System.out.println();
                invalidChoice = false;
                System.out.println("Nome: ");
                String  name = scanner.nextLine();
                System.out.println("Description: ");
                String  description = scanner.nextLine();
                System.out.println("Price: ");
                String priceString = scanner.nextLine();
                System.out.println("Iva: ");
                String ivaString = scanner.nextLine();

                System.out.println("Whitch product? 1 - Smartphone, 2 - Television, 3 - Headphone");
                String choice = scanner.nextLine();
                switch (choice){
                    case "1":

                        System.out.println("IMEI code: ");
                        String imeiCode = scanner.nextLine();
                        System.out.println("Memory: ");
                        int memory = Integer.parseInt(scanner.nextLine());

                        Smartphone smartphone = new Smartphone(
                                name, description,
                                new BigDecimal(priceString),
                                new BigDecimal((ivaString)),
                                imeiCode,
                                memory
                        );
                        cart[i] = smartphone;
                    break;
                    case "2":
                        System.out.println("Television");
                        invalidChoice = false;

                        System.out.println("Dimensions: ");
                        int dimensions = Integer.parseInt(scanner.nextLine());
                        System.out.println("Smart? yes/no");
                        boolean smart = scanner.nextLine().equalsIgnoreCase("yes");

                        Television television = new Television(
                                name,
                                description,
                                new BigDecimal(priceString),
                                new BigDecimal((ivaString)),
                                dimensions,
                                smart
                        );
                        cart[i] = television;
                    break;
                    case "3":
                        System.out.println("Headphone");
                        invalidChoice = false;

                        System.out.println("Color: ");
                        String color = scanner.nextLine();
                        System.out.println("Wireless? yes/no");
                        boolean wireless = scanner.nextLine().equalsIgnoreCase("yes");

                        Headphone headphone = new Headphone(
                                name,
                                description,
                                new BigDecimal(priceString),
                                new BigDecimal((ivaString)),
                                color ,
                                wireless
                        );
                        cart[i] = headphone;
                    break;
                    default:
                        System.out.println("Invalid choice");
                        invalidChoice = true;
                    break;

                }
            } while (invalidChoice);
        }

        BigDecimal total = new BigDecimal(0);
        for (Product p : cart) {
            System.out.println(p);
            //aggiorno il totale
            total = total.add(p.getFullPrice());
        }
        System.out.println("Total: " + total);
        scanner.close();
    }

}
