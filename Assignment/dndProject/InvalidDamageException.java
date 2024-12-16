public class InvalidDamageException extends Exception {
    public InvalidDamageException() {
        super("Error: Your weapon damage is below zero, set it higher");
    }
}
