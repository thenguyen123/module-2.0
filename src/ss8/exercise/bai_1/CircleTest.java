package ss8.exercise.bai_1;

public class CircleTest {

        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle);

            circle = new Circle(3.5);
            System.out.println(circle);

            circle = new Circle(true, "indigo", 3.5);
            System.out.println(circle);
        }
    }

