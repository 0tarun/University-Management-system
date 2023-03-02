import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course c1 = new Course("011221498", "oop", 5.6);
        Course c2 = new Course("011221478", "spl", 3.9);
        int choice;
        String Option;
        System.out.println("01:ADD");
        System.out.println("02:DELETE");
        System.out.println("03:UPDATE");
        System.out.println("04:PRINT");
        System.out.println("05:SEARCH");
        choice = input.nextInt();
        if (choice == 1) {
            System.out.println("01:ADD A STUDENT");
            System.out.println("02:ADD A COURSE");
            System.out.println("03:ADD A FACULTY");
int choiceoption2= input.nextInt();
if(choiceoption2==1) {
    for (int i = 0; i < 2; i++) {
        int ID = input.nextInt();
        String Name = input.next();
        double CGP = input.nextDouble();

        Student s = new Student(ID, Name, CGP);
        if (i < 2) {
            c1.addStudent(s);
        } else {
            c2.addStudent(s);
        }
    }
}

            Faculty f = new Faculty(6999569, "karakul", "lecturer");
            c1.addFaculty(f);
            c2.addFaculty(f);
            c2.PrintStudentList();
            System.out.println(c1.toString());

        }
    }
}