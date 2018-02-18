package idv.workshop.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
        Collections.sort(words, new StringComparator());  //可以寫成 words.sort(new StringComparator());
        System.out.println(words);
    }
}
