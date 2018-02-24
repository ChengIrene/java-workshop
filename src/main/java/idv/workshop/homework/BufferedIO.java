package idv.workshop.homework;

import java.io.*;

public class BufferedIO {
    public static void main(String[] args) throws IOException {
        dump(new FileInputStream(args[0]), new FileOutputStream(args[1]));
    }

    public static void dump(InputStream src, OutputStream dest) throws IOException {
        try(InputStream input = new BufferedInputStream(src); OutputStream output = new BufferedOutputStream(dest)) {
            byte[] data = new byte[1024];
            int length;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }
}
