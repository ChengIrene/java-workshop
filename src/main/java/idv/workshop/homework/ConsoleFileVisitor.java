package idv.workshop.homework;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import static java.lang.System.out;
import static java.nio.file.FileVisitResult.CONTINUE;

public class ConsoleFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) throws IOException {
        printSpace(path);
        out.printf("[%s]%n", path.getFileName());
        return CONTINUE;  //傳回FileVisitorResult.CONTINUE 表示繼續走訪資料夾
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attr) {
        printSpace(path);
        out.printf("%s%n", path.getFileName());
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.err.println(exc);
        return CONTINUE;
    }

    private void printSpace(Path path) {
        out.printf("%" + path.getNameCount() * 2 + "s", " ");
    }
}
