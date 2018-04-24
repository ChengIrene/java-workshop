package idv.workshop.homework;

public class ThreadGroupDemo {

    public static void main(String[] args) {

        //匿名內部類別
        ThreadGroup group = new ThreadGroup("group") {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                System.out.printf("%s: %s%n", thread.getName(), throwable.getMessage());
                //跑出來會是 "Thread-0: 測試之外"
            }
        };

        //Lambda
        Thread thread = new Thread(group, () -> {
            throw new RuntimeException("測試之外");
        });

        thread.start();
    }
}
