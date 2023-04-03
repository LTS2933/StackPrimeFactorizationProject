package arraystackadt;
/**
 * This class serves to exercise the code written in ArrayStackDataStrucClass.
 * We test the code with 4 numbers and try to find their prime factorizations:
 * 3,960, 1,234, 222,222, and 13,780.
 * These 4 numbers are stored in the integer variable "element" while each number's
 * factors are stored in a stack of integers called "factors."
 * @author Liam Smith
 */

public class PrimeFactorizationDemoClass {

    public static void main(String[] args) {
        
        ArrayStackDataStrucClass<Integer> factors = new ArrayStackDataStrucClass<>(50);
        int element = 3960;
        for (int i = 2; element != 1; i++) {
            while (element % i == 0) {
                try {
                    factors.push(i);
                } catch (StackOverflowException exc) {
                    System.out.println("Stack overflow error");
                }
                element = element / i;
            }
        }
        System.out.print("Factorization of 3960: " + factors);
        System.out.println();
        element = 1234;
        factors.initializeStack();
        for (int i = 2; element != 1; i++) {
            while (element % i == 0) {
                try {
                    factors.push(i);
                } catch (StackOverflowException exc) {
                    System.out.println("Stack overflow error");
                }
                element = element / i;
            }
        }
        System.out.print("Factorization of 1234: " + factors);
        System.out.println();
        element = 222222;
        factors.initializeStack();
        for (int i = 2; element != 1; i++) {
            while (element % i == 0) {
                try {
                    factors.push(i);
                } catch (StackOverflowException exc) {
                    System.out.println("Stack overflow error");
                }
                element = element / i;
            }
        }
        System.out.print("Factorization of 222222: " + factors);
        System.out.println();
        element = 13780;
        factors.initializeStack();
        for (int i = 2; element != 1; i++) {
            while (element % i == 0) {
                try {
                    factors.push(i);
                } catch (StackOverflowException exc) {
                    System.out.println("Stack overflow error");
                }
                element = element / i;
            }
        }
        System.out.print("Factorization of 13780: " + factors);
        System.out.println();
    }
}
