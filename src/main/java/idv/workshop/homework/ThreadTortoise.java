package idv.workshop.homework;

public class ThreadTortoise implements Runnable {
    private int totalStep;
    private int tortoiseStep;

    public ThreadTortoise(int totalStep) {
        this.totalStep = totalStep;
    }

    @Override
    public void run() {
        while (tortoiseStep < totalStep) {
            tortoiseStep++;
            System.out.printf("烏龜跑了 %d 步!!! %n", tortoiseStep);
        }
    }
}
