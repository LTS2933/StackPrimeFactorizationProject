package arraystackadt;
/**
 * This class is written to contain methods that will be used
 * to manipulate integers in a Demo class. This class should implement the
 * methods of a stack interface, and therefore implement the methods associated
 * with a stack according to Java API.
 * @author Liam Smith
 */

public class ArrayStackDataStrucClass<T> implements ArrayStackADT<T> {

    private T[] objArray; //A generic array of objects, easy to add any type to this array
    private int stackMaxSize; //The int we will use to denote the largest index of our objArray
    private int stackTop; //The int that stores the index of the top of the stack
   
    /**
    * Default constructor, initializes a generic array whose capacity is 100.
     */
    public ArrayStackDataStrucClass() {
        stackMaxSize = 100; 
        stackTop = 0;
        objArray = (T[]) new Object[stackMaxSize];
    }

    /**
    * Overloaded constructor, initializes a generic array whose capacity is 100 if the user passes in a size that is less than 0.
    * Otherwise, it sets the capacity to the integer the user specifies, and sets stackTop to 0.
    * @param stackSize the desired capacity of the stack.
     */
    public ArrayStackDataStrucClass(int stackSize) {
        if (stackSize <= 0) {
            System.err.println("The size of the array to implement must bde positive.");
            System.err.println("Creating an array of the size 100.");
            stackMaxSize = 100;
        } else {
            stackMaxSize = stackSize;
        }
        stackTop = 0;

        objArray = (T[]) new Object[stackMaxSize];
    }
    
    /**
    * Sets all the elements of the stack to null and stackTop to 0, effectively resetting or initializing the stack.
     */
    @Override
    public void initializeStack() {
        for (int i = 0; i < stackTop; i++) {
            objArray[i] = null;
        }
        stackTop = 0;
    }
    
    /**
    * Method to check whether or not the stack is currently empty.
    * @return true if the stack is empty, false otherwise.
     */
    @Override
    public boolean isEmptyStack() {
        if (stackTop == 0)
            return true;
        else
            return false;
    }

    /**
    * Method to check whether or not the stack is currently full.
    * @return true if the stack is full, false otherwise.
     */
    @Override
    public boolean isFullStack() {
        return (stackTop == stackMaxSize);
    }
    /**
    * Method to convert the stack to a String.
    * @return the elements of the stack as String types, separated by an asterisk to represent their factorizations.
     */
    @Override
    public String toString() {
        String str = "";
        while (!isEmptyStack()) {
            str += peek();
            pop();
            if (!isEmptyStack()){
            str += " * ";
        }
        }
        return str;
    }
    /**
    * Method to remove the element at the top of the stack off the stack and update the index of the top of the stack.
    * @throws StackUnderflowException if the stack is at minimum capacity already (empty).
     */
@Override
    public void pop() throws StackUnderflowException {
        if (isEmptyStack()) {
            throw new StackUnderflowException();
        }
        stackTop-=1;
        objArray[stackTop] = null;
    }
    /**
    * Method to add an element to the top of the stack and update the index of the top of the stack
    * to become the index of the element just pushed.
    * @throws StackOverflowException if the stack is at maximum capacity.
     */
    @Override
    public void push(T obj) throws StackOverflowException {
        if (isFullStack()) {
            throw new StackOverflowException();
        }
        objArray[stackTop] = obj;
        stackTop++;
    }
    /**
    * Method to retrieve the element at the top of the stack and update the index of the top of the stack without removing it.
    * @throws StackUnderflowException if the stack is at minimum capacity already (empty).
    * @return the object at the top of the stack.
     */
    @Override
    public T peek() throws StackUnderflowException {
        if (isEmptyStack()) {
            throw new StackUnderflowException();
        }
        return (T) objArray[stackTop - 1];
    } 
}


