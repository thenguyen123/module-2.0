package ss19.bai_tap._2.view;

import ss19.bai_tap._2.cotroller.ProductChoose;
import ss19.bai_tap._2.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProducViewMain {
    public static void main(String[] args)  {
        disPlay(ProductChoose.product());

    }
    public static void disPlay(List<Product> productList)  {
        int choose;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add product");
            System.out.println("2. Show product");
            System.out.println("3. Find product");
            System.out.println("4. Exit");
            System.out.println("enter your choose");
            choose = Integer.parseInt(scanner.nextLine());
            ProductChoose.getChoose(choose, productList);

        } while (choose != 4);


    }
}
