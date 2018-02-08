package idv.workshop.homework;

import org.junit.Test;

import java.io.FileNotFoundException;

public class FileUtilTest {

    @Test
    public void testCreate() throws FileNotFoundException {
        System.out.println(FileUtil.readFile("C:/Users/YO/Desktop/test.txt"));
    }
}
