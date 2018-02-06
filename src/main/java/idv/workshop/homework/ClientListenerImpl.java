package idv.workshop.homework;

public class ClientListenerImpl implements ClientListener {
    @Override
    public void clientAdded(ClientEvent event) {
        System.out.printf("%s 從 %s 連線%n", event.getName(), event.getIp());
    }

    @Override
    public void clientRemoved(ClientEvent event) {
        System.out.printf("%s 從 %s 離線%n", event.getName(), event.getIp());
    }
}
