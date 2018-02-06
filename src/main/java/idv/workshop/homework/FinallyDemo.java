package idv.workshop.homework;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println(test(true));
    }

    //無論try區塊中有無發生例外,若撰寫有finally區塊,則finally區塊一定會被執行
    //結果會先出現"finally"再出現傳回的"1"
    static int test(boolean flag) {
        try {
            if(flag) {
                return 1;
            }
        } finally {
            System.out.println("finally...");
        }
        return 0;
    }
}
