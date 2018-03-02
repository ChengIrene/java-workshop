package idv.workshop.homework;

import java.util.Arrays;

public class StringOrderDemo {
    public static void main(String[] args) {
        String[] names = {"Tsurumaru", "Kuninaga", "odorokimasitaka"};
        Arrays.sort(names, StringOrder::byLength);  //方法參考(Method reference)
        System.out.println(Arrays.toString(names));
    }
}
