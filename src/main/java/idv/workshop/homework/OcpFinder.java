package idv.workshop.homework;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class OcpFinder extends SimpleFileVisitor<Path> {
    private final PathMatcher matcher;
    private static int numMatches = 0;

    OcpFinder() {
        matcher = FileSystems.getDefault().getPathMatcher("glob:*java");
    }

    void find(Path file) {
        Path name = file.getFileName();
        if (name != null && matcher.matches(name)) {
            numMatches++;
        }
    }

    void report() {
        System.out.println("Matched:" + numMatches);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        find(file);
        return FileVisitResult.CONTINUE;
    }
    // 因為Finder類別只覆寫visitFile()方法,因此只會檢查擋案名稱是否滿足glob樣式


    public static void main(String[] args) throws IOException {
        OcpFinder finder = new OcpFinder();
        Files.walkFileTree(Paths.get("C:/work/javaworkshop"), finder);
        finder.report();
    }
}
