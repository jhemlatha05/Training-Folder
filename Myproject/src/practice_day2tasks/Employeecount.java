package practice_day2tasks;
public class Employeecount {
   static int count = 0;

    Employeecount() {
        count++;
    }

    public static void main(String[] args) {
        Employeecount e1 = new Employeecount();
        Employeecount e2 = new Employeecount();
        Employeecount e3 = new Employeecount();

        System.out.println("Total Employees: " + Employeecount.count);
    }
}



