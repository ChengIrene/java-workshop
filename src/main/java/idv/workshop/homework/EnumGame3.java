package idv.workshop.homework;

public class EnumGame3 {
    public static void play(EnumAction3 action) {
        action.execute();
    }

    public static void main(String[] args) {
        EnumGame3.play(EnumAction3.RIGHT);
        EnumGame3.play(EnumAction3.DOWN);
    }
}
