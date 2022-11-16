package ss10.bai_tap.bai_1;


import java.util.ArrayList;

public class TestMyArrayList {

    public  static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static  void main(String[] args) {
        Student a = new Student(1, "nguyen");
        Student b = new Student(2, "sơn");
        Student c = new Student(3, "long ");
        Student d = new Student(4, "thong");

        MyArrayList<Student> studentsMyArrayList = new MyArrayList<>();
        studentsMyArrayList.add(a);
        studentsMyArrayList.add(b);
        studentsMyArrayList.add(c);
        studentsMyArrayList.add(d);
        studentsMyArrayList.remove(1);
        for (int i = 0; i < studentsMyArrayList.size(); i++) {
          Student student=(Student) studentsMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
    }



