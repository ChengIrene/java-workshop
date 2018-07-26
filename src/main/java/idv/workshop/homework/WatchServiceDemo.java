package idv.workshop.homework;

import java.nio.file.*;

public class WatchServiceDemo {
    public static void main(String[] args) throws Exception {
        Path dir = Paths.get("C:/temp");
        WatchService ws = FileSystems.getDefault().newWatchService();  //取得預設檔案系統下的WatchService監聽器實體

        //註冊WatchService監聽器要監聽的事件分別是建立.刪除與修改
        dir.register(ws,
                StandardWatchEventKinds.ENTRY_CREATE,  //建立
                StandardWatchEventKinds.ENTRY_DELETE,  //刪除
                StandardWatchEventKinds.ENTRY_MODIFY);  //修改

        while (true) {
            System.out.println("系統監聽中...");
            WatchKey watchKey = ws.take();  //調用take()方法開始監聽
            for (WatchEvent<?> event: watchKey.pollEvents()) {  //若在任意時點上C:\temp下有建立.刪除與修改檔案或目錄發生,則會執行for迴圈,分析該事件資料
                System.out.println("事件:" + event.kind().name() + ", " + "資源:" + event.context().toString());
            }
            watchKey.reset();  //監聽器重置(reset)
        }
    }
}
