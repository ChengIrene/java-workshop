package idv.workshop.homework;

public class ClientEvent {

    private Client client;

    public ClientEvent(Client client) {
        this.client = client;
    }

    public String getName() {
        return client.getName();
    }

    public String getIp() {
        return client.getIp();
    }
}
