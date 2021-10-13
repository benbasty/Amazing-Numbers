package numbers;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
//        write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Amazing Numbers!");

        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("\t* the first parameter represents a starting number;");
        System.out.println("\t* the second parameters show how many consecutive numbers are to be processed;");
        System.out.println("- enter 0 to exit.");

        while(true) {
            System.out.print("Enter a request: ");
            String request = scanner.nextLine();
            String[] requestParts = request.split(" ");
            long naturalNumber = Long.parseLong(requestParts[0]);

            if (requestParts.length == 1) {

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
                    System.out.println("\t\tgapful: " + isGapful(naturalNumber));

                }

            } else {
                long secondParameter = Long.parseLong(requestParts[1]);
                if (secondParameter < 0) {
                    System.out.println("The second parameter should be a natural number.");
                } else {
                    for (long i = 0; i < secondParameter; i++) {
                        StringJoiner stringJoiner = new StringJoiner(", ");
                        System.out.print(naturalNumber + " is ");
                        if (isBuzz(naturalNumber)) {
                            stringJoiner.add("buzz");
                        }
                        if (isDuck(naturalNumber)) {
                            stringJoiner.add("duck");
                        }
                        if (isPalindrome(naturalNumber)) {
                            stringJoiner.add("palindromic");
                        }
                        if (isGapful(naturalNumber)) {
                            stringJoiner.add("gapful");
                        }
                        if (isEven(naturalNumber)) {
                            stringJoiner.add("even");
                        }
                        if (isOdd(naturalNumber)) {
                            stringJoiner.add("odd");
                        }
                        System.out.println(stringJoiner);
                        naturalNumber++;
                    }
                }
            }
        }

    }

    private static boolean isGapful(long naturalNumber) {
        //find if number contain at least 3 digits
        // first convert to string then check the length
        String naturalNumString = Long.toString(naturalNumber);
        if (naturalNumString.length() < 3) {
            return false;
        } else {
            String firstDigitNaturalNum = naturalNumString.substring(0,1);
            String lastDigitNaturalNum = naturalNumString.substring(naturalNumString.length()-1);
            String concatFirstLast = firstDigitNaturalNum + lastDigitNaturalNum;
            long concatFirstLastL = Long.parseLong(concatFirstLast);
            return naturalNumber % concatFirstLastL == 0;
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
