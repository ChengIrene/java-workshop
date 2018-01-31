package idv.workshop.homework;

import java.util.Arrays;

public class ArrayList {
    private Object[] elems;  //使用Object陣列收集
    private int next;  //下一個可儲存物件的索引

    public ArrayList(int capacity) {  //指定初始容量
        elems = new Object[capacity];
    }

    public ArrayList() {
        this(16);  //初始容量預設為16
    }

    public void add(Object o) {  //收集物件方法
        if(next == elems.length) {  //自動增長Object陣列長度
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems [next++] = o;
    }

    public  Object get(int index) {  //依索引取得收集之物件
        return elems [index];
    }

    public int size() {  //已收集的物件個數
        return next;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < elems.length; i++) {
            if (elems[i] != null) {
                result.append(elems[i].toString() + "\n");
            }
        }

        //for (Object object : elems) {
            //if (object != null) {
                //result.append(object.toString() + "\n");
            //}
        //}

        return result.toString();
    }

    // Method signature (function signature)
    // return type + function name + function parameters
    // boolean equals(Object o)
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        // 1. compare the total elements count
        if (this.size() == ((ArrayList) o).size()) {
            // 2. compare each element's equality
            for(int i = 0; i < this.size(); i++) {
                if (this.get(i) != ((ArrayList) o).get(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
