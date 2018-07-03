package idv.workshop.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//如果要使用FileVisitor走訪資料夾,可以使用File.walkFileTree()方法
public class DirAll {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get(args[0]), new ConsoleFileVisitor());
    }
}
