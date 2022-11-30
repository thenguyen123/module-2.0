package ss20.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Phone {
    private static final String check = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        boolean isFlag;
        do {
            System.out.println("Enter your PhoneNumber");
            input = scanner.nextLine();
            isFlag = checkPhone(check, input);
            if (!isFlag) {
                System.out.println(" Your phone is wrong format  " + input);
            }
        } while (!isFlag);
        System.out.println("your phone number" + input);
    }

    public static boolean checkPhone(String check, String input) {
        return Pattern.matches(check, input);
    }
}
