package ss8.exercise.bai_2;

public class Circle extends Shape {
    private double radius =0;

    public Circle( ){

    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public Circle(boolean filled, String color, double radius) {
        super(filled, color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" +this.radius + " Area "+ getArea() + super.toString()+
                '}';
    }



}

