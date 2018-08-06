package idv.workshop.homework;

import static java.lang.String.format;

public enum EnumPriority2 {
    MAX(10) {
        public String toString() {
            return format("(%2d) - 最大權限", value);
        }
    },
    NORM(5) {
        public String toString() {
            return format("(%2d) - 普通權限", value);
        }
    },
    MIN(1) {
        public String toString() {
           return format("(%2d) - 最小權限", value);
        }
    };

    protected int value;
    private EnumPriority2(int value) {  //不為public的建構式
        this.value = value;
    }

    public int value() {  //自定義方法
        return value;
    }

    public static void main(String[] args) {
        for(EnumPriority2 priority : EnumPriority2.values()) {
            System.out.println(priority);
        }
    }
}
