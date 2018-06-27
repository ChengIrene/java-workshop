package idv.workshop.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Foo {
    private static int num;

    static {
        num = 3;
    }

    static {
        num = 4;
    }

    static void findSquare(int num) {
        num = num * num;
    }

    public static void main(String[] args) {
        findSquare(num);
        System.out.println("Result = " + num);

        System.out.println(3 + 5 >= 5 + 1);  //印出結果為true

        int []a = {1, 3, 5};
        for(int i : a){
            System.out.println(i+" ");
            i++;
        }
        //結果印出135,下面的i++不影響增強式迴圈
        //增強式迴圈 for(元素資料型別 該元素之區域變數 : 母體集合)

        int i=10;
        int j = i /= 2;
        System.out.println(i);
        System.out.println(j);
        //i和j最後都是5

        int c = 5;
        if(c++ <= 5){
            System.out.println(c);
        }else{
            System.out.println("else condition");
        }
        //印出來的結果為6,因為先跑完if的條件後才會加1,從原本的5變成6

        StringBuilder message = new StringBuilder("hello java!");
        int pos = 0;
        try {
            for (pos = 0; pos < 12; pos++) {
                switch (message.charAt(pos)) {
                    case 'a':
                    case 'e':
                    case 'o':
                        String uc = Character.toString(message.charAt(pos)).toUpperCase();
                        message.replace(pos, pos + 1, uc);
                }
            }
        } catch (Exception e) {
            System.out.println("Out of limits");
        }
        System.out.println(message);

        int num[][] = new int[1][3];
        System.out.println(num[0].length);
        for (int d = 0; d < num.length; d++) {
            for (int e = 0; e < num[d].length; e++) {
                num[d][e] = 10;
            }
        }

        String names[] = new String[3];
        names[0] = "Mary Brown";
        names[1] = "Nancy Red";
        names[2] = "Jessy Orange";
        try {
            for (String n : names) {
                try {
                    String pwd = n.substring(0, 3) + n.substring(6, 10);
                    System.out.println(pwd);
                } catch (StringIndexOutOfBoundsException sie) {
                    System.out.println("String out of limits");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of limits");
        }

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 20);
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);

        List<String> names1 = new ArrayList<>();
        names1.add("Robb");
        names1.add("Bran");
        names1.add("Rick");
        names1.add("Bran");
        if (names1.remove("Bran")) {
            names1.remove("Jon");
        }
        System.out.println(names1);

        int ii = 0;
        int jj = 7;
        for (ii = 0; ii < jj - 1; ii = ii + 2) {
            System.out.print(ii + " ");
        }

        ArrayList a1 = new ArrayList();
        a1.add("A");
        a1.add(1, "B");  //將"B"加入到索引1的位置
        System.out.println(a1);
        //最後印出結果為[A, B]

        System.out.println('a' + 'a');

        int num1[][] = new int[1][3];
        for (int x = 0; x < num1.length; x++) {
            System.out.println(num1.length);
            for (int y = 0; y < num[x].length; y++) {
                System.out.println(num[x].length);
                num[x][y] = 10;
            }
        }

        String abc = "ABC";
        String bcd = "BCD";

        int r = abc.compareTo(bcd);
        int q = bcd.compareTo(abc);
        System.out.println(r);
        System.out.println(q);

        if(true) System.out.println("1");   //可以這樣寫,但很醜千萬不要學|||
        else System.out.println("2");
    }
}
