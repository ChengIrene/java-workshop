package idv.workshop.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StandardOut {
    public static void main(String[] args) throws IOException {
        try (PrintStream file = new PrintStream( new FileOutputStream(args[0]))) {  //設定創建新的文字檔給args[0]
            System.setOut(file);
            System.out.println("HelloWorld");
            //執行完後HelloWorld會寫入設定的文字檔裡
        }
    }
}
