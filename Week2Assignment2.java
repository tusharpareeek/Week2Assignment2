import java.util.Scanner;
 public class Week2Assignment2 {
    static Week2Assignment2_Constants constant = new Week2Assignment2_Constants();
     public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(constant.task);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            Scanner sc = new Scanner(System.in);
            System.out.println(constant.enterString);
            String input = sc.nextLine();
            countPalindrome(input);
            sc.close();
                break;
            case 2:
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter the Nth value for fibonacci series:");
            int number = scanner2.nextInt();
            fibonacci(number);
            scanner2.close();
                
                break;
            case 3:
               
                break;
            case 4:
                
                break;
            case 5:
        
                break;
                
        }
        scanner.close();

    }
    // Task 1 : Count Palindrome
     public static void countPalindrome(String s){

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
     public static void snakeToCamelConverter( String s){


    }
    // Task 4 : Count Consonants in a String 
     public static void consonantsCounter( String s){

    }
    // Task 5 : Binary to Decimal Converter
     public static void binaryToDecimalConverter( String binaryString ){
        
        

    }
    
}
