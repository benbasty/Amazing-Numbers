package numbers;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Amazing Numbers!");

        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.");

        while(true) {
            System.out.print("Enter a request: ");
            long naturalNumber = scanner.nextLong();

            if (naturalNumber == 0) {
                System.out.println("Goodbye!");
                break;
            }

            if (naturalNumber < 0) {
                System.out.println("The first parameter should be a natural number or zero.");

            } else {
                System.out.println("Properties of " + naturalNumber);
                System.out.println("\t\teven: " + isEven(naturalNumber));
                System.out.println("\t\todd: " + isOdd(naturalNumber));
                System.out.println("\t\tbuzz: " + isBuzz(naturalNumber));
                System.out.println("\t\tduck: " + isDuck(naturalNumber));
                System.out.println("\t\tpalindromic: " + isPalindrome(naturalNumber));

            }

        }

    }

    private static boolean isOdd(long naturalNumber) {
        return naturalNumber % 2 != 0;
    }

    private static boolean isEven(long naturalNumber) {
        return naturalNumber % 2 == 0;
    }

    private static boolean isBuzz(long naturalNumber) {
        return naturalNumber % 7 == 0 || naturalNumber % 10 == 7;
    }

    private static boolean isDuck(long naturalNumber) {
        return String.valueOf(naturalNumber).contains("0") && !String.valueOf(naturalNumber).startsWith("0");
    }

    private static boolean isPalindrome(long naturalNumber) {
        String nums = String.valueOf(naturalNumber);
        for (int i = 0; i < nums.length(); i++) {
            if(nums.charAt(i) != nums.charAt(nums.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }

}
