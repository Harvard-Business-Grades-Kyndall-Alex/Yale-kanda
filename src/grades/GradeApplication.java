package grades;

import java.util.HashMap;

public class GradeApplication {
    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Alex");
        Student student2 = new Student("Kyndall");
        Student student3 = new Student("Luis");
        Student student4 = new Student("Beverly");


        System.out.println(students);

        students.put("AlexderTheGreat", student1);
        students.put("KynderTheGarden", student2);
        students.put("LuisMeister", student3);
        students.put("BevsTheBoss", student4);


    }
}
