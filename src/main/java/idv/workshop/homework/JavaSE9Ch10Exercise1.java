package idv.workshop.homework;

import java.io.*;

public class JavaSE9Ch10Exercise1 {

    //因為不知道怎麼創log檔,所以這個還沒跑過!!! 我要記得問!!!

    //在例外發生時,可以使用例外物件的printStackTrace()顯示堆疊追蹤
    //如何改寫以下程式,使得例外發生時,可將堆疊追蹤附加至UTF-8編碼的exception.log檔案

    private final static String LOG_NAME = "rc/main/java/idv/";  //設定一個日誌(log檔)
    private final static int BUFFER_SIZE = 1024;

    public static void main(String[] args) throws FileNotFoundException {
        InputStream input = new FileInputStream("");
        OutputStream output = new FileOutputStream("");

        dump(input, output);
    }

    private static void dump(InputStream inputStream, OutputStream outputStream) {
        try (InputStream src = inputStream; OutputStream dest = outputStream) {  //嘗試自動關閉資源
            byte[] data = new byte[BUFFER_SIZE];
            int length;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
                // dest.write(data, 0 + Integer.MAX_VALUE, length);  //這兩行都是為了以發例外
                throw new IOException("爆炸惹~ㄏㄏㄏㄏㄏ");   //這邊故意噴錯~~~BOOOM!
            }
        } catch (IOException | IndexOutOfBoundsException ioException) {  //找出例外,呼叫方法,把例外寫進log
            writeErrorLog(ioException);
        }
    }

    private static void writeErrorLog(Exception exception) {  //把例外寫進log的方法
        try {
            Writer errorLog = new OutputStreamWriter(new FileOutputStream(LOG_NAME), "UTF-8");  //設定寫入的LOG跟編碼
            JavaSE9Ch10Exercise1.charDump(new StringReader(exception.toString()), errorLog);  //呼叫方法,將例外印轉成String(?)寫進去LOG
        } catch (IOException e) {
            e.printStackTrace();  //堆疊追蹤
        }
    }

    public static void charDump(Reader reader, Writer writer) throws IOException {
        try (Reader src = reader; Writer dest = writer) {  //關閉資源
            doCharDump(src, dest);
        }
    }

    private static void doCharDump(Reader src, Writer dest) throws IOException {
        //其實把input寫到output的方法內容大同小異(? 這邊要關閉嗎?
        char[] data = new char[BUFFER_SIZE];
        int length;
        while ((length = src.read(data)) != -1) {
            dest.write(data, 0, length);
        }
    }
}
