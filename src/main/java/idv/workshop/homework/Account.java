package idv.workshop.homework;

public class Account implements Comparable<Account> {
    private String name;
    private String number;
    private int balance;

    Account(String name, String number, int balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Account (%s, %s, %d)", name, number, balance);
    }

    @Override
    public int compareTo(Account other) {
        return this.balance - other.balance;
    }
}
