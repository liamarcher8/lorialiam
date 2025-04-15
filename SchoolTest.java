import java.util.Scanner;

class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Student extends Person {
    private String gradeLevel;

    public Student(String name, String id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the Student:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Grade Level: ");
        String gradeLevel = scanner.nextLine();
        Student student = new Student(studentName, studentId, gradeLevel);

        System.out.println("\nEnter details for the Teacher:");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("ID: ");
        String teacherId = scanner.nextLine();
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherId, subject);

        System.out.println("\nEnter details for the Staff:");
        System.out.print("Name: ");
        String staffName = scanner.nextLine();
        System.out.print("ID: ");
        String staffId = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        Staff staff = new Staff(staffName, staffId, department);

        System.out.println("\nStudent Details:");
        student.displayInfo();

        System.out.println("\nTeacher Details:");
        teacher.displayInfo();

        System.out.println("\nStaff Details:");
        staff.displayInfo();

        scanner.close();
    }
}  