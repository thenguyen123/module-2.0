package ss5.bai_tap;

public class FanMain {
    public static void main(String[] args) {

        Fan fan1= new Fan() ;
        Fan fan2= new Fan( ) ;
        fan2.setColor("yellow");
        fan2.setOn(true);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(10);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());



    }
}
