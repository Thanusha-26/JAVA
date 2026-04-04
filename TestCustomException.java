// Step 1: Create user-defined exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Main class
public class TestCustomException {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Step 3: Throw custom exception
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // change value to test
        } catch (InvalidAgeException e) {
            // Step 4: Handle exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}