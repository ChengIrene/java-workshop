package idv.workshop.homework;

public class DaemonDemo {
    //其實看不懂在幹嘛XD 只知道while的那部分沒被執行了
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("OTZ");
            }
        });

        thread.setDaemon(true);
        thread.start();
    }
}
