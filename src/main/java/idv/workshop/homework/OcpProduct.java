package idv.workshop.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OcpProduct {
    int seq;
    int qty;
    public OcpProduct(int id, int price) {
        this.seq = id;
        this.qty = price;
    }

    @Override
    public String toString() {
        return seq + ":" + qty;
    }

    public static void main(String[] args) {
        List<OcpProduct> ps = Arrays.asList(new OcpProduct(1, 10), new OcpProduct(2, 20), new OcpProduct(3, 30));


        OcpProduct p = ps.stream().reduce(new OcpProduct(4, 0), (p1, p2) -> {
            p1.qty += p2.qty;
            System.out.println(p1.seq + ":" + p1.qty);  // 印出結果為 4:10  4:30  4:60
            return new OcpProduct(p1.seq, p1.qty);  // 最後回傳為 4:60
        });

        ps = new ArrayList<OcpProduct>(ps);
        ps.add(p);
        ps.stream().parallel().reduce((p1, p2) -> p1.qty > p2.qty ? p1 : p2).ifPresent(System.out::println);
    }
}
