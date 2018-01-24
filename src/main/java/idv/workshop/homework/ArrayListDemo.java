package idv.workshop.homework;

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
    }

}
