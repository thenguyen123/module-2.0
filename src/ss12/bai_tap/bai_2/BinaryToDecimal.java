package ss12.bai_tap.bai_2;

import java.util.Scanner;
import java.util.Stack;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int number;
        String Decimal = " ";

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> decimal = new Stack<>();
        do {
            System.out.println("enter your number you want change");
            number = Integer.parseInt(scanner.nextLine());
        } while (number < 0);
        do {
            decimal.push(number % 2);
            number = number / 2;

        } while ((number > 0));
        int size = decimal.size();
        for (int i = 0; i < size; i++) {
            Decimal+=""+decimal.pop();
        }
        System.out.println(Decimal);
    }
}
