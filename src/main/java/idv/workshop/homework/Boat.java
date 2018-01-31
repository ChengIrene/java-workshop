package idv.workshop.homework;

public class Boat implements Swimmer{

    protected String name;

    public Boat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.printf("船 %s 在水面航行%n", name);
    }
}
