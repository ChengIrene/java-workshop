package idv.workshop.homework;

public class ThreadGroupDemo2 {

    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("group");

        Thread thread1 = new Thread(group, () -> {
            throw new RuntimeException("thread1 測試例外");
        });

        thread1.setUncaughtExceptionHandler((thread, throwable) -> {
            System.out.printf("%s: %s%n", thread.getName(), throwable.getMessage());
        });

        //未設定 Thread.UncaughtExceptionHandler 實例, 所以由ThreadGroup預設的第三個處理方式, 顯示堆疊追蹤
        Thread thread2 = new Thread(group, () -> {
            throw new RuntimeException("thread2 測試例外");
        });

        thread1.start();
        thread2.start();
    }
}
