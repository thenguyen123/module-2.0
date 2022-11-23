package ss15.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DescribeSort {
    public static void sortArray(int[] arr) {
        int pos, num;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            num = arr[i];
            while (pos > 0 && num < arr[pos - 1]) {
                System.out.println(" Assign " + arr[pos] + " with " + arr[pos - 1]);
                arr[pos] = arr[pos - 1];
                System.out.println(" array sorting" + Arrays.toString(arr));
                pos--;

            }
            System.out.println("Assign " + arr[pos] + " with "+ num);
            arr[pos] = num;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your size");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter your value of array " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("array is not sort " + Arrays.toString(array));

        sortArray(array);

        System.out.println(" array is sorted " + Arrays.toString(array));
    }
}

