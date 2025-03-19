package lab05_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Course> result=readCourses("courses.csv");
//        for(Course i:result){
//            System.out.println(i);
//        }
        ArrayList<Student> result=readStudents("student.csv");
        for(Student i:result)
            System.out.println(i);

    }
    private static ArrayList<Course> readCourses(String filename){
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String name = items[0].trim();
                String description = items[1].trim();
                int numHours=Integer.parseInt(items[2].trim());
                courses.add(new Course(name,description,numHours));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }
    private static ArrayList<Student> readStudents(String filename){
        ArrayList<Student> students=new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String ID = items[0].trim();
                String firstName = items[1].trim();
                String lastName=items[2].trim();
                students.add(new Student(ID,firstName,lastName));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;

    }
}
