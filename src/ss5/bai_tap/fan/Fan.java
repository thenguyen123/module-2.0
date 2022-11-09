package ss5.bai_tap;

public class Fan {
    public static final int SLOW=1;
    public static final int MEDIUM=2;
    public static final int FAST=3;
    int speed=SLOW;
    boolean on=false;
    double radius=5.0;
    String color="blue";
    public Fan(){

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String toString() {
        if (this.isOn()) {
            return "Fan{" +
                    "speed=" + this.getSpeed() +
                    ", radius=" + this.getRadius() +
                    ", color= " + this.getColor()+  " fan is on "+'\'' +
                    '}';
        }else {
            return "Fan{" +
                    "speed=" + this.getSpeed() +
                    ", radius= " + this.getRadius() +
                    ", color= " + this.getColor() +  " fan is off "+'\'' +
                    '}';
        }

    }



}
