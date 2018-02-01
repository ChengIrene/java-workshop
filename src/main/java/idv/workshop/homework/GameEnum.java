package idv.workshop.homework;

public class GameEnum {
    public static void main(String[] args) {
        play(ActionEnum.RIGHT);  //只能傳入ActionEnum實例
        play(ActionEnum.UP);
    }

    public static void play(ActionEnum actionEnum) {  //宣告為ActionEnum型態
        switch (actionEnum) {
            case STOP:  //列舉實例
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
