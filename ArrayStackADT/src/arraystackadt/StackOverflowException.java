package arraystackadt;

public class StackOverflowException extends StackException {

    public StackOverflowException() {
        super("Error in stack: stack is overflowed");
    }

    public StackOverflowException(String stackOverflow) {
        super(stackOverflow);
    }
}
