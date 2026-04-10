import java.math.BigDecimal;

public class Account {
    Person owner;
    BigDecimal balance;

    public Account(Person owner) {
        this.owner = owner;
        this.balance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
