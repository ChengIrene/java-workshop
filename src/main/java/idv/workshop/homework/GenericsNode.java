package idv.workshop.homework;

public class GenericsNode<T> {
    public T value;
    public GenericsNode<T> next;

    public GenericsNode(T value, GenericsNode<T> next) {
        this.value = value;
        this.next = next;
    }
}
