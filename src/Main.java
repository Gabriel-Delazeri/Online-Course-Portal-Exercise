import entities.Course;
import entities.Instructor;
import entities.Student;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the instructor name:");

        Instructor instructor = new Instructor(sc.nextLine());

        System.out.println("How many courses the instructor have?");

        int howManyCourses = sc.nextInt();

        for(int i = 1; i <= howManyCourses ; i++) {

            System.out.println("Course #" + i + " name?");
            sc.nextLine();
            Course course = new Course(sc.nextLine());
            System.out.println("How many students in this course?");
            int howManyStudents = sc.nextInt();

            for(int j = 1; j <= howManyStudents; j++) {
                System.out.println("Student#" + i + " code?");

                course.addStudent(new Student(sc.nextInt()));
            }

            instructor.addCourse(course);

        }

        Set<Student> students = new HashSet<>();

        for (Course course : instructor.getCourses()) {
            for (Student student : course.getStudents()) {
                students.add(student);
            }
        }

        System.out.println(instructor.getName() + " have " +students.size() + " students");
    }
}