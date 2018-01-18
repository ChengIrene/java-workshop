package idv.workshop.homework;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class JavaSE9Ch4BasicCoding {
    public static void main(String[] args) {

        //Guess number
        Scanner console = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        int guess;

        do {
            System.out.print("猜數字 0~9 : ");
            guess = console.nextInt();
        } while (guess != number);

        System.out.println("当たりました！！！");

        //Try to practice java.math.BigDecimal
        BigDecimal operand1 = new BigDecimal("1.0");
        BigDecimal operand2 = new BigDecimal("0.8");
        BigDecimal result = operand1.subtract(operand2);
        System.out.println(result);

        //Try to practice java.math.BigDecimal again
        BigDecimal op1 = new BigDecimal("0.1");
        BigDecimal op2 = new BigDecimal("0.1");
        BigDecimal op3 = new BigDecimal("0.1");
        BigDecimal result2 = new BigDecimal("0.3");

        if (op1.add(op2).add(op3).equals(result2)) {
            System.out.println("等於 0.3");   //this one is true
        } else {
            System.out.println("不等於 0.3");
        }

        //Practice how to use Wrapper
        int data1 = 10;
        int data2 = 20;

        Integer wrapper1 = new Integer(data1);  //包裹基本型態
        Integer wrapper2 = new Integer(data2);

        System.out.println(data1 / 3);  //基本型態運算
        System.out.println(wrapper1.doubleValue() / 3);  //操作包裹器方法
        System.out.println(wrapper1.compareTo(wrapper2));  //compareTo()方法可和另一個Integer物件進行比較,等值傳回0,小於傳回-1,大於傳回1

        //Array
        int[] scores = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("學生分數:%d%n", scores[i]);
        }

        //Two dimensional array
        int[][] cords = {  //宣告二維陣列並初始值
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int x = 0; x < cords.length; x++) {  //得知有幾列
            for (int y = 0; y < cords[x].length; y++) {  //取得每列的長度
                System.out.printf("%2d", cords[x][y]);
            }
            System.out.println();
        }

        //Use enhanced for loop is better than for loop, but I still don't understand enhanced for loop ...
        for (int[] row : cords) {
            for (int value : row) {
                System.out.printf("%2d", value);
            }
            System.out.println();
        }

        //Try to use java.util.Arrays.fill method
        int[] scores2 = new int[10];
        for (int score : scores2) {
            System.out.printf("%2d", score);
        }
        System.out.println();
        Arrays.fill(scores2, 60);
        for (int score : scores2) {
            System.out.printf("%3d", score);
        }
        System.out.println();

        //Irregular array
        int[][] arr = new int[2][];  //宣告arr參考物件會有2個索引
        arr[0] = new int[] {1, 2, 3, 4, 5};  //arr[0]是長度為5的一維陣列
        arr[1] = new int[] {1, 2, 3};  //arr[1]是長度為3的一維陣列
        for(int[] row : arr) {
            for(int value : row) {
                System.out.printf("%2d", value);
            }
            System.out.println();
        }

        //Integer array
        Integer[] scores3 = new Integer[3];
        for(Integer score : scores3) {
            System.out.println(score);
        }

        scores3[0] = 99;
        scores3[1] = 87;
        scores3[2] = 66;
        for(Integer score : scores3) {
            System.out.println(score);
        }

        //Copy array
        int[] scores4 = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
        int[] scores5 = Arrays.copyOf(scores4, scores4.length);
        for(int score : scores2) {
            System.out.printf("%3d", score);
        }
        System.out.println();
        scores5[0] = 99;
        //不影響scores4參考的陣列物件,只有scores5的第一個數值會改變
        for(int score : scores4) {
            System.out.printf("%3d", score);
        }
        System.out.println();
        for(int score : scores5) {
            System.out.printf("%3d", score);
        }
        System.out.println();

        //String sum
        Scanner console2 = new Scanner(System.in);
        long sum = 0;
        long number1 =0;
        do {
            System.out.print("輸入數字 : ");
            number1 = Long.parseLong(console2.nextLine());
            sum += number1;
        } while (number1 != 0);
        System.out.println("總合 : " + sum);

        //1~100
        StringBuilder oneTo100 = new StringBuilder();
        for(int i = 1; i < 100; i++) {
            oneTo100.append(i).append('+');
        }
        System.out.println(oneTo100.append(100).toString());
    }
}
