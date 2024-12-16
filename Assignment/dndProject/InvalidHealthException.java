public class InvalidHealthException extends Exception {
    public InvalidHealthException() {
        super("Your health is zero, you are now dead.");
    }
}
