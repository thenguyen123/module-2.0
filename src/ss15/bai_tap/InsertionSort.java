package ss15.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[] arr) {
        int pos, num;
        for (int i = 1; i < arr.length; i++) {
            num = arr[i];
            pos = i;
            while (pos > 0 && num < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = num;

        }
    }

    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter value " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
