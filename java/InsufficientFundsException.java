public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String deficit) {
        super("need :"+deficit);
    }
}