package idv.workshop.homework;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
//也可以使用 import static java.lang.System.*; 來取代上面兩行

public class JavaSE9Ch5BasicCoding {
    public static void main(String[] args) {
        Scanner console = new Scanner(in);
        out.print("請輸入姓名: ");
        out.printf("%s 你好! %n", console.nextInt());

        out.println(JavaSE9Ch5BasicCoding.sum(1,2,3,4,5));
        out.println(JavaSE9Ch5BasicCoding.sum(new int[] {1, 2, 3}));
    }

    //不定長度引數(Variable-length Argument)
    public static int sum(int... numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
