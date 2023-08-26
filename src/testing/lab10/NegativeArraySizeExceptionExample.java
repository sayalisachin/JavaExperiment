package testing.lab10;

public class NegativeArraySizeExceptionExample {
    public static void main(String[] args) {
        try {
            int negativeSize = -5;
            int[] array = new int[negativeSize]; // This will throw NegativeArraySizeException
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }
    }
}
