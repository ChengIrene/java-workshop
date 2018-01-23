package idv.workshop.homework;

public class RPG {
    public static void main(String[] args) {
        SwordsMan kirito = new SwordsMan();
        kirito.setName("Kirito");
        kirito.setLevel(99);
        kirito.setBlood(9999);

        Magician asuna = new Magician();
        asuna.setName("Asuna");
        asuna.setLevel(70);
        asuna.setBlood(7000);

        showBlood(kirito);
        showBlood(asuna);

        drawFight(kirito);
        drawFight(asuna);
    }

    static void showBlood(Role role) {
        System.out.printf("%s HP:%d%n", role.getName(), role.getBlood());
    }

    static void drawFight(Role role) {
        System.out.print(role.getName());
        role.fight();
    }
}
