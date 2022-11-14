package ss8.exercise.bai_1;

import java.util.Arrays;

public class ShapeMain {
    public static void main(String[] args) {
Shape[]shapes=new Shape[3];
shapes[0]=new Circle(3);
shapes[1]=new Rectangle(2,4);
shapes[2]=new Square(3);
        for (Shape shape: shapes) {
            System.out.println(shape);
            if( shape instanceof Circle){
                Circle circle=(Circle) shape;
                circle.resize(Math.random()*100+1);
                System.out.println(circle);
            } else if (shape instanceof Square){
                Square square=(Square) shape;
                square.resize((Math.random()*100+1));
                System.out.println(square);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle= (Rectangle) shape;
                rectangle.resize(Math.random()*100+1);
                System.out.println(rectangle);

            }
        }
    }
}
