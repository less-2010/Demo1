package day17.se02.Demo01Exception;

public class BalanceNoEnoughException extends  RuntimeException {
    public BalanceNoEnoughException() {
        super();
    }

    public BalanceNoEnoughException(String message) {
        super(message);
    }
}
