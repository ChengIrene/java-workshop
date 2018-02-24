package idv.workshop.homework;

import java.io.IOException;

public class MemberDemo {
    public static void main(String[] args) throws IOException {
        Member[] members = {
                new Member("Kiyomitsu", "B1234", 180),
                new Member("Yasusada", "B5678", 200),
                new Member("Souji", "B5494", 190)
        };
        for(Member member : members) {
            member.save();
        }
        System.out.println(Member.load("B1234"));
        System.out.println(Member.load("B5678"));
        System.out.println(Member.load("B5494"));
    }
}
