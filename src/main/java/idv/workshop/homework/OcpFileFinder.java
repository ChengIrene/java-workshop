package idv.workshop.homework;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class OcpFileFinder extends SimpleFileVisitor<Path> {
    private final PathMatcher matcher;

    OcpFileFinder() {
        matcher = FileSystems.getDefault().getPathMatcher("glob:*md");
    }

    void find(Path file) {
        Path name = file.getFileName();
        if (name != null && matcher.matches(name)) {
            System.out.println(name);
        }
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes atr) {
        find(file);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        OcpFileFinder obj = new OcpFileFinder();
        Files.walkFileTree(Paths.get("C:/work/fujyosi-diary"), obj);
    }
}
