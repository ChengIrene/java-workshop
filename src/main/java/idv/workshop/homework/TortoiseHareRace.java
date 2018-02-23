package idv.workshop.homework;

public class TortoiseHareRace {
    public static void main(String[] args) {
        boolean[] flags =  {true, false};
        int totalStep = 10;
        int tortoiseStep = 0;
        int hareStep = 0;
        System.out.println("龜兔賽跑開始!!!");
        while(tortoiseStep < totalStep && hareStep < totalStep) {
            tortoiseStep++;  //烏龜走一步
            System.out.printf("烏龜跑了 %d 步!!! %n", tortoiseStep);
            boolean isHareSleep = flags[((int) (Math.random() * 10)) % 2];  //偶數整除的話會傳回true然後睡覺,奇數餘一會前進兩步
            if(isHareSleep) {
                System.out.println("兔子睡著了Zzzz");
            } else {
                hareStep += 2;  //兔子走兩步
                System.out.printf("兔子跑了 %d 步!!! %n", hareStep);
            }
        }
    }
}
