package ss13.bai_tap;

import java.util.*;

public class ListOfProductsMain {
    public static void main(String[] args) {
        int choose;
        ListOfProducts listOfProducts = new ListOfProducts(2, "candy", 1200000);
        ListOfProducts listOfProducts1 = new ListOfProducts();
        List<ListOfProducts> arrayList = new ArrayList<>();
        arrayList.add(listOfProducts);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.add product");
            System.out.println("2.remove product");
            System.out.println("3.display product");
            System.out.println("4.edit product");
            System.out.println("5.find product");
            System.out.println("6. sort");
            System.out.println("7.exit");
            System.out.println("your choose");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    listOfProducts1.addProduct(arrayList);
                    listOfProducts1.display(arrayList);
                    break;
                case 2:
                    listOfProducts1.remove(arrayList);
                    break;
                case 3:
                    listOfProducts1.display(arrayList);
                    break;
                case 4:
                    listOfProducts1.edit(arrayList);
                    break;
                case 5:
                    listOfProducts1.findName(arrayList);
                    break;
                case 6:
                    Collections.sort(arrayList, new ListOfProducts());
                    System.out.println(arrayList);
            }
        } while (choose < 7);
    }
}
