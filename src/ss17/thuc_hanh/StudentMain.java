package ss17.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentMain {
    public static final String FILE = "src/ss17/thuc_hanh/Student";

    public static void main(String[] args) {

        Student student3 = new Student("Sơn", "module 1", 1);
        Student student1 = new Student("LONG ", "module 1", 1);
        Student student2 = new Student("PHÚC", "module 1", 1);
        Student student4 = new Student("QUÂN", "module 4", 1);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        Write(FILE, studentList);
        readFile(studentList,FILE);
    }

    public static void Write(String file, List<Student> s) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : s) {
                bufferedWriter.write(student.writeFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void readFile(List<Student> s, String file) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
