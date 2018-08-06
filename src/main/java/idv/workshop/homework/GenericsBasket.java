package idv.workshop.homework;

import java.util.Arrays;
import java.util.Comparator;

public class GenericsBasket<T> {
    public T[] things;

    public GenericsBasket(T... things) {
        this.things = things;
    }

    public void sort(Comparator<? super T> comparator) {
        Arrays.sort(things, comparator);
    }
}
