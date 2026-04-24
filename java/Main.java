
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Person p1 = new Person(1, "Alice");
        Person p2 = new Person(2, "Bob");
        Person p3 = new Person(3, "Charlie");

        bank.newClient(p1);
        bank.newClient(p2);
        bank.getClientAccount(p3);

        Account acc2 = bank.getClientAccount(p1);
        System.out.println(p1.name + "'s balance: " + acc2.getBalance());
        try {
            acc2.withdraw(new BigDecimal(1000));
        } catch (InsufficientFundsException e) {
            System.err.println(e);
        }
        uWonTheLottery(bank, p1);
    }

    public static void uWonTheLottery(Bank bank, Person p) {
        Account acc = bank.getClientAccount(p);
        if (acc != null) {
            acc.deposit(new BigDecimal("1000000"));
            System.out.println(p.name + " won the lottery! New balance: " + acc.getBalance());
        }
    }
}
