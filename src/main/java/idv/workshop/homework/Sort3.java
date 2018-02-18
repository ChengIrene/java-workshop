package idv.workshop.homework;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.reverseOrder;
import static java.util.Comparator.nullsFirst;

public class Sort3 {
    public static void main(String[] args) {
        List words = Arrays.asList("B", "X", "A", "M", null, "F", "W", "O", null);
        words.sort(nullsFirst(reverseOrder()));
        System.out.println(words);
    }
}
