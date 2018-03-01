package idv.workshop.homework;

import java.io.FileInputStream;
import java.io.IOException;

public class FileUtil {
    public static void open(String fileName, IOConsumer<FileInputStream> consumer) {
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            consumer.accept(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
