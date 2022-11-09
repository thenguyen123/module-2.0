package ss4.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumLine {

    public static int sum(int c,int r,float[][]arr) {
        int sum = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }

            }

        }return sum;
    }
    public static void main(String[] args) {
        int column, row;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter column");
        column = Integer.parseInt(scanner.nextLine());
        System.out.println("enter row");
        row = Integer.parseInt(scanner.nextLine());
        float[][]array = new float[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("enter number array " + (1+i )+ (j+1));
                array[i][j] = Float.parseFloat(scanner.nextLine());

            }

        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("sum line " + sum(column,row,array));

    }
}
