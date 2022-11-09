package ss5.bai_tap;

import java.util.Scanner;

public class Quadratic {
    double a, b, c;

    public Quadratic(double a, double b, double c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (Math.pow(b, 2) - 4 * this.a * this.c);
    }

    public double getRoot() {
        return (-b - (Math.sqrt(Math.pow(b, 2) - 4 * this.a * this.c))) / (2 * this.a);
    }

    public double getRoot2() {
        return (-b + (Math.sqrt(Math.pow(b, 2) - 4 * this.a * this.c))) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("enter b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("enter c");
        double c = Double.parseDouble(scanner.nextLine());
        Quadratic quadratic = new Quadratic(a, b, c);

        if (quadratic.getA() == 0 && quadratic.getB() == 0 && quadratic.getC()==0) {
            System.out.println("the equation has countless");
        } else if (quadratic.getDiscriminant() > 0 && quadratic.getA() != 0) {
            System.out.println("The equation has " + quadratic.getRoot());
            System.out.println("The equation has " + quadratic.getRoot2());
        } else if (quadratic.getDiscriminant() == 0 && quadratic.getA() != 0) {
            System.out.println("The equation has " + quadratic.getRoot());
        } else if (quadratic.getDiscriminant() < 0 && quadratic.getA() != 0) {
            System.out.println("The equation has not root ");
        }
    }


}
