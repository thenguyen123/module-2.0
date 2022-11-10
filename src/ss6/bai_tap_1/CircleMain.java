package ss6.bai_tap_1;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {


        Circle c = new Circle();
        System.out.println("Radius =" + c.getRadius() + c.display()+ c.getColor());
        System.out.println(" your radius");
        Scanner scanner=new Scanner(System.in);
         double radiu=Double.parseDouble(scanner.next());
         c.setRadius(radiu);
        System.out.println( c.display());


    }
}
