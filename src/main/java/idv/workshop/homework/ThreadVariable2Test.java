package idv.workshop.homework;

class Variable2 {
    static int i = 0, j = 0;

    static synchronized void one() {
        i++;
        j++;
    }

    static synchronized void two() {
        System.out.printf("i = %d, j = %d%n", i, j);
    }
}

public class ThreadVariable2Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                Variable2.one();
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                Variable2.two();
            }
        });

        thread1.start();
        thread2.start();
    }

    // synchronized 保證了one()中i與j一定都會遞增完成,才釋放鎖定,或是two()中一定取得i與j值顯示後,才會釋放
    // 所以執行結果中,顯示i與j值一定都是"相同"

    // 由於synchronized 會造成執行緒阻斷,使得呼叫one()時,其他執行緒就不能呼叫two(),反之亦然,所以執行時會看到速度明顯變慢
}
