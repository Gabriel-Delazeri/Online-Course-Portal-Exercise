package entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor
{
    private String name;

    private Set<Course> courses =  new HashSet<>();

    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }
}
