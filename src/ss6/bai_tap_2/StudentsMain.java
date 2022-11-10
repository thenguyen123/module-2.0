package ss6.bai_tap_2;

public class StudentsMain {
    public static void main(String[] args) {
        System.out.println("name and classes");
        Students students=new Students();
        System.out.println(students.display());
        Students students1=new Students();
        students1.setName("Harry");
        students1.setClasses("C09");
        System.out.println(students1.display());
    }
}
