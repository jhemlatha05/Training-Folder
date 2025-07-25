package practice_app;


import practice_day2tasks.Student2;

public class StudentService {
    public void save(Student2 student) {
        System.out.println("Saving student: " + student.name);
    }

    public void print(Student2 student) {
        System.out.println("Student Details: " + student.name);
    }
}


