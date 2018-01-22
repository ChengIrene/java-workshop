package idv.workshop.homework;

//這樣的東西測試要怎麼寫呀??
public class OverloadTest {
    public static void main(String[] args) {
        SomeMethod s = new SomeMethod();
        s.someMethod(1);
        s.someMethod(new Integer(1));
    }
}

class SomeMethod {
    void someMethod(int i) {
        System.out.println("int ver was called");
    }

    void someMethod(Integer integer) {
        System.out.println("Integer ver was called");
    }
}