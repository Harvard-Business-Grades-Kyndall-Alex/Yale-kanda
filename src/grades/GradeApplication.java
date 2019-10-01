package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradeApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        String userInput;
        Scanner scan = new Scanner(System.in);
//        System.out.println("Who's grades did you want to see?");
        Student student1 = new Student("Alex");
        Student student2 = new Student("Kyndall");
        Student student3 = new Student("Luis");
        Student student4 = new Student("Beverly");

        System.out.println("Would you like to look at your grades?");


            System.out.println("Here are the GitHub usernames of our students:\n" +
                    "\n" +
                    "|AlexderTheGreat| |KynderTheGarden| |LuisMeister| |BevsTheBoss|\n" +
                    "\n" +
                    "What is your username?\n");


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

        userInput = scan.nextLine();

//        do {
            if (userInput.equals("AlexderTheGreat")) {
                System.out.println("This users name is:" + student1.getName());
                System.out.println("This users average grade is:" + student1.getGradeAverage());

            } else if (userInput.equals("KynderTheGarden")) {
                System.out.println("This users name is:" + student2.getName());
                System.out.println("This users average grade is:" + student2.getGradeAverage());

            } else if (userInput.equals("LuisMeister")) {
                System.out.println("This users name is:" + student3.getName());
                System.out.println("This users average grade is:" + student3.getGradeAverage());

            } else if (userInput.equals("BevsTheBoss")) {
                System.out.println("This users name is:" + student4.getName());
                System.out.println("This users average grade is:" + student4.getGradeAverage());
            } else {
                System.out.println("Username not found. Try again?");
            }
//        } while(userInput.scan.nextLine().equalsIgnoreCase("y"));

    }
}
