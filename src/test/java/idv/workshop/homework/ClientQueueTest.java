package idv.workshop.homework;

import org.junit.Test;

public class ClientQueueTest {

    @Test
    public void testCreate() {
        final String nameOfMidare = "Midare";
        final String ipOfMidare = "123520";

        Client midare = new Client(nameOfMidare, ipOfMidare);

        final String nameOfYagen = "Yagen";
        final String ipOfYagen = "12520";

        Client yagen = new Client(nameOfYagen, ipOfYagen);

        ClientQueue test = new ClientQueue();

        test.addClientListener(new ClientListener()  {  //匿名內部類別
            @Override
            public void clientAdded(ClientEvent event) {
                System.out.printf("Added %s %s%n", event.getName(), event.getIp());
            }

            @Override
            public void clientRemoved(ClientEvent event) {
                System.out.printf("Removed %s %s%n", event.getName(), event.getIp());
            }
        });

        test.add(midare);
        test.add(yagen);

        test.remove(midare);
        test.remove(yagen);
    }
}
