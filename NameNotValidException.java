public class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
        System.out.println(message);
    }
    
}
