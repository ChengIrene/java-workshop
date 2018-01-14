package idv.workshop.homework;

public class JavaSE9Ch3BasicCodingTest {
    public static void main(String[] args) {

        //求各型態的數值範圍
        System.out.printf("%d ~ %d%n" , Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%d ~ %d%n" , Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%d ~ %d%n" , Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%d ~ %d%n" , Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%d ~ %d%n" , Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("%d ~ %d%n" , Double.MIN_EXPONENT, Double.MAX_EXPONENT);
        System.out.printf("%h ~ %h%n" , Character.MIN_VALUE, Character.MAX_VALUE);
        System.out.printf("%b ~ %b%n" , Boolean.TRUE, Boolean.FALSE);

        //可以在輸出浮點數時指定精度,下列為四捨五入到小數點第二位
        System.out.printf("example:%.2f%n" , 12.344);
        //也可以指定輸出時,至少要預留的字元寬度(由於預留了六個字元寬度,12.34只佔了五個字元,所以補了一個空白在前端)
        System.out.printf("example:%6.2f%n" , 12.344);

        //用Unicode字元點碼(Code point)來輸出"Hello"這個單字
        System.out.println("\u0048\u0065\u006c\u006c\u006f");

        //比較運算練習(其實是練習格式控制符號...)
        System.out.printf("10 > 5 結果 %b%n" , 10 > 5);
        System.out.printf("10 >= 5 結果 %b%n" , 10 >= 5);
        System.out.printf("10 < 5 結果 %b%n" , 10 < 5);
        System.out.printf("10 <= 5 結果 %b%n" , 10 <= 5);
        System.out.printf("10 == 5 結果 %b%n" , 10 ==5);
        System.out.printf("10 != 5 結果 %b%n" , 10 != 5);

        //位元運算練習 AND
        System.out.printf("0 AND 0 %5d%n" , 0 & 0);
        System.out.printf("0 AND 1 %5d%n" , 0 & 1);
        System.out.printf("1 AND 0 %5d%n" , 1 & 0);
        System.out.printf("1 AND 1 %5d%n" , 1 & 1);
        //OR
        System.out.printf("0 OR 0 %6d%n" , 0 | 0);
        System.out.printf("0 OR 1 %6d%n" , 0 | 1);
        System.out.printf("1 OR 0 %6d%n" , 1 | 0);
        System.out.printf("1 OR 1 %6d%n" , 1 | 1);
        //XOR
        System.out.printf("0 XOR 0 %5d%n" , 0 ^ 0);
        System.out.printf("0 XOR 1 %5d%n" , 0 ^ 1);
        System.out.printf("1 XOR 0 %5d%n" , 1 ^ 0);
        System.out.printf("1 XOR 1 %5d%n" , 1 ^ 1);

        //使用左移來作簡單的二次方運算
        int number = 1;
        System.out.printf("2 的 0 次方 %d%n" , number);  //00000001 -> 1
        System.out.printf("2 的 1 次方 %d%n" , number << 1);  //00000010 -> 2
        System.out.printf("2 的 2 次方 %d%n" , number << 2);  //00000100 -> 4
        System.out.printf("2 的 3 次方 %d%n" , number << 3);  //00001000 -> 8

        //不要對浮點數作相等性運算
        float A = 1.0f;
        float B = 0.8f;
        float C = A - B;
        System.out.println(C); //C = 0.19999999

        //if else
        int input = 10;
        int remain = input % 2;
        if(remain == 1) { //餘數為1
            System.out.printf("%d 為奇數%n" , input);
        } else {
            System.out.printf("%d 為偶數%n" , input);
        }

        //if else if
        int scoreA = 87;
        char level1;
        if(scoreA >= 90) {
            level1 = 'A';
        } else if(scoreA >= 80 && scoreA < 90) {
            level1 = 'B';
        } else if(scoreA >= 70 && scoreA < 80) {
            level1 = 'C';
        } else if(scoreA >= 60 && scoreA < 70) {
            level1 = 'D';
        } else {
            level1 = 'E';
        }
        System.out.printf("得分等級 : %c%n" , level1);

        //switch
        int scoreB = 100;
        int quotient = scoreB/10;
        char level2;
        switch (quotient) {
            case 10:  //case 10中沒有任何的陳述,也沒有使用break,所以會往下繼續執行,直到遇到break離開switch為止
            case 9:
                level2 = 'A';
                break;
            case 8:
                level2 = 'B';
                break;
            case 7:
                level2 = 'C';
                break;
            case 6:
                level2 = 'D';
                break;
            default:
                level2 = 'E';
        }
        System.out.printf("得分等級 : %c%n" , level2);

        //for loop (NineNineTable)
        for(int j = 1; j < 10; j++) {
            for(int i = 1; i < 10; i++) {
                System.out.printf("%d * %d = %2d  " , i, j, i *j);
            }
            System.out.println();
        }

        //while loop (RandomStop) 又稱前測試迴圈
        while (true) {
            int randomNumber1 = (int) (Math.random() * 10);  //隨機產生0~9的數
            System.out.println(randomNumber1);
            if(randomNumber1 == 5) {
                System.out.println("Oh!!! I hit 5...");
                break;
            }
        }

        //do while (RandomStop2) 又稱後測試迴圈
        int randomNumber2;
        do {
            randomNumber2 = (int) (Math.random() *10);  //先隨機產生0~9的數
            System.out.println(randomNumber2);
        } while(randomNumber2 != 5);  //在判斷要不要重複執行,如果不等於5就會繼續跑
        System.out.println("Oh!!! I hit 5...Orz");

        //break、continue
        for(int i =1; i < 10; i++) {
            if(i == 5) {  //到五直接離開迴圈
                break;
            }
            System.out.printf("i = %d%n" , i);
        }

        for(int i = 1; i < 10; i++) {
            if(i == 5) {  //到五則是略過五再繼續跑回圈
                continue;
            }
            System.out.printf("i = %d%n" , i);
        }

        //break與continue還可以配合標籤使用
        back : {
            for(int i = 0; i < 10; i++) {
                if(i == 9) {
                    System.out.println("break");
                    break back;
                }
            }
            //當break back;時,則會返回至back標籤處,之後整個back區塊不會執行而是跳過,所以下面這行會被跳過
            System.out.println("test");
        }

        //continue配合標籤可以自由地跳至任何一層for迴圈,只不過標籤只能設在for之前
        back1 :
        for(int i = 0; i < 10; i++) {
            back2 :
            for(int j = 0; j < 10; j++) {
                if(j == 9) {
                    //設定back1的時後,test不會被執行,但設定為back2的時候,test會執行10次
                    continue back2;
                }
            }
            System.out.println("test");
        }
    }
}
