package arraystackadt;

public class StackUnderflowException extends StackException {

    public StackUnderflowException() {
        super("Error in stack: stack underflow.");
    }

    public StackUnderflowException(String stackUnderflow) {
        super(stackUnderflow);
    }
}

