package idv.workshop.homework;

import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        Customer c1 = new Customer("QQ");  // memory location: 0xeor84k
        Customer c2 = new Customer("QQ");  // memory location: 0xne84j5
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));
        System.out.println("----------");

        arrayList.add("Student A");
        arrayList.add("Student B");
        arrayList.add("Student C");
        arrayList.add(null);

        //for (int i = 0; i < arrayList.size(); i++) {
        //    System.out.println(arrayList.get(i));
        //}

        System.out.println(arrayList);

        ArrayList collection1 = new ArrayList();
        collection1.add(10);
        collection1.add(30);
        collection1.add(40);
        collection1.add(5);

        ArrayList collection2 = new ArrayList();
        collection2.add(10);
        collection2.add(30);
        collection2.add(40);
        collection2.add(5);

        ArrayList collection3 = new ArrayList();
        collection3.add(10);
        collection3.add(33);
        collection3.add(40);
        collection3.add(5);

        System.out.println(collection1.equals(collection2));
        System.out.println(collection1.equals(collection3));
    }

    private void doNothing() {
        // A utility class for array objects (Object[])
        // Arrays.equals();
        int[] intArray = new int[20];
        int[] intArray2 = new int[30];
        Arrays.equals(intArray, intArray2);
        char[] charArray = new char[10];

        // ArrayList is a type of collection, similar to LinkedNode.
        java.util.ArrayList arrayList = new java.util.ArrayList();
        LinkedList linkedList = new LinkedList();


    }
}
