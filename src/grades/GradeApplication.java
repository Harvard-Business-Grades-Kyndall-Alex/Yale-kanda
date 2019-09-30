package grades;

import java.util.HashMap;

public class GradeApplication {
    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Alex");
        Student student2 = new Student("Kyndall");
        Student student3 = new Student("Luis");
        Student student4 = new Student("Beverly");

        //student 1 grades
        student1.addGrade(80);
        student1.addGrade(70);
        student1.addGrade(90);
        //student 2 grades
        student2.addGrade(70);
        student2.addGrade(77);
        student2.addGrade(80);
        //student 3 grades
        student3.addGrade(80);
        student3.addGrade(75);
        student3.addGrade(88);
        //student 4 grades
        student4.addGrade(81);
        student4.addGrade(78);
        student4.addGrade(91);


        System.out.println(students);

        students.put("AlexderTheGreat", student1);
        students.put("KynderTheGarden", student2);
        students.put("LuisMeister", student3);
        students.put("BevsTheBoss", student4);


    }
}
