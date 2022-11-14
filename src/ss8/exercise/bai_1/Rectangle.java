package ss8.exercise.bai_1;

public class Rectangle extends Shape implements Resizeable{
    private double weight=0.0;
    private double length =0.0;
public Rectangle(){

}
    public Rectangle(double weight,double length ) {
        this.weight = weight;
        this.length =length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(boolean filled, String color, double weight, double length) {
        super(filled, color);
        this.weight = weight;
        this.length =length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getArea(){
    return this.weight*this.length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + this.weight +
                "height=" +this.length +
                "Area "+ getArea()+ super.toString()+
                '}';
    }

    @Override
    public void resize(double percent) {
        length =this.length *100/percent;
        weight=this.weight*100/percent;
    }
}
