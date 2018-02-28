package idv.workshop.homework;

import java.io.*;

public class JavaSE9Ch10Exercise1 {

    //在例外發生時,可以使用例外物件的printStackTrace()顯示堆疊追蹤
    //如何改寫以下程式,使得例外發生時,可將堆疊追蹤附加至UTF-8編碼的exception.log檔案

    public static void dump(InputStream src, OutputStream dest) throws IOException {
        try(InputStream source = src; OutputStream destination =dest) {
            byte[] data = new byte[1024];
            int length;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
