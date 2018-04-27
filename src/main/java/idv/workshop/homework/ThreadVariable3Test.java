package idv.workshop.homework;

// 可以在變數上宣告volatile,表示變數是不穩定.易變的,也就是可能在多執行緒下存取
// 這表示變數的可見性,也就是若有執行緒變動了變數值,另一執行緒一定可以看到變更

class Variable3 {
    volatile static int i = 0, j = 0;  //易變的

    static void one() {
        i++;
        j++;
    }

    static void two() {
        System.out.printf("i = %d, j = %d%n", i,j );
    }
}

public class ThreadVariable3Test {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                Variable3.one();
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                Variable3.two();
            }
        });

        thread1.start();
        thread2.start();
    }

    // volatile 保證的是單一變數的可見性,執行緒對變數的存取一定是在共享記憶體中,
    // 不會在自己的記憶空間中快取變數,執行緒對共享記憶體中變數的存取,另一執行緒一定看的到

    // 就此程式來看,使用volatile並不是正確的用法,正確使用例子在11-29頁下面
}
