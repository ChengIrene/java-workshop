package idv.workshop.homework;

import org.junit.Test;

import java.io.FileNotFoundException;

public class FileUtil1Test {

    @Test
    public void testCreate() throws FileNotFoundException {
        System.out.println(FileUtil1.readFile("C:/Users/YO/Desktop/test.txt"));
    }
}
