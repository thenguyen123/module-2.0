package ss6.bai_tap_1;

public class Circle {
    private double radius=1.0;
    private String color="red";
    Circle(){

    }
    Circle(double r,String c){
        this.radius=r;
        this.color=c;
    }
    public String getColor(){
        return this.color;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return (this.radius*this.radius*Math.PI);
    }
    public void setRadius(double a){
        this.radius=a;
    }
    public String display(){
        return "Area Circle" +getArea()+" ";
    }
}
