class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
        }
        this.age = age;

        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains numbers or special symbols.");
        }
        this.name = name;

        this.course = course;
    }

    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}


public class _24_ExceptionHandling {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John", 19, "Science");
            System.out.println("Student 1 created: " + student1.getName() + " Roll no. "+ student1.getRollNo()+ " Age: "+student1.getAge());

            Student student2 = new Student(2, "Jane123", 20, "Math");
            System.out.println("Student 2 created: " + student2.getName() + " Roll no. "+ student2.getRollNo()+ " Age: "+student2.getAge());

            Student student3 = new Student(3, "Sam", 22, "English");
            System.out.println("Student 2 created: " + student3.getName() + " Roll no. "+ student3.getRollNo()+ " Age: "+student3.getAge());
        
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
