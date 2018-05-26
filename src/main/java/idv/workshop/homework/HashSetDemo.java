package idv.workshop.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

    public static void main(String[] args) {

        //HashSet物件集合hs "無法保證" 每次走訪(iterator)集合元素內容十,都能透過特定的次序依序取出
        HashSet hs = new HashSet();

        //利用add()加入元素內容
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");

        Iterator it1 = hs.iterator();  //利用iterator()擷取HashSet的iterator走訪器

        while (it1.hasNext()) {
            String data = (String)it1.next();  //利用next()取出目前所指向的集合元素內容,因為回傳直是Object的資料型態,所以要適當轉型
            System.out.println(data);
        }

        //相對於HashSet, LinkedHashSet 的元素內容擺放是具有順序性的(根據加入的順序 insertion order)
        //在使用上若希望將HashSet的內容透過特定的方式(例如當初加入元素內容的順序)依序取出(iteratin order)
        //可以在程式實作時將HashSet集合轉換成LinkedHashSet集合
        LinkedHashSet lhs = new LinkedHashSet(hs);

        lhs.add("E");
        lhs.add("F");

        Iterator it2 = lhs.iterator();

        while (it2.hasNext()) {
            String data = (String)it2.next();
            System.out.println(data);
        }

        TreeSet ts = new TreeSet(hs);  //將hs放入到TreeSet中

        ts.add("G");
        ts.add("H");

        Iterator it3 = ts.iterator();

        while (it3.hasNext()) {
            String data = (String) it3.next();
            System.out.println(data);
        }
    }
}
