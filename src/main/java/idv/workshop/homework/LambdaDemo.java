package idv.workshop.homework;

import java.util.Arrays;

public class LambdaDemo {

    /*
     * //匿名類別的應用場合
     * String[] names1 = {"Tsurumaru", "Kuninaga", "odorokimasitaka"};
     * Arrays.sort(names1, new Comparator<String>() {
     *    public int compare(String name1, String name2) {
     *        return - (name1.length() - name2.length());
     *    }
     * });
     *
     * //將new Comparator<String>包裝
     * Comparator<String> byLength = new Comparator<String>() {
     *     public int compare(String name1, String name2) {
     *         return name1.length() - name2.length();
     *     }
     * }
     * String[] names2 = {"Tsurumaru", "Kuninaga", "odorokimasitaka"};
     * Arrays.sort(names2, byLength);
     *
     * //用Lambda
     * Comparator<String> byLength = (String name1, String name2) -> - (name1.length() - name2.length());
     *
     * //從等號左邊的Comparator<String>宣告就可以知道,Lambda表示式實際上是要實作Comparator<String>的compare()方法
     * //所以可以再簡化如下
     * Comparator<String> byLength = (name1, name2) -> - (name1.length() - name2.length);
     *
     * //因為最後,等號右邊的表示式夠剪短了,所以就變成直接放進範例的sort()方法中(如下)
     *
     */

    public static void main(String[] args) {
        String[] names = {"Tsurumaru", "Kuninaga", "odorokimasitaka"};
        Arrays.sort(names, (name1, name2) -> - (name1.length() - name2.length()));
        System.out.println(Arrays.toString(names));
    }
}
