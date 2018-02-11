package idv.workshop.homework;

import java.util.HashSet;
import java.util.Set;

public class Students {

    public static void main(String[] args) {
        Set students = new HashSet();

        students.add(new Student("Kiyomitsu", "okita"));
        students.add(new Student("Yasusada", "souji"));
        students.add(new Student("Kiyomitsu", "okita"));

        System.out.println(students);
    }
}
