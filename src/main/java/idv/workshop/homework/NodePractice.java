package idv.workshop.homework;

public class NodePractice {

    //將收集的物件用Node封裝
    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public  class LinkedList {

        public Node first;
        public Node last;

        //判斷是否為空
        public boolean isEmpty() {
            return first == null;
        }

        //印出
        public void print() {
            Node current = first;

            while (current != null) {
                System.out.println("[" + current.data + "]");
                current = current.next;
            }
            System.out.println();
        }

        //連結兩個鏈結串列
        public LinkedList concatenate(LinkedList head1, LinkedList head2) {
            LinkedList ptr;
            ptr = head1;

            while (ptr.last.next != null) {
                ptr.last = ptr.last.next;
            }
            ptr.last.next = head2.first;
            return head1;
        }
    }
}


