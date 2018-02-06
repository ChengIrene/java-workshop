package idv.workshop.homework;

public class MultiChat {
    public static void main(String[] args) {

        /*
        * In this scenario, there are three people:
        * 1. The listener who registered to the client queue first.
        * 2. c1, who registered to the client queue at second sequence.
        * 3. c2, who registered to the client queue at third sequence.
        * */

        Client c1 = new Client("127.0.0.0", "Tsuna");
        Client c2 = new Client("159.1.1.1", "Gokudera");

        ClientQueue queue = new ClientQueue();
        //使用匿名內部類別,直接建立實作ClientListener
        queue.addClientListener(new ClientListener() {  //匿名內部類別 new 父類別()||介面() { //類別本體實作 };
            @Override
            public void clientAdded(ClientEvent event) {
                System.out.printf("%s 從 %s 連線%n", event.getName(), event.getIp());
            }

            @Override
            public void clientRemoved(ClientEvent event) {
                System.out.printf("%s 從 %s 離線%n", event.getName(), event.getIp());
            }
        });

        registerListener(queue);

        ClientListener anotherListener = new ClientListenerImpl();
        queue.addClientListener(anotherListener);

        queue.add(c1);
        queue.add(c2);

        queue.remove(c1);
        queue.remove(c2);
    }

    private static void registerListener(ClientQueue queue) {
        queue.addClientListener(new ClientListener() {  //匿名內部類別 new 父類別()||介面() { //類別本體實作 };
            @Override
            public void clientAdded(ClientEvent event) {
                System.out.printf("%s 從 %s 連線%n", event.getName(), event.getIp());
            }

            @Override
            public void clientRemoved(ClientEvent event) {
                System.out.printf("%s 從 %s 離線%n", event.getName(), event.getIp());
            }
        });

    }
}
