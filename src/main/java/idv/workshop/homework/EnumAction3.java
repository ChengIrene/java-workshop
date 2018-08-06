package idv.workshop.homework;

public enum EnumAction3 implements EnumCommand {
    STOP, RIGHT, LEFT, UP, DOWN;

    public void execute() {
        switch (this) {
            case STOP:
                System.out.println("播放停止動畫");
                break;

            case RIGHT:
                System.out.println("播放向右動畫");
                break;

            case LEFT:
                System.out.println("播放向左動畫");
                break;

            case UP:
                System.out.println("播放向上動畫");
                break;

            case DOWN:
                System.out.println("播放向下動畫");
                break;
        }
    }
}
