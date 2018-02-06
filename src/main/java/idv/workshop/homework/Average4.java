package idv.workshop.homework;

import java.util.Scanner;

public class Average4 {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        while (true) {
            int number = nextInt();
            if(number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        System.out.printf("Average %.2f%n", sum / count);
    }

    static Scanner console = new Scanner(System.in);

    static int nextInt() {
        String input = console.next();
        //matches()方法中設定了"\\d*",這是規則表示式(Regular expression),表式檢查字串中的字元是不是數字,是會傳回true
        while (!input.matches("\\d*")) {
            System.out.println("Please enter integer.");
            input = console.next();
        }
        return Integer.parseInt(input);
    }
}
