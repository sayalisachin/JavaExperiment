package testing.lab10;

class InputException extends Exception {
    public InputException(String message) {
        super(message);
    }
}

public class SumWithInputValidation {
    public static void main(String[] args) {
        int sum = 0;
        try {
            while (true) {
                int num = getInput();
                if (num == -1) {
                    break;
                }
                sum += num;
            }
            System.out.println("Sum of the entered numbers: " + sum);
        } catch (InputException e) {
            System.out.println("InputException: " + e.getMessage());
        }
    }

    public static int getInput() throws InputException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number (-1 to stop): ");
        String input = scanner.nextLine();
        scanner.close();

        if (input.equals("-1")) {
            return -1;
        }

        try {
            int num = Integer.parseInt(input);
            return num;
        } catch (NumberFormatException e) {
            throw new InputException("Invalid input. Please enter a valid integer.");
        }
    }
}

