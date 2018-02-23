package idv.workshop.homework;

import java.io.*;

public class IO {

    // java -Dfile.encoding=UTF-8 IO src\main\resources\test.txt src\main\resources\output.txt
    //arg[0] -> src\main\resources\test.txt   arg[1] -> src\main\resources\output.txt
    public static void main(String[] args) throws IOException, FileNotFoundException {
        dump(new FileInputStream(args[0]), new FileOutputStream(args[1]));
    }

    // input file -> size: 2148 byte
    // 1st src.read -> 1024 byte, write 1024 byte into dest
    // 2nd src.read -> 1024 byte, write 1024 byte into dest
    // erd src.read ->  100 byte, write  100 byte into dest
    public static void dump(InputStream input, OutputStream output) throws IOException {
        //try (input; output) { -> only work in JDK9
        // variable declared in try block should be equals to final variable
        try (InputStream src = input; OutputStream dest = output) {
            // buffer, 1024 byte = 1MB
            byte[] data = new byte[1024];
            int length;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}


