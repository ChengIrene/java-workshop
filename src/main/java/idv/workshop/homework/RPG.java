package idv.workshop.homework;

public class RPG {
    public static void main(String[] args) {
        demoSwordsMan();
        demoMagician();
    }

    static void demoSwordsMan() {
        SwordsMan kirito = new SwordsMan();
        kirito.setName("Kirito");
        kirito.setLevel(99);
        kirito.setBlood(9999);

        System.out.printf("劍士: (%s, %d, %d) %n", kirito.getName(), kirito.getLevel(), kirito.getBlood());
    }

    static void demoMagician() {
        Magician asuna = new Magician();
        asuna.setName("Asuna");
        asuna.setLevel(70);
        asuna.setBlood(7000);

        System.out.printf("魔法師: (%s, %d, %d) %n", asuna.getName(), asuna.getLevel(), asuna.getBlood());
    }
}
