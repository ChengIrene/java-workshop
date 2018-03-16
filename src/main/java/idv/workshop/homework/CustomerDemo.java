package idv.workshop.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.out;
import static java.util.Comparator.comparing;

public class CustomerDemo {
    public static void main(String[] args) {
        List<Customers> customers = Arrays.asList(
                new Customers("Kiyomitsu", "Kasyuu", 708),
                new Customers("Yasusada", "Yamatonokami", 708),
                new Customers("Souji", "Okita", 708)
        );

        Comparator<Customers> byLastName = comparing(Customers::getLastName);

        customers.sort(
                byLastName
                .thenComparing(Customers::getFirstName)
                .thenComparing(Customers::getZipCode)
        );

        customers.forEach(out::println);
    }
}
class Customers {
    private String firstName;
    private String lastName;
    private Integer zipCode;

    public Customers(String firstName, String lastName, Integer zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public String toString() {
        return String.format("Customer(%s %s, %d)", firstName, lastName, zipCode);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getZipCode() {
        return zipCode;
    }
}