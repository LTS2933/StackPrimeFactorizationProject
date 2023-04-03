package arraystackadt;
/**
* This interface implements the abstract methods that will be overridden and implemented by ArrayDataStrucClass.
* The methods are part of Java's API for stacks, since the idea of this project is to obtain the prime
* factorization of different integers.
* @author Liam Smith
*/

public interface ArrayStackADT<T> {

    void initializeStack();

    void pop() throws StackUnderflowException;

    T peek() throws StackUnderflowException;
    
    void push(T obj) throws StackOverflowException;
    
    boolean isEmptyStack();

    boolean isFullStack();
    
    String toString();

}
