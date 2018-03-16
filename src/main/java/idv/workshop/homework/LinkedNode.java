package idv.workshop.homework;

public class LinkedNode {

    private int id;
    private LinkedNode next;

    public LinkedNode(int id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode head) {
        this.next = next;
    }

    @Override
    public String toString() {
        String result = "( id = " + id;
        if(next != null) {
            result = result.concat(", next = " + next.getId());
        }
        result = result.concat(" )");
        return result;
    }
}
