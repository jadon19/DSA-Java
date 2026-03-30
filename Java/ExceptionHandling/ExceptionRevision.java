package ExceptionHandling;

// ExceptionRevision.java

// Custom User-Defined Exception (Checked Exception)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionRevision {

    // Method using 'throws' (propagates exception to caller)
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // 'throw' keyword used to explicitly throw exception
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {

        // 1. Basic try-catch
        try {
            int a = 10 / 0; // ArithmeticException (unchecked)
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 2. Multiple catch blocks
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index error: " + e);
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }

        // 3. finally block (always executes)
        try {
            int x = 5;
        } finally {
            System.out.println("Finally block executed");
        }

        // 4. throw + throws + custom exception
        try {
            checkAge(16); // calling method that throws exception
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }

        // 5. Manual throw (unchecked)
        try {
            throw new RuntimeException("Manual Runtime Exception");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }

        // 6. Nested try-catch
        try {
            try {
                int b = 20 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }
            int[] arr = new int[2];
            arr[3] = 10;
        } catch (Exception e) {
            System.out.println("Outer catch: " + e);
        }

        System.out.println("Program continues...");
    }
}
