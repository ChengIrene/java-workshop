package idv.workshop.homework;

class Variable1 {

    static int i = 0, j = 0;

    static void one() {
        i++;
        j++;
    }

    static void two() {
        System.out.printf("i = %d, j = %d%n", i, j);
    }
}

public class ThreadVariable1Test {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                Variable1.one();
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                Variable1.two();
            }
        });

        thread1.start();
        thread2.start();
    }

    // thread1 會呼叫Variable1.one(), thread2 會呼叫Variable1.two()
    // 有可能會發生 thread2 呼叫 Variable1.two() 取得i值後,切換至 thread1不斷執行 Variable1.one() 多次
    // 再切回 thread2 取得j值, 因此可能出現j "遠大於" i的顯示結果

    // 可以在one()和two()方法上標示synchronized, 如此每次thread1呼叫one()時,thread2就必須等待thread1釋放鎖定, 才能呼叫two()
    // thread2呼叫two()時, thread1就必須等待thread2釋放鎖定, 才可以呼叫one()
}
