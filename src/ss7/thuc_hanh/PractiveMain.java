package ss7.thuc_hanh;

public class PractiveMain {
    public static void main(String[] args) {
        Practive practive=new Practive();
        System.out.println(practive);
        practive=new Practive ("red",false);
        System.out.println(practive);
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        Rectangle rectangle=new Rectangle();
        rectangle =new Rectangle(2,3);
        System.out.println(rectangle);
        Square square=new Square();
        System.out.println(square);

    }
}
