package idv.workshop.homework;

import java.io.*;

public class DumpUTF8 {
    public static void main(String[] args) throws IOException {
        dump(new FileInputStream(args[0]), new FileOutputStream(args[1]), "UTF-8");
    }

    public static void dump(Reader src, Writer dest) throws IOException {
        try(Reader input = src; Writer output = dest) {
            char[] data = new char[1024];
            int length;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }

    public static void dump (InputStream src, OutputStream dest, String charset) throws IOException {
        dump(new InputStreamReader(src, charset), new OutputStreamWriter(dest, charset));
    }
}
