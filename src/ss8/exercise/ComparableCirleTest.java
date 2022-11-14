package ss8.exercise;

import java.util.Arrays;

public class ComparableCirleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[3];
        circles[0]=new ComparableCircle(3.6);
        circles[1]=new ComparableCircle();
        circles[2]=new ComparableCircle(3.5, "hed");
        System.out.println("pre-sort");
        for (ComparableCircle circle:
            circles ) {
            System.out.println(circle);

        }
        Arrays.sort(circles);
        System.out.println("after sorted");
        for (ComparableCircle circle:
             circles) {
            System.out.println(circle);

        }
        System.out.println(circles[1].compareTo(circles[2]));
    }
}
