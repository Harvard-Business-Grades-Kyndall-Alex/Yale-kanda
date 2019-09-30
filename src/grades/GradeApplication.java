package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradeApplication {
        Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();
        System.out.println("Who's grades did you want to see?");
        Student student1 = new Student("Alex");
        Student student2 = new Student("Kyndall");
        Student student3 = new Student("Luis");
        Student student4 = new Student("Beverly");

//        String student = student1.scan.nextLine();

        //student 1 grades
        student1.addGrade(100);
        student1.addGrade(60);
        student1.addGrade(20);
        //student 2 grades
        student2.addGrade(80);
        student2.addGrade(80);
        student2.addGrade(80);
        //student 3 grades
        student3.addGrade(80);
        student3.addGrade(80);
        student3.addGrade(80);
        //student 4 grades
        student4.addGrade(80);
        student4.addGrade(87);
        student4.addGrade(80);

//        students.put();
//        System.out.println(students);

        students.put("AlexderTheGreat", student1);
        students.put("KynderTheGarden", student2);
        students.put("LuisMeister", student3);
        students.put("BevsTheBoss", student4);


//        System.out.println(student1.getGradeAverage());

    }
}
