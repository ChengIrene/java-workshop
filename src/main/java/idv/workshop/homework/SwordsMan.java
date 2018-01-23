package idv.workshop.homework;

public class SwordsMan extends Role {

    public String toString() {
        return String.format("劍士 " + super.toString());
    }

    @Override  //檢查是否有重新定義
    public void fight() {  //繼承自父類別後重新定義
        System.out.println("揮劍攻擊");
    }
}
