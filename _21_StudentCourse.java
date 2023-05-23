import java.util.*;

class Student{
    String name;
    int grade;
    String[] courses;
    int numofCourses;
    
    public Student(String name, int grade,int num){
        this.name = name;
        this.grade = grade;
        this.courses = new String[num];
        this.numofCourses = 0;
    }

    public void addCourse(String course){
        if (numofCourses < courses.length) {
            courses[numofCourses++] = course;
            System.out.println("Course added -> "+ course);
        }else{
            System.out.println("Cannot add, Limit reached!");
        }
    }

    public void removeCourse(String course){
        boolean found = false;
        for (int i = 0; i < numofCourses; i++) {
            if (courses[i].equals(course)) {
                found = true;
                for (int j = i; j < numofCourses-1; j++) {
                    courses[j] = courses[j+1];
                }
                numofCourses--;
                System.out.println("Course removed -> "+ course);
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid course -> "+course);
        }
    }

    public void displayCourse() {
        System.out.println("Student's name: "+name);
        System.out.println("Student's grade: "+grade);
        System.out.println("Courses for " + name + ":");
        for (int i = 0; i < numofCourses; i++) {
            System.out.println(courses[i]);
        }
    }
}

public class _21_StudentCourse {
    public static void main(String[] args) {
        Student student = new Student("Knight", 10,5);
        student.addCourse("OOP");
        student.addCourse("Data Science");
        student.addCourse("DMS");
        student.addCourse("IOT");
        student.displayCourse();
        student.removeCourse("Data Science");
        student.displayCourse();
    }
}
