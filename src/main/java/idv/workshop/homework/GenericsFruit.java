package idv.workshop.homework;

public class GenericsFruit {
    int price;
    int weight;
    GenericsFruit() {}
    GenericsFruit(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }
}

class GenericsApple extends GenericsFruit {
    GenericsApple() {}
    GenericsApple(int price, int weight) {
        super(price, weight);
    }

    @Override
    public String toString() {
        return "Apple";
    }
}

class GenericsBanana extends GenericsFruit {
    GenericsBanana() {}
    GenericsBanana(int price, int weight){
        super(price, weight);
    }

    @Override
    public String toString() {
        return "Banana";
    }
}