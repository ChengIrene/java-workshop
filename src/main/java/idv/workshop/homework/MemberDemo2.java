package idv.workshop.homework;

public class MemberDemo2 {
    public static void main(String[] args) throws Exception {
        Member2[] members = {
                new Member2("Kiyomitsu", "B1234", 180),
                new Member2("Yasusada", "B5678", 200),
                new Member2("Souji", "B5494", 190)
        };
        for(Member2 member : members) {
            member.save();
        }
        System.out.println(Member2.load("B1234"));
        System.out.println(Member2.load("B5678"));
        System.out.println(Member2.load("B5494"));
    }
}
