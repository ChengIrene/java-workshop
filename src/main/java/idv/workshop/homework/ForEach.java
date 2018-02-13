package idv.workshop.homework;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List names = Arrays.asList("Sinsengumi", "Okita", "Souji");
        forEach(names);
        forEach(new HashSet(names));
        forEach(new ArrayDeque(names));
    }

    static void forEach (Iterable iterable) {
        for (Object obj : iterable) {
            System.out.println(obj);
        }
    }
}
