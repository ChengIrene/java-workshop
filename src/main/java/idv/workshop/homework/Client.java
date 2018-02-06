package idv.workshop.homework;

public class Client {
    private final String name;
    private final String ip;

    public Client(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public String getName() {
        return name;
    }
}
