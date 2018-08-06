package idv.workshop.homework;

public class EnumGameDemo {
    public static void main(String[] args) {
        Game.play(EnumAction2.DOWN.ordinal());
        Game.play(EnumAction2.RIGHT.ordinal());
    }
}
