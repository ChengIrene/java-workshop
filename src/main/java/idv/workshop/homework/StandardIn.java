package idv.workshop.homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StandardIn {
    //設定有成功,可以讀到
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream(args[0]));
        try (Scanner file = new Scanner(System.in)) {
            while (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        }
    }
}
