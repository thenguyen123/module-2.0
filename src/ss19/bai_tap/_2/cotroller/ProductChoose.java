package ss19.bai_tap._2.cotroller;

import ss19.bai_tap._2.model.Product;
import ss19.bai_tap._2.service.FindProduct;
import ss19.bai_tap._2.service.AddProductService;
import ss19.bai_tap._2.service.ReadAndWrite;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductChoose {
    public static final String FILE_NAME = "src/ss19/bai_tap/_2/data/product.csv";

    public static List<Product> product()  {
        List<Product> productList = new ArrayList<>();
        Product product = new Product("M1", "Cocacola", "coca", 20000, "ngon");
        Product product1 = new Product("M2", "Cake", "Viet Nam", 10000, "rẻ");
        Product product2 = new Product("M3", "Milk", "TH true milk", 50000, "bổ");
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        ReadAndWrite.write(FILE_NAME, productList);
        return productList;
    }

    public static void getChoose(int choose, List<Product> productList) {

        switch (choose) {
            case 1:
                AddProductService.addProduct(productList);
                ReadAndWrite.write(FILE_NAME, productList);
                System.out.println("finish");
                break;
            case 2:
                List<Product> list = ReadAndWrite.read(FILE_NAME);
                for( Product product:list) {
                    System.out.println(product);
                }
                break;
            case 3:
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter code of product");
                String input = scanner.nextLine();
                FindProduct.Find(productList, input);
                break;


        }
    }

}
