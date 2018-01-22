package idv.workshop.homework;

public class Role {
    private String name;
    private int level;
    private int blood;

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
}