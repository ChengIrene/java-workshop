package idv.workshop.homework;

public class Ocean {
    public static void main(String[] args) {
        //doSwim(new Anemonefish("尼莫"));  //這兩個沒寫class 先註解起來
        //doSwim(new Shark("蘭尼"));
        doSwim(new SwimPlayer("賈斯汀"));  //Human class
        doSwim(new Submarine("黃色一號")); //Submarine class
        doSwim(new SeaPlane("空軍零號")); //SeaPlane class
        doSwim(new FlyingFish("甚平")); //FlyingFish class
    }

    static void doSwim(Swimmer swimmer) {
        swimmer.swim();
    }
}
