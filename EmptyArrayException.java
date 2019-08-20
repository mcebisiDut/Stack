@SuppressWarnings("serial")
public class EmptyArrayException extends Exception{
    static String message = "The array contains no elements!!";
    
    public EmptyArrayException() {
        super(message);
    }
}