package idv.workshop.homework;

class Hello {

    Runnable r1 = new Runnable() {
        public void run() {
            //這個this指的就是r1後面的 "new Runnable" 的那個Runnable instance.
            System.out.println(this);
        }
    };

    Runnable r2 = new Runnable() {
        public void run() {
            //r2裡面的toString()方法也是r2後面的"new Runnable"的那個Runnable的instance上面的toString()方法, 就是沒有被override過的toString()方法
            System.out.println(toString());
        }
    };

    public String toString() {
        return "Hello, world";
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.r1.run();
        hello.r2.run();
    }
}
