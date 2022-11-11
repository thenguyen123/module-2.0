package ss7.bai_tap_2;

import java.util.Arrays;
import java.util.Scanner;

public class Point2Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  x");
        float x1 = Float.parseFloat(scanner.nextLine());
        System.out.println("enter  y");
        float y1 = Float.parseFloat(scanner.nextLine());
        point2D.setXY(x1, y1);
        point2D.getXY();
        System.out.println(point2D);
        Point3D point3D = new Point3D();
        System.out.println("enter  Z");
        float z1 = Float.parseFloat(scanner.nextLine());
        Point3D pointD = new Point3D(x1, y1, z1);

        System.out.println("point 3D " + Arrays.toString(pointD.getXYZ()));


    }
}
