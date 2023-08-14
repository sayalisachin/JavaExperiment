package java_prog_daily;
import java.util.Scanner;

public class Solution {
    public static int dataTypes(String type) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a data type (int, long, float, double, char, byte, short, boolean): ");
            String dataType = scanner.next();
            
            int size = 0;
            
            switch(dataType) {
                 case "int":
                    size = Integer.SIZE / 8;
                    break;
                case "long":
                    size = Long.SIZE / 8;
                    break;
                case "float":
                    size = Float.SIZE / 8;
                    break;
                case "double":
                    size = Double.SIZE / 8;
                    break;
                case "char":
                    size = Character.SIZE / 8;
                    break;
                case "byte":
                    size = Byte.SIZE / 8;
                    break;
                case "short":
                    size = Short.SIZE / 8;
                    break;
                case "boolean":
                    size = 1;  // Booleans are typically 1 byte in Java
                    break;
                default:
                    System.out.println("Invalid data type.");
                    System.exit(1);
            }
            System.out.println("Size of " + dataType + " variable: " + size + " bytes");
            return size;
        }
    }
    
}

