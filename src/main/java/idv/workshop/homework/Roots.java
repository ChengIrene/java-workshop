package idv.workshop.homework;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import static java.lang.System.out;

public class Roots {
    public static void main(String[] args) {
        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();  //取得檔案系統根資料夾路徑資訊
        dirs.forEach(out::println);
    }
}
