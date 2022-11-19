package ss12.bai_tap.bai_1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String result=" ";
        Stack<String> wStack=new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your String");
        String inputString=scanner.nextLine();
        String [] newString=inputString.split(" ");
         int size=newString.length;
        for (int i = 0; i < size; i++) {
          wStack.push(newString[i]);
        }
        System.out.println("String reverse");
        for (int i=0;i<size;i++){
          result +=" " +wStack.pop();
        }
        System.out.println(result);
    }
}
