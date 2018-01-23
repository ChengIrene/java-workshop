package idv.workshop.homework;

public class Magician extends Role {

    public String toString() {
        return String.format("魔法師 " + super.toString());
    }

    @Override //檢查是否有重新定義
    public void fight() {  //繼承自父類別後重新定義
        System.out.println("魔法攻擊");
    }

    public void cure() {
        System.out.println("魔法治療");
    }
}
