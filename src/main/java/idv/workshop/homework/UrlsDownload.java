package idv.workshop.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;



public class UrlsDownload {

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

        for(int i = 0; i <urls.length; i++) {
            dump(urls[i].openStream(), new FileOutputStream(fileNames[i]));
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
