package idv.workshop.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaSE9Ch4Exercises {
    public static void main(String[] args) {

        //Enter the number of Fibonacci numbers you want to calculate
        Scanner console = new Scanner(System.in);
        System.out.print("Do you want to how many Fibonacci numbers : ");
        int number = console.nextInt();
        //不過到底是從0開始還是要從1開始呀!?!?!?
        for (int i = 1; i <= number; i++) {
            System.out.print(JavaSE9Ch4Exercises.fibonacciNumber(i) + " ");
        }
        System.out.println("");

        //Order the numbers from least to greatest
        int[] number2 = {70, 80, 31, 37, 10, 1, 48, 60, 33, 80};

        //Before
        for (int i = 0; i < number2.length; i++) {
            System.out.print(number2[i] + " ");
        }
        System.out.println("");

        //After(greatest to least)
        for(int i = 0; i < number2.length-1; i++) {
            for(int j = 0; j < number2.length-i-1; j++) {
                if(number2[ j ] < number2[ j+1 ] ) {
                    int temp = number2[ j ];
                    number2[ j ] = number2[ j+1 ];
                    number2[ j+1 ] = temp;
                }
            }
        }
        for(int i = 0; i < number2.length; i++) {
            System.out.print(number2[ i ] + " ");
        }
        System.out.println("");

        //Use Array.sort() method to order the number from least to greatest
        Arrays.sort(number2);

        for (int i = 0; i < number2.length; i++) {
            System.out.print(number2[i] + " ");
        }
        System.out.println("");


        //Use Arrays.binarySearch method to find the number of index from array
        Scanner search = new Scanner(System.in);
        int number3[] = {1, 10, 31, 33, 37, 48, 60, 70, 80};

        for (int i = 0; i < number3.length; i++) {
            System.out.print(number3[i] + " ");
        }
        System.out.println("");
        System.out.println("Which number of index you want to search?");
        int searchNumber = search.nextInt();
        int find;
        int notFind = -1;

        if ((find = Arrays.binarySearch(number3, searchNumber)) >= 0) {
            System.out.println("Find index : " + find);
        } else {
            System.out.println("Not be found : " + notFind);
        }

        //Call useIndexOf method
        JavaSE9Ch4Exercises indexOf = new JavaSE9Ch4Exercises();
        if (indexOf.useIndexOf(searchNumber) >= 0) {
            System.out.println("Find index : " + indexOf.useIndexOf(searchNumber));
        } else {
            System.out.println("Not be found : " + indexOf.useIndexOf(searchNumber));
        }
    }

    //Use List.indexOf method
    public int useIndexOf(int x) {
        List<Integer> inputs = Arrays.asList(1, 10, 31, 33, 37, 48, 60, 70, 80);

        for (Integer input : inputs) {
            if (input.equals(x)) {
                return inputs.indexOf(input);
            }
        }
        return -1;
    }

    //Fibonacci number (費式數列), 利用遞迴(Recursion)
    public static long fibonacciNumber(int n) {
        long result = 0;

        for (int i = 1; i <= n; i++) {
            if (n <= 1) {
                result = n;
            } else {
                //第一次用遞迴.......還不是很懂 囧
                result = fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
            }
        }
        return result;
    }
}
