package ss14.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindValue {

    public static int search(int[] arr, int head, int size, int x) {
        if (size >= head) {
            int mid = (head + size) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                return search(arr, mid + 1, size, x);
            }
            return search(arr, 0, mid - 1, x);
        }
        return -1;

    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter number of array " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.println("enter your choose");
        int choose = Integer.parseInt(scanner.nextLine());
        System.out.println("index of  your choose");
        System.out.println(Arrays.toString(sortArray(array)));
        System.out.println(search(array, 0, size, choose));
    }
}
