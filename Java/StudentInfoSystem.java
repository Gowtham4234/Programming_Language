package Java;

// Base class 
class student {
    protected String name;
    protected int age;
    protected String studentID;

    public student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public void BasicDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
    }
}

// Interface for student operations
interface Student_details {
    void displayCourseDetails();
}

// UGStudent class (inherits Student, implements StudentOperation)
class UGStudent extends student implements Student_details {
    private String major;
    private int semester;

    public UGStudent(String name, int age, String studentID, String major, int semester) {
        super(name, age, studentID);
        this.major = major;
        this.semester = semester;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Program: Undergraduate (UG)");
        System.out.println("Major: " + major);
        System.out.println("Semester: " + semester);
    }
}

// PGStudent class (inherits Student, implements StudentOperation)
class PGStudent extends student implements Student_details {
    private String specialization;
    private String researchTopic;

    public PGStudent(String name, int age, String studentID, String specialization, String researchTopic) {
        super(name, age, studentID);
        this.specialization = specialization;
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Program: Postgraduate (PG)");
        System.out.println("Specialization: " + specialization);
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Main class 
public class StudentInfoSystem {
    public static void main(String[] args) {
        
        System.out.println("------------------------------------------");
        System.out.println("---Hierarchical Inheritance and interface---");
        System.out.println("------------------------------------------");
        
        // UG Student object
        UGStudent ugStudent = new UGStudent("Alice", 20, "UG101", "Computer Science", 4);
        System.out.println("Undergraduate Student Information:");
        ugStudent.BasicDetails();
        ugStudent.displayCourseDetails();

        System.out.println("------------------------------------------");

        // PG Student object
        PGStudent pgStudent = new PGStudent("Bob", 24, "PG202", "Artificial Intelligence", "Deep Learning");
        System.out.println("Postgraduate Student Information:");
        pgStudent.BasicDetails();
        pgStudent.displayCourseDetails();
        System.out.println("------------------------------------------");
    }
}

/* 
 Output
------------------------------------------
---Hierarchical Inheritance and interface---
------------------------------------------
Undergraduate Student Information:
Name: Alice
Age: 20
Student ID: UG101
Program: Undergraduate (UG)
Major: Computer Science
Semester: 4
------------------------------------------
Postgraduate Student Information:
Name: Bob
Age: 24
Student ID: PG202
Program: Postgraduate (PG)
Specialization: Artificial Intelligence
Research Topic: Deep Learning
------------------------------------------
*/