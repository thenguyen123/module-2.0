package ss7.bai_tap;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2, "blue");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(2);
        System.out.println(cylinder);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your radius");
        double r = Double.parseDouble(scanner.nextLine());
        circle.setRadius(r);
        System.out.println(circle);
    }

}
