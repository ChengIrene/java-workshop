package idv.workshop.homework;

import java.nio.file.Path;
import java.nio.file.Paths;

import static java.lang.System.out;

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("user.home"), "Documents", "Downloads");
        out.printf("toSting: %s%n", path.toString());
        out.printf("getFileName: %s%n", path.getFileName());
        out.printf("getName(0): %s%n", path.getName(0));
        out.printf("getNameCount: %d%n", path.getNameCount());
        out.printf("subpath(0,2): %s%n", path.subpath(0, 2));
        out.printf("getParent: %s%n", path.getParent());
        out.printf("getRoot: %s%n", path.getRoot());

        //印出結果

        //toSting: C:\Users\YO\Documents\Downloads
        //getFileName: Downloads
        //getName(0): Users
        //getNameCount: 4
        //subpath(0,2): Users\YO
        //getParent: C:\Users\YO\Documents
        //getRoot: C:\

        path.forEach(out::println);
        //Path實作了Iterable介面,若要取得中分段的路徑資訊,也可以使用增強式for迴圈或forEach()方法

        //印出結果為 Users YO Documents Downloads

        Path path1 = Paths.get("C:\\Users\\YO\\.\\Documents\\Downloads").normalize();
        Path path2 = Paths.get("C:\\Users\\..\\YO\\.\\Documents\\Downloads").normalize();
        //路徑中若有冗餘資訊,可以使用normalize()方法移除

        Path path3 = Paths.get("C:\\Users");
        Path path4 = Paths.get("YO");
        Path path5 = path3.resolve(path4);
        //路徑與路徑可以使用resolve()結合,最後會得到代表C:\User\YO的Path實例

        Path p1 = Paths.get(System.getProperty("User.home"), "Documents", "Downloads");
        Path p2 = Paths.get("C:\\workspace");
        Path p1ToP2 = p1.relativize(p2);
        out.println(p1ToP2);
        //如果有兩個路徑,想知道如何從一個路徑切換至另一路徑,則可以用relativize()方法
        //最後會顯示 ..\..\..\..\workspace

    }
}
