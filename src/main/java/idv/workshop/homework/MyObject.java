package idv.workshop.homework;

public class MyObject {
    static int count;

    MyObject() {
        ++count;
    }

    public static void main(String[] args) throws Exception {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyObject obj3 = new MyObject();

        System.out.println("目前有 " + count + " 個實體物件");
        obj2 = null;
        System.out.println("建議啟動資源回收機制");
        System.gc();
        Thread.sleep(1000);  //暫停一段時間
        System.out.println("目前剩餘 " + count + " 個實體物件");
    }

    // finalize() 方法就相當於物件的死亡證明
    // runFinalization() 建議終結者執行續趕快執行那些應該執行卻還沒有被執行的 finalize() 方法

    protected void finalize() throws Throwable {
        --count;
        String tName = Thread.currentThread().getName();
        System.out.println("執行 finalize() 的是:" + tName);
    }
}
