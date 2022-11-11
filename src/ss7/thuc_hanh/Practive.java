package ss7.thuc_hanh;

public class Practive {
    private String color="green";
    private boolean filled=true;
    Practive(){

    }
    Practive( String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public  String toString(){
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }


}
    class Circle extends Practive{
    private double radius=1.0;
    public Circle(){

    }
    public Circle(double rasdius){
        this.radius=rasdius;
    }
    public Circle(double rasdius,String color,boolean filled ){
        super(color,filled);
        this.radius=rasdius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double rasdius) {
        this.radius = rasdius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;

    }
    public  double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

}
    class Rectangle extends Practive{
    private double weight=1.0;
    private  double height=1.0;
    Rectangle(){

    } Rectangle(double weight,double height){
        this.weight=weight;
        this.height=height;

      }
      Rectangle(double weight,double height,String color,boolean filled){
        super(color,filled);
        this.weight=weight;
        this.height=height;

      }

      public double getWeight() {
          return weight;
      }

      public void setWeight(double weight) {
          this.weight = weight;
      }

      public double getHeight() {
          return height;
      }

      public void setHeight(double height) {
          this.height = height;
      }
      public double getArea(){
        return this.height*this.weight;

      }
      public double getPerimeter(){
        return  (this.height+this.weight)*2;
      }
      public String toString(){
        return "A rectangle with weight " + getWeight()+" and length "+getHeight()+ "which is a subclass of"+super.toString();
      }

  }
   class Square extends Rectangle{
     public  Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color, boolean filled){
         super(side,side,color,filled);
    }
    public double getSide(){
         return getWeight();
    }
    public void setSide(double side){
         setWeight(side);
         setHeight(side);
    }
    public void setWeight(double weight){
         setSide(weight);
    }
       public void setHeight(double height) {
           setSide(height);
       }
       public String toString(){
         return "a square with size " + getSide()+ "which is subclass of " + super.toString();
       }

  }
