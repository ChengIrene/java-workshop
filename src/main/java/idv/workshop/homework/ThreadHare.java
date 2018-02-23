package idv.workshop.homework;

public class ThreadHare implements Runnable {
    private boolean[] flags = {true, false};
    private int totalStep;
    private int hareStep;

    public ThreadHare(int totalStep) {
        this.totalStep = totalStep;
    }

    @Override
    public void run() {
        while (hareStep < totalStep) {
            boolean isHareSleep = flags[((int) (Math.random() * 10)) % 2 ];
            if(isHareSleep) {
                System.out.println("兔子睡著了Zzzz");
            } else {
                hareStep += 2;
                System.out.printf("兔子跑了 %d 步!!! %n", hareStep );
            }
        }
    }
}
