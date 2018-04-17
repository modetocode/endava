package session6.task1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Product> products = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            float price = scanner.nextFloat();
            String name = scanner.next();
            Product product = new Product(name, price);
            products.add(product);
        }

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (Character.toLowerCase(product.getName().charAt(0)) == 'b') {
                products.remove(i);
                i--;
            }
        }
//        for (Product product : products) {
//            if (Character.toLowerCase(product.getName().charAt(0)) == 'b') {
//                products.remove(product);
//            }
//        }

        for (Product product : products) {
            System.out.print(product.getName() + " ");
        }

    }
}
