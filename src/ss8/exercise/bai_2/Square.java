package ss8.exercise.bai_2;

public class Square extends Shape implements Colorable {

    private double weight;

    public Square() {

    }

    public Square(double weight) {
        this.weight = weight;
    }

    public Square(boolean filled, String color, double weight) {
        super(filled, color);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getArea() {
        return this.weight * this.weight;

    }

    @Override
    public String toString() {
        return " Square{ " +
                " weight= " + weight + " area " + getArea() + super.toString() +
                '}';


    }

    @Override
    public void howToColor() {
        System.out.println("  Color all four sides");
    }
}
