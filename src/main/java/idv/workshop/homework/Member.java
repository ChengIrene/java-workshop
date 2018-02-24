package idv.workshop.homework;

import java.io.*;

public class Member {
    private String name;
    private String number;
    private int age;

    public Member(String name, String number, int age) {
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
        try(DataOutputStream output = new DataOutputStream(new FileOutputStream(number))) {
            //根據不同的型態呼叫writeXXX()方法
            output.writeUTF(name);
            output.writeUTF(number);
            output.writeInt(age);
        }
    }

    public static Member load(String number) throws IOException {
        Member member;
        //建立DataInputStream包裹FileInputStream
        try(DataInputStream input = new DataInputStream(new FileInputStream(number))) {
            //根據不同的形態呼叫readXXX()方法
            member = new Member(input.readUTF(), input.readUTF(), input.readInt());
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
