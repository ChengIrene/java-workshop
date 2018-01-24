package idv.workshop.homework;

public class CallByValue {
    public static void main (String[] args) {
        Customer c1 = new Customer("Yuri");
        some(c1);  // Q1: c1的參考物件會被改變嗎?  A1: 會
        System.out.println(c1.name);
        //在呼叫some()方法時傳入了c1,這表示將c1參考的物件也讓some()方法的參數參考,所c1與參數c參考同一物件"Yuri"
        //在some()方法中c.name = "Yurio",就是要求將c參考物件的name成員指定為"Yurio"
        //所以c1跟c參考物件的name會被指定為"Yurio"
        //some()方法執行完後,c變數不存在了,下一行取得c1.name就會顯示"Yurio"

        Customer c2 = new Customer("Yuri");
        other(c2);  // Q2: c2的參考物件不會被改變嗎?  A2: 不會
        System.out.println(c2.name);
        //other()方法呼叫時傳入了c2,這表示將c2參考的物件,也讓other()方法的參數c參考
        //在other()方法中 c = new Customer("Victor") ,就是要求建立新物件,並指定給c參考
        //所以c2仍是參考"Yuri",但是c會參考至新的物件"Victor"
        //other()方法執行結束後,c變數不存在了,所以會顯示c2的"Yuri"
    }

    static void some(Customer c) {
        c.name = "Yurio";  // Q3: 改變了哪個物件?  A3: c1被改變了
    }

    static void other(Customer c) {
        c = new Customer("Victor");  // Q4: 參考了哪個物件?  A4: c參考了"Victor" 但c2還是"Yuri"
    }
    //對傳值好像有比較懂了......!?!?!?
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Customer customer = (Customer) o;

        //       condition      [      name not null       ] : [    name is null    ]
        return (name != null) ? (name.equals(customer.name)) : (customer.name == null);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}