package idv.workshop.homework;

public class ThreadArrayListDemo {

    // 未加上 "synchronized" 的話, 可能會發生 ArrayIndexOutBoundException (陣列長度過長,超出範圍)
    // 這就是多個執行緒存取同一物件相同資源時所引發的競速情況(Race condition)
    // 一般稱這樣的類別為不具備執行緒安全(Thread-safe)的類別
    // 解決方法之一,可以在add()等方法上加上synchronized關鍵字
    // 例如以下:

    // (一) 將關鍵字宣告在方法上
    // public synchronized void add(Object o) {
    //     if(next == elems.length) {
    //         elems = Arrays.copyOf(elems, elems.length * 2);
    //     }
    //     elems [next++] = o;
    // }

    // (二) 以陳述句方式使用 >>> 相較於將整個方法宣告為synchronized來說,會比較有效率
    // public void add(Object o) {
    //     synchronized(this) {    <<<陳述句方式
    //         if(next == elems.length) {
    //             elems = Arrays.copyOf(elems, elems.length * 2);
    //         }
    //         elems [next++] = o;
    //     }
    // }
    // 在執行緒要執行synchronized區塊時,必須取得括號中指定的物件鎖定


    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (list) {  // (三) 可以指定取得鎖定的物件來源,對於本身設計沒有考慮競速問題的API來說,也可以如此撰寫
                    list.add(1);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (list) {
                    list.add(2);
                }
            }
        });

        thread1.start();
        thread2.start();

        // 不過改完還是免不了出錯
        // Exception in thread "Thread-1" Exception in thread "Thread-0" java.lang.OutOfMemoryError...
    }
}
