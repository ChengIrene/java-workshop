package idv.workshop.homework;

public enum EnumPriority {
    MAX(10), NORM(5), MIN(1);  //呼叫下面的enum建構式

    private int value;
    private EnumPriority(int value) {  //不為public的建構式
        this.value = value;
    }

    public int value() {  //自定義方法
        return value;
    }

    public static void main(String[] args) {
        for(EnumPriority priority : EnumPriority.values()) {
            System.out.printf("Priority(%s, %d)%n", priority, priority.value());
        }
    }
}
