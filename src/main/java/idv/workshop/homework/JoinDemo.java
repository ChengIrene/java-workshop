package idv.workshop.homework;

public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread 開始!!!");

        Thread threadB = new Thread(() -> {
            System.out.println("Thread B 開始!!!");
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread B 執行..." + i);
            }
            System.out.println("Thread B 將結束QQ");
        });

        threadB.start();
        threadB.join();  //Thread B 加入 Main thread 流程, 但若將此行註解掉,則是Main跑完後(連同下面的結束字串)才會跑thread

        System.out.println("Main thread 將結束QQ");
    }
}
