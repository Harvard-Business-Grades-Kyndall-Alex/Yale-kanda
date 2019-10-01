package grades;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();
    private Scanner scanner;

    public Student(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
//        System.out.println("Please enter a word: ");
        return scanner.nextLine();
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
       this.grades.add(grade);
    }

    public int getGradeAverage() {
        int sum = 0;
        for (Integer avg : grades) {
            sum += avg;
//            System.out.println( sum / grades.size());
        }
        return sum / grades.size();
    }


//    public static void main(String[] args) {
//        System.out.println(getGradeAverage());
//        getGradeAverage();
//
//
//    }
}
