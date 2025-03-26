package lab05_1;

import oop.labor02.date.MyDate;

import java.io.PrintStream;
import java.util.ArrayList;

public class Training {
    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private final double pricePerStudent;
    private final ArrayList<Student> enrolledStudents=new ArrayList<>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }
    public Student findStudentByID(String ID){
        for(Student i:enrolledStudents){
            if(i.getID().equals(ID))
                return i;
        }
        return null;
    }
    public static void print(PrintStream ps){

    }
    public int numEnrolled(){
        return enrolledStudents.size();
    }
    public boolean enroll(Student student){
        if(findStudentByID(student.getID())==null) {
            enrolledStudents.add(student);
            return true;
        }
        return false;
    }
    public Course getCourse() {
        return course;
    }
    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
}
