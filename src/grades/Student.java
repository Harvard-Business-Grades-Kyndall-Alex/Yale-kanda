package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();


    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
       this.grades = grades;
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int i : grades) sum += i; {
            System.out.println(((double) sum)/grades.size());
        }
        return ((double) sum)/grades.size();
    }


//    public static void main(String[] args) {
//        System.out.println(getGradeAverage());
//        getGradeAverage();
//
//
//    }
}
