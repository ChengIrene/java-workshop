package idv.workshop.homework;

public class LinkedList {

    private LinkedNode head;  //做為頭的標籤
    private int size = 0;  //鏈結串列長度

    public void insertHead(int id) {  //頭插法
        LinkedNode newNode = new LinkedNode(id);  //要插入的新節點
        newNode.setNext(head);  //將新節點指向原本的頭,也就是把新節點插在頭前面
        head = newNode;  //在將變為最初的新節點給予頭的標籤
        size++;  //長度增加1
    }

    public void insertTail(int id) {  //尾插法
        LinkedNode newNode = new LinkedNode(id);  //要插入的新節點
        if(head == null) {
            head = newNode;  //鏈結串列為空的話直接指定newNode為頭
        } else {
            LinkedNode tail = head;  //由頭開始尋找尾
            while (tail.getNext() != null) {  //若尋找到下一個getNext()為空的話,則是到找到尾,跳出迴圈
                tail = tail.getNext();  //藉由迴圈不斷尋找下一個,直到找到尾
            }
            tail.setNext(newNode);  //將newNode插入到尾的後一個
        }
        size++;  //長度增加1
    }

    public LinkedNode removeHead() {  //刪掉頭
        if(size == 0) {  //如果是空的Linked則回傳空
            return null;
        } else {
            LinkedNode tmp = head;  //把head先標籤貼在tmp上
            head = head.getNext();  //取得head的下一個節點,再貼上head
            size--;  //長度-1
            return tmp;  //要不要傳回被刪掉的節點沒有一定的答案
        }
    }

    public LinkedNode find(int id) {
        LinkedNode node = head;
        while (node != null && node.getId() != id) {  //如果下一個節點不等於空and這個節點的ID不等於要尋找的id
            if(node.getNext() == null) {  //如果跑到最後還是沒有要尋找的id則回傳空
                return null;
            } else {
                node = node.getNext();  //若下一個為尋找的對象,則迴圈會到這停止,從迴圈的最後一個節點取得下一個節點
            }
        }
        return node;  //傳回要尋找的節點
    }

    public LinkedNode remove(int id) {
        if(size == 0) {
            return null;
        }

        LinkedNode deleted = head;    //有一種初始化的感覺(?) 從頭開始跑這樣
        LinkedNode previous = head;

        // To search the deleted node and it's previous node
        while (deleted.getId() != id) {
            if(deleted.getNext() == null) {
                return null;
            } else {
                previous = deleted;  //把原本的deleted標籤給previous
                deleted = deleted.getNext();  //再把下一個節點貼上deleted標籤,繼續跑回圈到找到為止
            }
        }

        // Reset the relationship of nodes
        if(deleted.equals(head)) {  //如果刪除的節點是head的話
            head = head.getNext();  //將head下一個節點貼上head
        } else {
            previous.setNext(deleted.getNext());  //將previous跳過deleted,直接指向deleted的下一個
        }

        size--;  //長度-1
        return deleted;  //要不要傳回被刪掉的節點沒有一定的答案
    }

    /*
    *
    * 若給定一個單向的連結串列:
    * N(1), N(2), N(3), N(4), ..., N(m-1), N(m)
    * 請實作一個演算法可以產出如下的reorder list:
    * N(1), N(m), N(2), N(m-1), N(3)...
    *
    * e.g.:
    * Input: 1,2,3,4,5
    * Output: 1,5,2,4,3
    *
    * 限制: 盡可能追求時間最佳化與空間最佳化
    * 這裡只討論最佳解, 時間複雜度為O(n)
    *
    * 思路:
    * 1. 透過龜兔賽跑演算法求出中間節點, 即要對半切的那個點
    * 2. 用剛才找到的中間點去把串列分成兩半
    * 3. 用反序的方式重排後半段
    * 4. 把兩半串列合起來
    *
    * 因為比較難,所以先放置XD
    *
    * https://yotsuba1022.gitbooks.io/data-structure-note/content/linked-list-reorder-function.html
    *
    * */

    public LinkedNode reorderList(LinkedNode node) {

        // Step1: Find the middle node by using tortoise and hare algorithm(Floyd判圈算法,又稱龜兔賽跑算法)
        LinkedNode tortoise = node;
        LinkedNode hare = tortoise.getNext();
        while (hare != null && hare.getNext() != null) {
            tortoise = tortoise.getNext();
            hare = hare.getNext().getNext();
        }

        // Step2: Split the list into two parts
        LinkedNode firstHead = node;
        LinkedNode secondHead = tortoise.getNext();
        tortoise.setNext(null);

        secondHead = reverseList(secondHead);

        // Just see it as a dummy node;
        node = new LinkedNode(0);

        LinkedNode current = node;
        while (firstHead != null || secondHead != null) {
            // First, add one node from the first part into the list
            if(firstHead != null) {
                current.setNext(firstHead);
                current = current.getNext();
                firstHead = firstHead.getNext();
            }

            // Then, add one node from the second part into the list
            if (secondHead != null) {
                current.setNext(secondHead);
                current = current.getNext();
                secondHead = secondHead.getNext();
            }
        }

        // Since the node is dummy node, need to take the next node as head
        node = node.getNext();
        return node;
    }

    private LinkedNode reverseList(LinkedNode node) {  //看完攻略本後已懂,也會寫ㄌ
        LinkedNode previous = null;
        LinkedNode current = node;
        LinkedNode next;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        node = previous;
        return node;
    }

    public void displayList() {
        LinkedNode tmp = head;
        while (tmp != null) {
            System.out.println(tmp.toString());
            tmp = tmp.getNext();
        }
    }

    public int getSize() {
        return size;
    }
}
