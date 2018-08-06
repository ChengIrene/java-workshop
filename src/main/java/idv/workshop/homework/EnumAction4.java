package idv.workshop.homework;

public enum EnumAction4 implements EnumCommand {  //編譯器會將此標示為抽象類別

    STOP {
        public void execute() {
            System.out.println("停止播放動畫");
        }
    },

    RIGHT {
        public void execute() {
            System.out.println("播放右轉動畫");
        }
    },

    LEFT {
        public void execute() {
            System.out.println("播放左轉動畫");
        }
    },

    UP {
        public void execute() {
            System.out.println("播放向上動畫");
        }
    },

    DOWN {
        public void execute() {
            System.out.println("播放向下動畫");
        }
    }
}
