package idv.workshop.homework;

public class SimpleLinkedList {

    //將收集的物件用Node封裝
    private class Node {
        Node(Object o) {
            this.o = o;
        }
        Object o;
        Node next;
    }

    //第一個節點
    private Node first;

    //新增Node封裝物件,並由上一個Node的next參考
    public void add(Object elem) {
        Node node = new Node(elem);
        if(first == null) {
            first = node;
        } else {
            append(node);
        }
    }

    private void append(Node node) {
        Node last = first;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
    }

    public int size() {
        int count = 0;
        Node last = first;
        while (last != null) {
            last = last.next;
            count++;
        }
        return count;
    }

    public Object get(int index) {
        checkSize(index);
        return findElemOf(index);
    }

    private void checkSize(int index) throws IndexOutOfBoundsException {
        int size = size();
        if(index >= size) {
            throw new IndexOutOfBoundsException(String.format("Index: d%, Size: %d", index, size));
        }
    }

    private Object findElemOf(int index) {
        int count = 0;
        Node last = first;
        while (count < index) {
            last = last.next;
            count++;
        }
        return last.o;
    }
}
