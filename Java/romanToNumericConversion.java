import java.util.Scanner;

public class romanToNumericConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        
        int intValue = romanToInt(romanNumeral);
        System.out.println("Integer equivalent: " + intValue);
    }
    
    public static int romanToInt(String roman) {
        char[] romanNumerals = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        
        int intValue = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            int currentIndex = -1;
            for (int j = 0; j < romanNumerals.length; j++) {
                if (romanNumerals[j] == currentChar) {
                    currentIndex = j;
                    break;
                }
            }
            if (currentIndex != -1) {
                int currentValue = values[currentIndex];
                if (currentValue < prevValue) {
                    intValue -= currentValue;
                } else {
                    intValue += currentValue;
                }
                prevValue = currentValue;
            } else {
                System.out.println("Invalid Roman numeral");
                return -1;
            }
        }

        return intValue;
    }
}
