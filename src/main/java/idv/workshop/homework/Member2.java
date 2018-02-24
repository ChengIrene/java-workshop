package idv.workshop.homework;

import java.io.*;

//ObjectInputStream提供readObject()方法將資料讀入為物件
//ObjectOutputStream提供writeObject()方法將物件寫至目的地
//可以被這兩個方法處理的物件,必須實作java.io.Serializable介面
//這個介面沒有定義任何方法,只是作為標示之用,表示這個物件是可以序列化的
public class Member2 implements Serializable {
    private String name;
    private String number;
    private int age;

    public Member2(String name, String number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %d)", name, number, age);
    }

    public void save() throws IOException {
        //建立DataOutputStream包裹FileOutputStream
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(number))) {
            output.writeObject(this);  //呼叫writeObject()方法寫入物件
        }
    }

    public static Member2 load(String number) throws IOException, ClassNotFoundException {
        Member2 member;
        //建立DataOutputStream包裹FileOutputStream
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(number))) {
            member = (Member2) input.readObject();  //呼叫readObject()方法讀入物件
        }
        return member;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
