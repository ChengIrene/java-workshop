package idv.workshop.homework;

public class ThisMethodTest {
    public static void main(String[] args) {
        new Other(1);
        //結果順序會是 物件初始區塊 > Other() 建構式 > Other(int o) 建構式
    }
}

class Other {
    {   //如果有撰寫物件初始區塊,物件建立之後會先執行物件初始區塊
        System.out.println("物件初始區塊");
    }

    Other() {
        System.out.println("Other() 建構式");
    }

    Other(int o) {
        this();  //這邊用this()呼叫了Other版本的建構式
        System.out.println("Other(int o) 建構式");
    }
}