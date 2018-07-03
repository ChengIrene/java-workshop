package idv.workshop.homework;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesDemo {
    public static void main(String[] args) throws Exception {
        Path file = Paths.get("C:\\Windows");
        BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);

        System.out.printf("creationTime: %s%n", attrs.creationTime());
        System.out.printf("lastAccessTime: %s%n", attrs.lastAccessTime());
        System.out.printf("lastModifiedTime: %s%n", attrs.lastModifiedTime());
        System.out.printf("isDirectory: %b%n", attrs.isDirectory());
        System.out.printf("isOther: %b%n", attrs.isOther());
        System.out.printf("isRegularFile: %b%n", attrs.isRegularFile());
        System.out.printf("isSymbolicLink: %b%n", attrs.isSymbolicLink());
        System.out.printf("size: %d%n", attrs.size());

    }
}
