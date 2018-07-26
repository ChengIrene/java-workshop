package idv.workshop.homework;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class OcpMyFoo<K, V> {
    private K key;
    private V value;
    public OcpMyFoo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <T> OcpMyFoo<T, T> twice(T value) {
        return new OcpMyFoo<T, T>(value, value);
    }

    OcpMyFoo<String, Integer> optionA = new OcpMyFoo<String, Integer>("Duke", 10);

    OcpMyFoo<String, String> optionB = OcpMyFoo.<String> twice("Duke");

    // OcpMyFoo<Object, Object> optionC = new OcpMyFoo<String, Integer>("Duke", 32);  //錯誤

    OcpMyFoo<? extends Object, ? extends Object> optionC = new OcpMyFoo<String, Integer>("Duke", 32);  //正確寫法

    OcpMyFoo<String, String> optionD = new OcpMyFoo<>("Duke", "Java");


    public static void main(String[] args) {

        //題目測試

        SimpleDateFormat sdf = new SimpleDateFormat("zzzz", Locale.US);
        System.out.println(sdf.format(new Date()));
        //印出結果為時區名稱 China Standard Time

        SimpleDateFormat test = new SimpleDateFormat("yyyy/MM/dd", Locale.US);
        System.out.println(test.format(new Date()));
        //印出結果為 2018/07/26

        IntStream stream = IntStream.of(10, 20, 30);
        IntFunction<IntUnaryOperator> IF = x -> y -> x*y;
        IntStream newStream = stream.map(IF.apply(15));
        newStream.forEach(System.out::println);
        //印出結果為 150 300 450 (原本的數乘上15

        Object[] array1 = new Object[3];
        array1[0] = "foo";
        array1[0] = "x";
        array1[0] = "2";

        int index = Arrays.binarySearch(array1, "test");
        //只有array1[0]有值,其他為空,所以找到array1[1]會拋出例外
        System.out.println(index);

    }
}
