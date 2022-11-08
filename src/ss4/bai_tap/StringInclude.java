package ss4.bai_tap;

import java.util.Scanner;

public class StringInclude {
    public static void main(String[] args) {
        String  inputString;
        char charter;
        int count =0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your string");
        inputString=scanner.nextLine();
        System.out.println("enter your chart");
        charter=scanner.next().charAt(0);

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charter) {
                count++;
            }
        }
        System.out.println("chart include string " +count +" time");


    }
}
