package ss12.bai_tap.bai_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseNumber {
    public static void main(String[] args) {
        int[] array;
        Stack<Integer> stackInteger=new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your size");
        int size= Integer.parseInt(scanner.nextLine());
        array=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter your number " +(i+1));
            array[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < size; i++) {
            stackInteger.push(array[i]);
        }
        for (int i = 0; i < size; i++) {
            array[i]=stackInteger.pop();

        }
        System.out.println(Arrays.toString(array));
    }
}
