package idv.workshop.homework;

import java.util.Scanner;
import static java.lang.System.out;

public class Guest {
    public static void main(String[] args) {
        ArrayList1 names = new ArrayList1();
        collectNameTo(names);
        out.println("訪客名單: ");
        printUpperCase(names);
    }

    public static void collectNameTo(ArrayList1 names) {
        Scanner console = new Scanner(System.in);
        while (true) {
            out.print("訪客名稱: ");
            String name = console.nextLine();
            if(name.equals("quit")) {
                break;
            }
            names.add(name);
        }
    }

    public static void printUpperCase(ArrayList1 names) {
        for(int i = 0; i < names.size(); i++) {
            String name = (String) names.get(i);
            out.println(name.toUpperCase());
        }
    }
}
