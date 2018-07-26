package idv.workshop.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OcpStudent {
    String major, name, home;
    public OcpStudent(String name, String course, String city) {
        this.major = course;
        this.name = name;
        this.home = city;
    }

    public String getMajor() {
        return major;
    }

    public String toString() {
        return major + ":" + name+ ":" + home;
    }

    public static void main(String[] args) {
        List<OcpStudent> students = Arrays.asList(
                new OcpStudent ("Subaru", "Java ME", "Tokyo"),
                new OcpStudent ("Hokuto", "Java SE", "Tokyo"),
                new OcpStudent ("Seisirou", "Java ME", "Japan")
        );

        students.stream().collect(Collectors.groupingBy(OcpStudent::getMajor)).forEach((key, val) -> System.out.println(key + "\n" +val));

        //印出結果為
        //Java ME
        //[Java ME:Subaru:Tokyo, Java ME:Seisirou:Japan]
        //Java SE
        //[Java SE:Hokuto:Tokyo]
    }
}
