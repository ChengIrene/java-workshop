package idv.workshop.homework;

class Hello2 {
    //lambda本身會去抓自己當下存在的範圍, 從這個範圍裡去找出this(就是Hello2 class)還有toString方法(被override過後的那個)
    Runnable r1 = () -> System.out.println(this);
    Runnable r2 = () -> System.out.println(toString());

    //可以對Hello以及Hello2中的r2的toString()按ctrl再點一下 會發現他們會指向不同的toString方法
    public String toString() {
        return "Hello, world";
    }
}

public class ThisDemo2 {
    public static void main (String[] args) {
        Hello2 hello = new Hello2();
        hello.r1.run();
        hello.r2.run();
    }
}
