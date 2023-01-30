package SRP.Corrected;

public class Bank {

    public static boolean canPay(Person person, double price) {
        return ((person.getBalance() - price) >= 0);
    }
}
