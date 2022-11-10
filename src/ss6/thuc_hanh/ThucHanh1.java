package ss6.thuc_hanh;

public class ThucHanh1 {
    private String name;
    private int rollno;
    private static String college="NVT";
    ThucHanh1(int r,String n){
        this.name=n;
        this.rollno=r;
    }
    static void change(){
        college="CodeGym";
    }
    void display(){
        System.out.println(" "+ rollno+ " " +name+ " " + college);
    }
}
