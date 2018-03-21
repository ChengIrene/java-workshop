package idv.workshop.homework;

public class CircularQueuePractice {
    private int[] queue;
    private int head;
    private int tail;

    // Number of elements in this queue  統計佇列裡面有多少元素
    private int elementCount;

    public CircularQueuePractice(int length) {
        queue = new int[length];
        head = 0;
        tail = -1;
        elementCount = 0;
    }

    public void insert(int element) {
        // Check the tail index already exceed the max length or not
        // 檢查尾端的索引是否有超過佇列長度
        if(tail == queue.length - 1) {
            tail = -1;  //如果超過長度的話,將tail歸為-1,因為這樣插入下個元素後, 尾巴就會繼續從0開始算
        }
        tail++;  //原本為-1,此行後開始變為0
        queue[tail] = element;  //queue[0]開始加入元素
        elementCount++;

        if(elementCount > queue.length) {   //環狀佇列會覆蓋元素
            //如果塞進去的東西數量已經超過queue.length了, 還是一樣以queue.length計算
            elementCount = queue.length;
        }
    }

    public int remove() {
        //先判斷佇列裡面有無東西
        if (elementCount == 0) {
            return 0;
        }
        int temp = queue[head];
        queue[head] = 0;

        // Check the head index already exceed the max length or not
        if(head == queue.length - 1) {

            // If the removed node is tail
            // it means that the next node will be removed must be the head node since this is a circular queue
            // so reset head index to 0

            // 如果被刪除的節點是尾的話,就代表下一個被刪除的節點要重頭開始跑
            // 所以將頭歸為0

            head = 0;

        } else {
            head++;
        }
        elementCount--;
        return temp;
    }

    public int peek() {
        return queue[head];
    }

    public boolean isEmpty() {
        return elementCount == 0;
    }

    public boolean isFull() {
        return elementCount == queue.length;
    }

    public int getElementCount() {
        return elementCount;
    }
}
