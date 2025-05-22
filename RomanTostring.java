public class RomanTostring {
    public static void main(String[] args) {
        
        // Array of values corresponding to Roman numeral symbols
        int[] numbers = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };
        
        // Array of Roman numeral symbols
        String[] symbols = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        
        String result = ""; // Initialize result as an empty string
        
        int num = 4995; // The number to convert to Roman numeral
        for (int i = 0; i < numbers.length && num > 0; i++) {
            while (num >= numbers[i]) {
                num -= numbers[i]; // Subtract the value from num
                result += symbols[i]; // Append the corresponding symbol
            }
        }
        
        System.out.println(result); // Output the result
    }
}
