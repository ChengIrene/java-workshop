package idv.workshop.homework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public interface OcpTechFilter extends Predicate<String> {
    public default boolean test(String str) {
        return str.equals("Java");
    }

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Java", "Java FX", "Java SE");
        Predicate<String> p1 = s -> s.length() > 3;
        Predicate<String> p2 = new OcpTechFilter() {
            @Override
            public boolean test(String s) {
                return s.contains("Java");
            }
        };

        long qty = strs.stream().filter(p1).filter(p2).count();
        System.out.println(qty);

        //結果為3
    }
}
