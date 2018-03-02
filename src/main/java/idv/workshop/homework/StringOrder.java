package idv.workshop.homework;

public class StringOrder {

    //依文字長度排序 短>長
    public static int byLength(String s1, String s2) {
        return s1.length() - s2.length();
    }

    //依文字長度排序 長>短
    public static int byLengthReverse(String s1, String s2) {
        return - (s1.length() - s2.length());
    }

    //依字典順序排序 小寫會排在大寫後
    public static int byLexicography(String s1, String s2) {
        return s1.compareTo(s2);
    }

    //依字典順序排序 忽略大小寫差異
    public static int byLexicogrsphyIgnoreCase(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
}
