package idv.workshop.homework;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class NIO2Download {
    public static void main(String[] args) throws IOException {
        URL url = new URL(args[0]);
        Files.copy(url.openStream(), Paths.get(args[1]), REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
    }
}
