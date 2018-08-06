package idv.workshop.homework;

public class GenericsCovarianceDemo {
    public static void main(String[] args) {
        GenericsNode<GenericsApple> apple1 = new GenericsNode<> (new GenericsApple(), null);
        GenericsNode<GenericsApple> apple2 = new GenericsNode<> (new GenericsApple(), apple1);
        GenericsNode<GenericsApple> apple3 = new GenericsNode<> (new GenericsApple(), apple2);
        GenericsNode<GenericsBanana> banana1 = new GenericsNode<>(new GenericsBanana(), null);
        GenericsNode<GenericsBanana> banana2 = new GenericsNode<> (new GenericsBanana(), banana1);

        show(apple3);
        show(banana2);
    }

    public static void show(GenericsNode<? extends GenericsFruit> n) {
        GenericsNode<? extends GenericsFruit> node = n;
        do {
            System.out.println(node.value);
            node = node.next;
        } while (node != null);
    }
}
