package idv.workshop.homework;



public class AutoClosableDemo {
    public static void main(String[] args) {
        try(Resource res = new Resource()){
            res.doSome();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Resource implements AutoCloseable {
    void doSome() {
        System.out.println("Do something.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource be closed.");
    }
}
