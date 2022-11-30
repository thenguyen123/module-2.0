package ss20.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
     private static final String CHECK = "^(C|A|P)\\d{4}(G|H|I|K|L|M)$";

    public static void main(String[] args) {

        String input;
        Scanner scanner = new Scanner(System.in);
        boolean isFlag;
        do {
            System.out.println("Enter your String");
            input = scanner.nextLine();
            isFlag = check(CHECK, input);
            if (!isFlag) {
                System.out.println(" your Sting is wrong");
            }
        } while (!isFlag);
        System.out.println("your string " + input);
    }

    public static boolean check(String a, String input) {
        return Pattern.matches(a, input);
    }
}

