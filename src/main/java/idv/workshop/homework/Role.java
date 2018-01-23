package idv.workshop.homework;

public class Role {
    protected String name;
    protected int level;
    protected int blood;

    public Role(){
    }

    public Role(String name, int level, int blood) {
        this.name = name;
        this.level = level;
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public  void setBlood(int blood) {
        this.blood = blood;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void fight() {

    }
    //抽象方法(Abstract method) 不用撰寫{}區塊,直接;結束即可
    //子類別要重新定義(Override)fight()的實作
    //原本寫好的測試會被亮紅燈,就先不寫 囧

    public String toString() {
        return String.format("(%s, %d, %d)", this.name, this.level, this.blood);
    }
}