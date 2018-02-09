package idv.workshop.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guest2 {
    public static void main(String[] args) {
        List names = new ArrayList();
        collectNameTo(names);
        System.out.println("訪客名單: ");
        printUpperCase(names);
    }

    static void collectNameTo(List names) {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("Guest name: ");
            String name = console.nextLine();
            if(name.equals("quit")) {
                break;
            }
            names.add(name);
        }
    }

    static void printUpperCase(List names) {
        for(int i = 0; i < names.size(); i++) {
            String name = (String) names.get(i);
            System.out.println(name.toUpperCase());
        }
    }
}
