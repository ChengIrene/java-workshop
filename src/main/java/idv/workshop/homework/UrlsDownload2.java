package idv.workshop.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class UrlsDownload2 {

    public static void main(String[] args) throws Exception {

        URL[] urls = {
            new URL("http://openhome.cc/Gossip/Encoding/"),
            new URL("http://openhome.cc/Gossip/Scala/"),
            new URL("http://openhome.cc/Gossip/JavaScript/"),
            new URL("http://openhome.cc/Gossip/Python/"),
        };

        String[] fileNames = {
                "Encoding.html",
                "Scala.html",
                "JavaScript.html",
                "Python.html"
        };

        // 差在這個步驟
        for (int i = 0; i < urls.length; i++) {
            int index = i;
            new Thread(() -> {  //用Lambda重新定義run()方法來執行
                try {
                    dump(urls[index].openStream(), new FileOutputStream(fileNames[index]));
                } catch (IOException ex) {  //抓到例外拋出
                    throw new RuntimeException(ex);
                }
            }).start();
        }
    }

    static void dump(InputStream src, OutputStream dest) throws IOException {

        try (InputStream source = src; OutputStream destination = dest) {
            byte[] data = new byte[1024];
            int length;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }

    }
}
