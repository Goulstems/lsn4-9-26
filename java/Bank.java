import java.util.HashMap;

public class Bank {
    HashMap<Person, Account> clientData = new HashMap<>();

    public Account newClient(Person p) {
        Account acc = new Account(p);
        clientData.put(p, acc);
        return acc;
    }

    public void removeClient(Person p) {
        clientData.remove(p);
    }

    public Account getClientAccount(Person p) {
        try {
            Account acc = clientData.get(p);
            if (acc == null) throw new Exception("Person not enrolled!");
            return acc;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
