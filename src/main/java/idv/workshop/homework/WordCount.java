package idv.workshop.homework;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter the words: ");
        Set words = tokenSet(console. nextLine());
        System.out.printf("There are %d words no duplicated : %s%n", words.size(), words);
    }

    static Set tokenSet(String line) {
        String[] tokens = line.split(" ");  //根據空白切割出字串
        return new HashSet(Arrays.asList(tokens));  //使用HashSet實作收集字串
    }
}
