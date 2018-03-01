package idv.workshop.homework;

import java.io.*;

public class JavaSE9Ch10Exercise2 {
    private final static int BUFFER_SIZE = 1024;  //設定緩衝容量為1024byte
    private static final String FILE_ENCODING = "UTF-8";  //設定編碼為UTF-8

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(args[0]);
        OutputStream outputStream = new FileOutputStream(args[1]);

        JavaSE9Ch10Exercise2.charDumpWithSpecifiedEncoding(inputStream, outputStream, FILE_ENCODING);
    }

    public static void charDumpWithSpecifiedEncoding(InputStream src, OutputStream dest, String charset) throws IOException {
        doCharDump(new InputStreamReader(src, charset), new OutputStreamWriter(dest, charset));
    }

    private static void doCharDump(Reader src, Writer dest) throws IOException {
        try(Reader input = src; Writer output = dest) {  //沒有自動關閉的話會看不到字!!!
            char[] data = new char[BUFFER_SIZE];  //一次寫入1024byte
            int length;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}
