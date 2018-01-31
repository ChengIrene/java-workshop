package idv.workshop.homework;

public class Submarine extends Boat implements Diver {

    private String name;

    public Submarine(String name) {
        super(name);
    }

    @Override
    public void dive() {
        System.out.printf("潛水艇 %s 潛行%n", super.name);
    }
}
