package ss2.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double VND=23000;
        double USD;
        System.out.println("enter the usd");
        USD=scanner.nextDouble();
        double change=USD*VND;
        System.out.println("result " +change);
    }
}
