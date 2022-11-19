package ss12.bai_tap.bai_2;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your expression");
        String expression= scanner.nextLine();
        String []array=expression.split("");
        Stack<String> left=new Stack<>();
        Stack<String> right=new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (array[i].equals(")")){
                left.push(array[i]);
            }else if(array[i].equals("(")){
                right.push(array[i]);
            }
        }if (left.size()==right.size()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
