package SRP.Corrected;

public class Person {

    private String name;
    private Address address;
    private double balance;


    public Person(String name, Address address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public Person(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
