package idv.workshop.homework;

public class Client {
    public final String name;
    public final String ip;

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
