package practice_sys;

import practice_day2tasks.Student2;
import practice_app.StudentService;

public class System {
    public static void main(String[] args) {
        Student2 s = new Student2("Nikhil");
        StudentService service = new StudentService();
        service.save(s);
        service.print(s);
    }
}


