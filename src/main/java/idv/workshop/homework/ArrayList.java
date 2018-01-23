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


    //不懂
    public void toString(Object o) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
