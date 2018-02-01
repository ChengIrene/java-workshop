package idv.workshop.homework;

import org.junit.Test;

public class GameEnumTest {

    @Test
    public void testCreate() {

        GameEnum.play(ActionEnum.STOP);
        GameEnum.play(ActionEnum.RIGHT);
        GameEnum.play(ActionEnum.LEFT);
        GameEnum.play(ActionEnum.UP);
        GameEnum.play(ActionEnum.DOWN);
    }
}
