package idv.workshop.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil2 {
    public static String readFile(String name) throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        try(Scanner console = new Scanner(new FileInputStream(name))){  //自動嘗試關閉資源
            while (console.hasNext()) {
                text.append(console.nextInt()).append('\n');
            }
        }
        return text.toString();
    }
}
