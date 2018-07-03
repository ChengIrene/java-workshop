package idv.workshop.homework;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

//從命令列引數指定資料夾路徑,查詢出該資料夾下的檔案,會先列出資料夾再列出檔案
public class Dir {
    public static void main(String[] args) throws IOException {
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(args[0]))) {  //命令列引數指定為C:\
            List<String> files = new ArrayList<>();
            for(Path path : directoryStream) {
                if(Files.isDirectory(path)) {
                    out.printf("[%s]%n", path.getFileName());
                }
                else {
                    files.add(path.getFileName().toString());
                }
            }
            files.forEach(out::println);
        }
    }
}
