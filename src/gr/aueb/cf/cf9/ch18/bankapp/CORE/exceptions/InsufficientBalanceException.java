package gr.aueb.cf.cf9.ch18.bankapp.CORE.exceptions;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
