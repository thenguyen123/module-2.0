package ss8.exercise;

import ss7.bai_tap.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorCircleTest {
    public static void main(String[] args) {
        Circle[]circles=new Circle[3];
        circles[0]=new Circle(3.4,"red");
        circles[1]=new Circle(3.5);
        circles[2]=new Circle(3.6,"blue");
        for (Circle circle:
             circles) {
            System.out.println(circle);

        }
        Comparator circleComparator=  new CircleComparator();
        Arrays.sort(circles,circleComparator);
        for (Circle circle:
                circles) {
            System.out.println(circle);

        }
    }
}
