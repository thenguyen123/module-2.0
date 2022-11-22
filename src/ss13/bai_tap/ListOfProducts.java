package ss13.bai_tap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    private int id;
    private String name;
    private float prices;

    Scanner scanner = new Scanner(System.in);

    public ListOfProducts() {

    }

    public ListOfProducts(int id, String name, float prices) {
        this.id = id;
        this.name = name;
        this.prices = prices;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        System.out.println("enter id of product");
        this.id = Integer.parseInt(scanner.nextLine());
    }

    public String getName() {

        return name;
    }

    public void setName() {
        System.out.println("enter your name product");
        this.name = scanner.nextLine();

    }

    public float getPrices() {
        return prices;
    }

    public void setPrices() {
        System.out.println("enter prices of product");
        this.prices = Float.parseFloat(scanner.nextLine());
        ;
    }

    @Override
    public String toString() {
        return " { id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", prices=" + prices +
                '}';
    }

    public void addProduct(List<ListOfProducts> arrayList) {

        System.out.println("enter your name product");
        name = scanner.nextLine();
        System.out.println("enter id of product");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter prices of product");
        prices = Float.parseFloat(scanner.nextLine());
        arrayList.add(new ListOfProducts(id, name, prices));
    }

    public void display(List<ListOfProducts> arrayList) {

        System.out.println(" " + arrayList);
    }

    public void remove(List<ListOfProducts> arrayList) {

        System.out.println("enter your id you want to remove");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == (inputId)) {
                arrayList.remove(arrayList.get(i));
                display(arrayList);
            }
        }

    }

    public void findName(List<ListOfProducts> arrayList) {


        System.out.println("enter your name product  you want to find");
        String nameProduct = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(nameProduct)) {
                System.out.println(arrayList.get(i));
            }
        }


    }

    public void edit(List<ListOfProducts> arrayList) {

        System.out.println("enter your id you want to edit");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == inputId) {
                arrayList.get(i).setId();
                arrayList.get(i).setName();
                arrayList.get(i).setPrices();
            }
        }

    }


}

