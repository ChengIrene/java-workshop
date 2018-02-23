package idv.workshop.homework;

public class TortoiseHareRace2 {
    public static void main(String[] args) {
        ThreadTortoise threadTortoise = new ThreadTortoise(10);
        ThreadHare threadHare = new ThreadHare(10);
        Thread tortoiseThread = new Thread(threadTortoise);
        Thread hareThread = new Thread(threadHare);
        tortoiseThread.start();
        hareThread.start();
    }
}
