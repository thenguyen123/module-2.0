package ss4.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static int mySum(int a, int column, double[][] arr) {
        int sum=0;
        for (int i = 0; i < column; i++) {
            sum += arr[i][a];
        }return sum;

    }
    public static void main(String[] args) {
        int column,row,index;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter column");
        column=Integer.parseInt(scanner.nextLine());
        System.out.println("enter row");
        row=Integer.parseInt(scanner.nextLine());
         double[][]array=new double[column][row];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("enter number array" +i);
                array[i][j]=Float.parseFloat(scanner.nextLine());

            }


        } System.out.println(Arrays.deepToString(array));
        System.out.println(" enter your ìndex choice ");
        index=Integer.parseInt(scanner.nextLine());
        System.out.println("sum column array " +mySum(index,column,array));
    }

}
