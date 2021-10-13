package numbers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instructions
        menu();
        // Ask for a request;
        Scanner scanner = new Scanner(System.in);
        // Once a request is processed, continue execution from step 3.
        while (true) {
            System.out.println("Enter a request:");
            String[] arr = scanner.nextLine().split(" ");
            if (arr.length == 1) {
                // If a user enters zero, terminate the program;
                try {
                    long a = Long.parseLong(arr[0]);
                    if (a == 0) {
                        System.out.println("Goodbye!");
                        break;
                    }

                    print(a);
                } catch (NumberFormatException e) {
                    // If numbers are not natural, print an error message;
                    System.out.println("The first parameter should be a natural number or zero.");
                }
            } else if (arr.length == 2) {
                long a, b;
                try {
                    a = Long.parseLong(arr[0]);
                } catch (NumberFormatException e) {
                    // If numbers are not natural, print an error message;
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }
                try {
                    b = Long.parseLong(arr[1]);
                } catch (NumberFormatException e) {
                    // If a user inputs an incorrect property, print the error message and the list of available properties;
                    System.out.println("The second parameter should be a natural number.");
                    continue;
                }
                print(a, b);
            } else if (arr.length == 3) {
                long a, b;
                try {
                    a = Long.parseLong(arr[0]);
                } catch (NumberFormatException e) {
                    // If a user inputs an incorrect property, print the error message and the list of available properties;
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }
                try {
                    b = Long.parseLong(arr[1]);
                } catch (NumberFormatException e) {
                    System.out.println("The second parameter should be a natural number.");
                    continue;
                }
                String property = arr[2].toLowerCase();
                print(a, b, property);
            } else if (arr.length == 4) {
                long a, b;
                try {
                    a = Long.parseLong(arr[0]);
                } catch (NumberFormatException e) {
                    // If a user inputs an incorrect property, print the error message and the list of available properties;
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }
                try {
                    b = Long.parseLong(arr[1]);
                } catch (NumberFormatException e) {
                    System.out.println("The second parameter should be a natural number.");
                    continue;
                }
                String firstProperty = arr[2].toLowerCase();
                String secondProperty = arr[3].toLowerCase();
                print(a, b, firstProperty, secondProperty);

            }
        }
    }

    // Welcome users;
    // Display the instructions;
    public static void menu() {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests:"
                + "\n- enter a natural number to know its properties;"
                + "\n- enter two natural numbers to obtain the properties of the list:"
                + "\n\t* the first parameter represents a starting number;"
                + "\n\t* the second parameter show how many consecutive numbers are to be processed;"
                + "\n- two natural numbers and a property to search for;"
                + "\n- two natural numbers and two properties to search for;"
                + "\n- separate the parameters with one space;"
                + "\n- enter 0 to exit.");
    }

    // For one number, print the properties of the number;
    public static void print(long a) {
        System.out.println("Properties of " + a);
        if (a < 0) System.out.println("The first parameter should be a natural number or zero.");
        else {
            System.out.println(isBuzz(a) ? "\tbuzz: true" : "\tbuzz: false");
            System.out.println(isDuck(a) ? "\tduck: true" : "\tduck: false");
            System.out.println(isPalindromic(a) ? "\tpalindromic: true" : "\tpalindromic: false");
            System.out.println(isGapful(a) ? "\tgapful: true" : "\tgapful: false");
            System.out.println(isSpy(a) ? "\tspy: true" : "\tspy: false");
            System.out.println(isSquare(a) ? "\tsquare: true" : "\tsquare: false");
            System.out.println(isSunny(a) ? "\tsunny: true" : "\tsunny: false");
            System.out.println(isEven(a) ? "\teven: true\n\todd: false" : "\teven: false\n\todd: true");
        }
    }

    // For two numbers, print the list of numbers with their properties;
    public static void print(long a, long b) {
        if (a < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
            return;
        }
        if (b < 1) {
            System.out.println("The second parameter should be a natural number.");
            return;
        }
        for (long i = a; i < a + b; i++) {
            printProperty(i);
        }
    }
    // For two numbers and a property, print the list of numbers and their properties filtered by the indicated property;
    public static void print(long a, long b, String property) {
        if (a < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
            return;
        }
        if (b < 1) {
            System.out.println("The second parameter should be a natural number.");
            return;
        }
        String properties = "evenoddbuzzduckpalindromicgapfulspysquaresunny";
        if (properties.contains(property)) {
            switch (property) {
                case "even":
                    printEven(a, b);
                    break;
                case "odd":
                    printOdd(a, b);
                    break;
                case "buzz":
                    printBuzz(a, b);
                    break;
                case "duck":
                    printDuck(a, b);
                    break;
                case "palindromic":
                    printPalindromic(a, b);
                    break;
                case "gapful":
                    printGapful(a, b);
                    break;
                case "square":
                    printSquare(a, b);
                    break;
                case "sunny":
                    printSunny(a, b);
                    break;
                default:
                    printSpy(a, b);
                    break;
            }
        } else System.out.println("The property " + property + " is wrong." +
                "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
    }

    public static void print(long a, long b, String firstProperty, String secondProperty) {
        String properties = "evenoddbuzzduckpalindromicgapfulspysunnysquare";
        if (properties.contains(firstProperty) && properties.contains(secondProperty)) {
            if (firstProperty.equals("even") && secondProperty.equals("odd") || firstProperty.equals("duck") && secondProperty.equals("spy") || firstProperty.equals("sunny") && secondProperty.equals("square") || firstProperty.equals("odd") && secondProperty.equals("even") || firstProperty.equals("spy") && secondProperty.equals("duck") || firstProperty.equals("square") && secondProperty.equals("sunny") || firstProperty.equals(secondProperty)) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + secondProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY]");
                return;
            }

            int counter = 0;
            while (counter < b) {
                if (propertyHas(a, firstProperty) && propertyHas(a, secondProperty)) {
                    printProperty(a);
                    counter++;
                }
                a++;
            }
        } else {
            if (!properties.contains(firstProperty) && !properties.contains(secondProperty)) {
                System.out.println("The properties [" + firstProperty + ", " + secondProperty + "] are wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
            } else if ((!properties.contains(firstProperty))) {
                System.out.println("The property [" + firstProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
            } else {
                System.out.println("The property [" + secondProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD]");
            }

        }

    }

    public static boolean propertyHas(long a, String property) {
        switch (property) {
            case "even":
                if (isEven(a)) {
                    return true;
                }
                break;
            case "odd":
                if (!isEven(a)) {
                    return true;
                }
                break;
            case "buzz":
                if (isBuzz(a)) {
                    return true;
                }
                break;
            case "duck":
                if (isDuck(a)) {
                    return true;
                }
                break;
            case "gapful":
                if (isGapful(a)) {
                    return true;
                }
                break;

            case "palindromic":
                if (isPalindromic(a)) {
                    return true;
                }
                break;

            case "spy":
                if (isSpy(a)) {
                    return true;
                }
                break;

            case "sunny":
                if (isSunny(a)) {
                    return true;
                }
                break;

            case "square":
                if (isSquare(a)) {
                    return true;
                }
                break;
        }
        return false;
    }



    public static void printProperty(long a) {
        System.out.print(a + " is ");
        if (isEven(a)) System.out.print("even");
        else System.out.print("odd");
        if (isBuzz(a)) System.out.print(", buzz");
        if (isDuck(a)) System.out.print(", duck");
        if (isPalindromic(a)) System.out.print(", palindromic");
        if (isGapful(a)) System.out.print(", gapful");
        if (isSpy(a)) System.out.print(", spy");
        if (isSquare(a)) System.out.print(", square");
        if (isSunny(a)) System.out.print(", sunny");
        System.out.println();
    }

    public static void printEven(long a, long b) {
        long counter = 0;
        while (counter < b) {
            if (isEven(a)) {
                printProperty(a);
                counter++;
            }
            a++;
        }
    }

    public static void printOdd(long a, long b) {
        long counter = 0;
        while (counter < b) {
            if (!isEven(a)) {
                printProperty(a);
                counter++;
            }
            a++;
        }
    }

    public static void printBuzz(long a, long b) {
        long counter = 0;
        while (counter < b) {
            if (isBuzz(a)) {
                printProperty(a);
                counter++;
            }
            a++;
        }
    }

    public static void printDuck(long a, long b) {
        long counter = 0;
        while (counter < b) {
            if (isDuck(a)) {
                printProperty(a);
                counter++;
            }
            a++;
        }
    }

    public static void printPalindromic(long a, long b) {
        long counter = 0;
        while (counter < b) {
            if (isPalindromic(a)) {
                printProperty(a);
                counter++;
            }
            a++;
        }
    }

    public static void printGapful(long a, long b) {
        long counter = 0;
        while (counter < b) {
            if (isGapful(a)) {
                printProperty(a);
                counter++;
            }
            a++;
        }
    }

    public static void printSpy(long a, long b) {
        long counter = 0;
        while (counter < b) {
            if (isSpy(a)) {
                printProperty(a);
                counter++;
            }
            a++;
        }
    }

    public static void printSunny(long a, long b) {
        long counter = 0;
        while (counter < b) {
            if (isSunny(a)) {
                printProperty(a);
                counter++;
            }
            a++;
        }
    }

    public static void printSquare(long a, long b) {
        long counter = 0;
        while (counter < b) {
            if (isSquare(a)) {
                printProperty(a);
                counter++;
            }
            a++;
        }
    }

    public static boolean isEven(long a) {
        return a % 2 == 0;
    }

    public static boolean isBuzz(long a) {
        boolean lastDigit = a % 10 == 7;
        boolean div7 = a % 7 == 0;
        return lastDigit || div7;
    }

    public static boolean isDuck(long a) {
        String isDuck = "" + a;
        return isDuck.contains("0") && isDuck.charAt(0) != '0';
    }

    public static boolean isPalindromic(long a) {
        String isPalindrome = "" + a;
        for (int i = 0; i < isPalindrome.length() / 2; i++) {
            if (isPalindrome.charAt(i) != isPalindrome.charAt(isPalindrome.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGapful(long a) {
        String number = String.valueOf(a);
        String gap = "" + number.charAt(0) + number.charAt(number.length() - 1);
        return number.length() >= 3 && a % Long.parseLong(gap) == 0;
    }

    public static boolean isSpy(long a) {
        String number = String.valueOf(a);
        long sum = 0;
        long product = 1;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
            product *= Character.getNumericValue(number.charAt(i));
        }
        return sum == product;
    }

    public static boolean isSquare(long a) {
        String number = String.valueOf(a);
        double square = Math.sqrt(Double.parseDouble(number));
        return square-Math.floor(square) == 0;
    }

    public static boolean isSunny(long a) {
        String numberPlusOne = String.valueOf(a + 1);
        double numberPlusOneSqrt = Math.sqrt(Double.parseDouble(numberPlusOne));
        return numberPlusOneSqrt - Math.floor(numberPlusOneSqrt) == 0;
    }
}
