package ss2.bai_tap;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();

        String[] Names = {
                "",
                " one",
                " two",
                " three",
                " four",
                " five",
                " six",
                " seven",
                " eight",
                " nine",
                " ten",
                " eleven",
                " twelve",
                " thirteen",
                " fourteen",
                " fifteen",
                " sixteen",
                " seventeen",
                " eighteen",
                " nineteen"
        };


        String[] Tens = {
                "",
                " ten",
                " twenty",
                " thirty",
                " forty",
                " fifty",
                " sixty",
                " seventy",
                " eighty",
                " ninety"
        };
        String[] Hundred = {
                "",
                " one hundred",
                " two hundred",
                " three hundred",
                " four hundred",
                " five hundred",
                " six hundred",
                " seven hundred",
                " eight hundred",
                " nine hundred"
        };

        if (number == 0) {
            System.out.println("zero");
        } else if (number < 20) {
            System.out.println(Names[number]);
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number - tens * 10;

            System.out.println(Tens[tens] + Names[ones]);
        } else if (number < 1000) {
            int hundred = number / 100;
            int tens = (number - hundred * 100) / 10;
            int ones = (number - hundred * 100) - tens * 10;

            System.out.println(Hundred[hundred]  +Tens[tens] +Names[ones]);
        } else System.out.println("Out of ability");
    }
}
