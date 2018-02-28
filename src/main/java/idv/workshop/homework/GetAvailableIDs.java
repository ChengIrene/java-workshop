package idv.workshop.homework;

import java.util.TimeZone;

public class GetAvailableIDs {
    public static void main(String[] args) {

        String[] availableID = TimeZone.getAvailableIDs();

        //available Ids
        for(int i = 0; i < availableID.length; i++) {
            System.out.println(availableID[i]);
        }
    }
}
