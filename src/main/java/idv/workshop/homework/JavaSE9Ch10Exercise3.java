package idv.workshop.homework;

import java.util.Scanner;

public class JavaSE9Ch10Exercise3 {

    //唔........run config還未設定,等我先搞懂這東西在幹麻吧 囧

    //試著撰寫一個FileUtil類別,其中包括open()方法,包括了
    // 1.處理FileInputStream實例建立
    // 2.close()方法呼叫
    // 3.以及將IOException包裹為java.io.UncheckedIOException實例並重新拋出的程式流程

    public static void main(String[] args) {
        FileUtil.open(args[0], fileInputStream -> {
            Scanner file = new Scanner(fileInputStream);
            while(file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        });
    }
}
