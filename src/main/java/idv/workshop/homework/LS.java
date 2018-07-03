package idv.workshop.homework;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//此範例可指定Glob搜尋工作資料夾下符合的檔案
public class LS {
    public static void main(String[] args) throws IOException {
        //預設取得所有檔案
        String glob = args.length == 0 ? "*" : args[0];

        //取得目前工作路徑
        Path userPath = Paths.get(System.getProperty("user.dir"));
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(userPath, glob)) {
            directoryStream.forEach(path -> System.out.println(path.getFileName()));
        }
    }
}