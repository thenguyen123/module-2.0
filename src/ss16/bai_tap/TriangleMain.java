package ss16.bai_tap;

import java.util.Scanner;

public class TriangleMain {

    public static void check(int a,int b, int c) throws IllegalTriangleException{
        if(a<=0||b<=0||c<=0){
            throw new IllegalTriangleException("cạnh không thể bé hơn 0");
        } else if (a+b<c || a+c<b || c+b<a) {
            throw new IllegalTriangleException("cạnh không hợp lệ");
        }else {
            System.out.println("Là tam giác có các cạnh " +a +" "+ b+ " "+ c );
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("nhập cạnh thứ nhất của tam giác");
              int   a = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập cạnh thứ hai của tam giác");
              int  b = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập cạnh thứ ba của tam giác");
               int c = Integer.parseInt(scanner.nextLine());
              check(a,b,c);
              break;
            } catch (NumberFormatException e) {
                System.err.println(" bạn nhập vào không phải số");

            } catch (IllegalTriangleException e) {
              System.err.println(e.getMessage());
            }
        } while (true);

    }
}

