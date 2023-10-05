import java.util.Scanner;

public class ExtractPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a telephone number as a string
        System.out.print("Enter a telephone number in the format (555) 555-5555: ");
        String phoneNumber = scanner.nextLine();

        // Extract the area code, first three digits, and last four digits
        String areaCode = phoneNumber.substring(1, 4); // Extract characters from index 1 to 3
        String firstThreeDigits = phoneNumber.substring(6, 9); // Extract characters from index 6 to 8
        String lastFourDigits = phoneNumber.substring(10); // Extract characters from index 10 to the end

        // Display the extracted area code and seven-digit phone number
        System.out.println("Area Code: " + areaCode);
        System.out.println("Seven-Digit Phone Number: " + firstThreeDigits + lastFourDigits);

        // Close the scanner
        scanner.close();
    }
}

