package idv.workshop.homework;

public class InsufficientException extends Exception {

    private int remain;

    public InsufficientException(String message, int remain) {
        super(message);
        this.remain = remain;
    }

    public int getRemain() {  //這個方法我沒用到,大概是寫錯哪邊了OTZ!!!
        return remain;
    }
}
