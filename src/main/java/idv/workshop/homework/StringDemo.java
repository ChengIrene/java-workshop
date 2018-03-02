package idv.workshop.homework;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        //這個排序會因大小寫開頭有差異,小寫開頭會排在大寫開頭後
        String[] names = {"Tsurumaru", "Kuninaga", "odorokimasitaka"};
        Arrays.sort(names, String::compareTo);
        System.out.println(Arrays.toString(names));

        //此排序方法會忽略大小寫差異
        String[] names2 = {"Tsurumaru", "Kuninaga", "odorokimasitaka"};
        Arrays.sort(names2, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names2));
    }
}
