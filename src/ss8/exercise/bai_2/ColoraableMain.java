package ss8.exercise.bai_2;

public class ColoraableMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(true,"blue",2, 4);
        shapes[2] = new Square(3);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle =(Rectangle)shape;
                System.out.println(rectangle);
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                if(square instanceof Colorable){
                    System.out.println("");square.howToColor();

                System.out.println(square);
                
            }
                
            }
        }
    }
    }