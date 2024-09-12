/**
* Week 2 Assignment Task 2: Advanced Java Programming Assignment
* Task 1: CountPalindromes
* Task 2: NthFibonacci
* Task 3: SnakeToCamel
* Task 4: CountConsonants
* Task 5: BinaryToDecimal
* 
* @author Tushar Pareek
* @since  03/09/2024
*/
import java.util.Scanner;
 public class Week2Assignment2 {
    static Week2Assignment2_Constants constant = new Week2Assignment2_Constants();
     public static  void main(String[] args) {
        while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.println(constant.task);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            Scanner scanner1 = new Scanner(System.in);
            System.out.println(constant.enterString);
            String input = scanner1.nextLine();
            int totalPalindrome = countAllPalindromes(input, 0);
            System.out.println("Number of unique palindromic combinations: " + totalPalindrome);
            //scanner1.close();
                break;
            case 2:
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter the Nth value for fibonacci series:");
            int number = scanner2.nextInt();
            int requiredElement = fibonacci(number);
            System.out.println("The required element of fibonacci series is ->" + requiredElement);
            //scanner2.close();
                break;
            case 3:
            Scanner scanner3 = new Scanner(System.in);
            System.out.println(constant.enterString);
            String inputstr = scanner3.nextLine();
            inputstr = inputstr.trim();
            String output = "";
            snakeToCamelConverter(inputstr, output , 0 );
                break;
            case 4:
            Scanner scanner4 = new Scanner(System.in);
            System.out.println(constant.enterString);
            String inputString = scanner4.nextLine();
            int consonantCount = consonantsCounter(inputString, 0);
            System.out.println("Number of consonants: " + consonantCount);
                break;
            case 5:
            Scanner scanner5 = new Scanner(System.in);
            System.out.println(constant.input5);
            String binaryString = scanner5.nextLine();
            int decimalValue = binaryToDecimal(binaryString);
            System.out.println("Binary: " + binaryString + " -> Decimal: " + decimalValue);
           // scanner5.close();
                break;       
        }
        System.out.println("do you want to run the program again? y/n");
        char yesorno = scanner.next().charAt(0);
        scanner.close();
        if( yesorno == 'y' || yesorno == 'Y'){
            continue;
        }
        else{
            break;
        }
    }
    }
    // Task 1 : Count Palindrome
    public static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindrome(s, start + 1, end - 1);
    }
    public static int countPalindromesFromIndex(String s, int start, int end) {
        if (end == s.length()) {
            return 0;
        }
        if (isPalindrome(s, start, end)) {
            
            return 1 + countPalindromesFromIndex(s, start, end + 1);
        } else {
           
            return countPalindromesFromIndex(s, start, end + 1);
        }
    }
    public static int countAllPalindromes(String s, int start) {
        if (start == s.length()) {
            return 0;
        }
        return countPalindromesFromIndex(s, start, start) + countAllPalindromes(s, start + 1);
    }

    // Task 2 : Find Nth Fibonacci Series
    public static int fibonacci(int n) {
        
        if (n <= 0) {
            throw new IllegalArgumentException("Input should be a positive integer.");
        }
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // Task 3 : snake_case to camelCase Converter
    public static void snakeToCamelConverter(String s, String output, int indexOfChar) {
        if (indexOfChar == s.length()) {
            System.out.println(output); 
            return;
        }
        if (s.charAt(indexOfChar) != '_' && s.charAt(indexOfChar) != ' ') {
            output = output + Character.toLowerCase(s.charAt(indexOfChar));
        } else {
            if (indexOfChar + 1 < s.length() && s.charAt(indexOfChar + 1) != '_' && s.charAt(indexOfChar + 1) != ' ') {
                output = output + Character.toUpperCase(s.charAt(indexOfChar + 1));
                indexOfChar++; 
            }
        }
        snakeToCamelConverter(s, output, indexOfChar + 1);
    }
    
    // Task 4 : Count Consonants in a String 
    private static boolean isConsonant(char c){
        c = Character.toLowerCase(c);
        return Character.isLetter(c) && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }
     public static int consonantsCounter( String s , int index){
        if(index >= s.length()){
            return 0;
        }
        char currentChar = s.charAt(index);
        int count = isConsonant(currentChar) ? 1 : 0;
        return count + consonantsCounter(s, index + 1);
    }
    // Task 5 : Binary to Decimal Converter
    public static int binaryToDecimal(String binaryString) {
        return binaryToDecimalConverter(binaryString, binaryString.length() - 1);
    }
    private static int binaryToDecimalConverter(String binaryString, int index) {
        
        if (index < 0) {
            return 0;
        }
        int indexValue = (binaryString.charAt(index) - '0') * (int) Math.pow(2, binaryString.length() - 1 - index);
        return indexValue + binaryToDecimalConverter(binaryString, index - 1);
    }
    
}
