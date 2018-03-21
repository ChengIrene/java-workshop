package idv.workshop.homework;

/*
*  https://yotsuba1022.gitbooks.io/data-structure-note/content/stack.html
*
*  1. push: 塞東西到stack
*  2. pop: 把最上面的東西彈出來
*  3. peek: 只觀看最上面的東西, 不要彈出來
*
* */

public class StackPractice {

    private int[] data;
    private int top = -1;

    public StackPractice(int length) {
        data = new int[length];
    }

    public void push(int element) {
        if(top < this.data.length - 1) {  //this也可以不寫,因為不管怎麼用都是指最上面的data
            top++;
            this.data[top] = element;
        }
    }

    public int pop() {
        return data[top--];
    }

    public int peek() {
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == this.data.length - 1;
    }

    public int size() {
        return top + 1;
    }
}