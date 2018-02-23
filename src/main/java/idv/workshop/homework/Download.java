package idv.workshop.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Download {
    //有讀了網頁的代碼,只是點開文件後還是讓我有點嚇到
    public static void main(String[] args) throws IOException {
        URL url = new URL(args[0]);
        InputStream src = url.openStream();
        OutputStream dest = new FileOutputStream(args[1]);
        IO.dump(src, dest);
    }
}
