package idv.workshop.homework;

public class AutoClosableDemo2 {
    public static void main(String[] args) {

        //在try括號中,越後面撰寫的物件資源會越早被關閉,所以other會先被關閉
        try(ResourceSome some = new ResourceSome(); ResourceOther other = new ResourceOther()) {
            some.doSome();
            other.doOther();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class ResourceSome implements AutoCloseable {
    void doSome() {
        System.out.println("Do something.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource Some be closed.");
    }
}

class ResourceOther implements AutoCloseable {
    void doOther() {
        System.out.println("Do other thing.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource Other be closed.");
    }
}