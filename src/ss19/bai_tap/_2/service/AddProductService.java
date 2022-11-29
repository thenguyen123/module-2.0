package ss19.bai_tap._2.service;

import ss19.bai_tap._2.model.Product;

import java.util.List;
import java.util.Scanner;

public class AddProductService {
    public static void addProduct(List<Product> e) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter code of product ");
        String code = scanner.nextLine();
        System.out.println("enter name of product  ");
        String name = scanner.nextLine();
        System.out.println("enter production of product");
        String production = scanner.nextLine();
        System.out.println("enter prices of product ");
        int prices = Integer.parseInt(scanner.nextLine());
        System.out.println("enter describe of product");
        String describe = scanner.nextLine();
        Product product= new Product(code, name, production, prices, describe);
        e.add(product);
    }



}
