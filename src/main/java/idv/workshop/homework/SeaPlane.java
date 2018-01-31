package idv.workshop.homework;

public class SeaPlane extends Airplane implements Swimmer {

    private String name;

    public SeaPlane(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("海上");
        super.fly();
    }

    @Override
    public void swim() {
        System.out.printf("飛機 %s 航行海面%n", super.name);
    }
}
