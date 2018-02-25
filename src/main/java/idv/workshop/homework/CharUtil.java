package idv.workshop.homework;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharUtil {
    public static void dump(Reader src, Writer dest) throws IOException {  //資料來源與目的地,還有客戶端要處理例外
        try(Reader source = src; Writer destination =dest) {  //嘗試自動關閉資源
            char[] data = new char[1024];  //嘗試每次從來源讀取1024字元
            int length;
            while ((length = src.read(data)) != -1) {  //讀取資料
                dest.write(data, 0, length);  //寫出資料
            }
        }
    }
}
