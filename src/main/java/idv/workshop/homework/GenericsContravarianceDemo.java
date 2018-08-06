package idv.workshop.homework;

import java.util.Comparator;

public class GenericsContravarianceDemo {
    public static void main(String[] args) {
        Comparator<GenericsFruit> priceComparator = (fruit1, fruit2) -> ((Comparable)fruit1.price).compareTo(fruit2.price);
        //Comparator<GenericsFruit> priceComparator = (fruit1, fruit2) -> fruit1.price - fruit2.price;

        GenericsBasket<GenericsApple> apples = new GenericsBasket<>(
                new GenericsApple(25, 150), new GenericsApple(20, 100));
        apples.sort(priceComparator);

        for(GenericsApple apple : apples.things) {
            System.out.printf("Apple(%d, %d) ", apple.price, apple.weight);
        }
        System.out.println();

        GenericsBasket<GenericsBanana> bananas = new GenericsBasket<>(
                new GenericsBanana(50, 300), new GenericsBanana(30, 200));

        bananas.sort(priceComparator);

        for (GenericsBanana banana : bananas.things) {
            System.out.printf("Banana(%d %d) ", banana.price, banana.weight);
        }
        System.out.println();
    }
}
