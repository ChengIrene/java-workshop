package idv.workshop.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OcpNation {
    public enum Land {
        ASIA, EUROPE
    }
    String name;
    Land land;
    public OcpNation(String na, Land land) {
        this.name = na;
        this.land = land;
    }

    public String getName() {
        return name;
    }

    public Land getLand() {
        return land;
    }

    public static void main(String[] args) {
        List<OcpNation> list = Arrays.asList(
                new OcpNation("Japan", OcpNation.Land.ASIA),
                new OcpNation("Italy", OcpNation.Land.EUROPE),
                new OcpNation("French", OcpNation.Land.EUROPE));


        Map<OcpNation.Land, List<String>> lands =
                list.stream().collect(
                Collectors.groupingBy(OcpNation::getLand,Collectors.mapping(OcpNation::getName, Collectors.toList())));

        System.out.println(lands);
    }
}
