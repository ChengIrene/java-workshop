package idv.workshop.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static idv.workshop.homework.Average4.console;

public class FileUtil {


    public static String readFile(String name) throws FileNotFoundException {
        //宣告方法中會拋出例外

        StringBuilder text = new StringBuilder();
        try{
            Scanner console = new Scanner(new FileInputStream(name));
            while (console.hasNext()) {  //檢查是否有輸入,有的話傳回true
                text.append(console.nextLine()).append('\n');
            }
        } finally {
            if (console != null) {
                console.close();
            }
        }
        return text.toString();
    }
}
