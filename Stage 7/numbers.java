package numbers;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a request:");
            String[] arr = scanner.nextLine().split(" ");
            if (arr.length == 1) {
                try {
                    long a = Long.parseLong(arr[0]);
                    if (a == 0) {
                        System.out.println("Goodbye!");
                        break;
                    }

                    print(a);
                } catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                }
            } else if (arr.length == 2) {
                long a, b;
                try {
                    a = Long.parseLong(arr[0]);
                } catch (NumberFormatException e) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    continue;
                }
                try {
                    b = Long.parseLong(arr[1]);
                } catch (NumberFormatException e) {
                    System.out.println("The second parameter should be a natural number.");
                    continue;
                }
                print(a, b);
            } else if (arr.length == 3) {
                long a, b;
                try {
                    a = Long.parseLong(arr[0]);
                } catch (NumberFormatException e) {
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

            } else if (arr.length > 4 && arr.length <= 10) {
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
                String propertiesList = "";
                for (int i = 2; i < arr.length; i++) {
                    propertiesList = arr[i];
                }
                if (arr.length == 5) {
                    String firstProperty = arr[2].toLowerCase();
                    String secondProperty = arr[3].toLowerCase();
                    String thirdProperty = arr[4].toLowerCase();
                    print(a, b, firstProperty, secondProperty, thirdProperty);
                }
                if (arr.length == 6) {
                    String firstProperty = arr[2].toLowerCase();
                    String secondProperty = arr[3].toLowerCase();
                    String thirdProperty = arr[4].toLowerCase();
                    String fourthProperty = arr[5].toLowerCase();
                    print(a, b, firstProperty, secondProperty, thirdProperty, fourthProperty);
                }
                if (arr.length == 7) {
                    String firstProperty = arr[2].toLowerCase();
                    String secondProperty = arr[3].toLowerCase();
                    String thirdProperty = arr[4].toLowerCase();
                    String fourthProperty = arr[5].toLowerCase();
                    String fifthProperty = arr[6].toLowerCase();
                    print(a, b, firstProperty, secondProperty, thirdProperty, fourthProperty, fifthProperty);
                }
                if (arr.length == 8) {
                    String firstProperty = arr[2].toLowerCase();
                    String secondProperty = arr[3].toLowerCase();
                    String thirdProperty = arr[4].toLowerCase();
                    String fourthProperty = arr[5].toLowerCase();
                    String fifthProperty = arr[6].toLowerCase();
                    String sixthProperty = arr[7].toLowerCase();
                    print(a, b, firstProperty, secondProperty, thirdProperty, fourthProperty, fifthProperty, sixthProperty);
                }
                if (arr.length == 9) {
                    String firstProperty = arr[2].toLowerCase();
                    String secondProperty = arr[3].toLowerCase();
                    String thirdProperty = arr[4].toLowerCase();
                    String fourthProperty = arr[5].toLowerCase();
                    String fifthProperty = arr[6].toLowerCase();
                    String sixthProperty = arr[7].toLowerCase();
                    String seventhProperty = arr[8].toLowerCase();
                    print(a, b, firstProperty, secondProperty, thirdProperty, fourthProperty, fifthProperty, sixthProperty, seventhProperty);
                }
                if (arr.length == 10) {
                    String firstProperty = arr[2].toLowerCase();
                    String secondProperty = arr[3].toLowerCase();
                    String thirdProperty = arr[4].toLowerCase();
                    String fourthProperty = arr[5].toLowerCase();
                    String fifthProperty = arr[6].toLowerCase();
                    String sixthProperty = arr[7].toLowerCase();
                    String seventhProperty = arr[8].toLowerCase();
                    String eightProperty = arr[9].toLowerCase();
                    print(a, b, firstProperty, secondProperty, thirdProperty, fourthProperty, fifthProperty, sixthProperty, seventhProperty, eightProperty);
                }

            }

        }
    }




    public static void menu() {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests:"
                + "\n- enter a natural number to know its properties;"
                + "\n- enter two natural numbers to obtain the properties of the list:"
                + "\n\t* the first parameter represents a starting number;"
                + "\n\t* the second parameter show how many consecutive numbers are to be processed;"
                + "\n- two natural numbers and properties to search for;"
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
            System.out.println(isJumping(a) ? "\tjumping: true" : "\tjumping: false");
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

    public static void print(long a, long b, String property) {
        if (a < 0) {
            System.out.println("The first parameter should be a natural number or zero.");
            return;
        }
        if (b < 1) {
            System.out.println("The second parameter should be a natural number.");
            return;
        }
        String properties = "evenoddbuzzduckpalindromicgapfulspysquaresunnyjumping";

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
                    case "jumping":
                        printJumping(a, b);
                        break;
                    default:
                        printSpy(a, b);
                        break;
                }
            } else {

                System.out.println("The property [" + property.toUpperCase() + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, EVEN, ODD, JUMPING]");

            }
    }

    public static void print(long a, long b, String firstProperty, String secondProperty) {
        String properties = "evenoddbuzzduckpalindromicgapfulspysunnysquarejumping";
        if (properties.contains(firstProperty) && properties.contains(secondProperty)) {
            if (firstProperty.equals("even") && secondProperty.equals("odd") || firstProperty.equals("duck") && secondProperty.equals("spy") || firstProperty.equals("sunny") && secondProperty.equals("square") || firstProperty.equals("odd") && secondProperty.equals("even") || firstProperty.equals("spy") && secondProperty.equals("duck") || firstProperty.equals("square") && secondProperty.equals("sunny") || firstProperty.equals(secondProperty)) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + secondProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
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
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(firstProperty))) {
                System.out.println("The property [" + firstProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else {
                System.out.println("The property [" + secondProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            }

        }

    }

    private static void print(long a, long b, String firstProperty, String secondProperty, String thirdProperty) {
        String properties = "evenoddbuzzduckpalindromicgapfulspysunnysquarejumping";
        if (properties.contains(firstProperty) && properties.contains(secondProperty) && properties.contains(thirdProperty)) {
            if (firstProperty.equals("even") && secondProperty.equals("odd") || firstProperty.equals("odd") && secondProperty.equals("even") || firstProperty.equals("spy") && secondProperty.equals("duck") || firstProperty.equals("duck") && secondProperty.equals("spy") || firstProperty.equals("sunny") && secondProperty.equals("square") ||firstProperty.equals("square") && secondProperty.equals("sunny"))  {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + secondProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && thirdProperty.equals("odd") || firstProperty.equals("odd") && thirdProperty.equals("even") || firstProperty.equals("spy") && thirdProperty.equals("duck") || firstProperty.equals("duck") && thirdProperty.equals("spy") || firstProperty.equals("sunny") && thirdProperty.equals("square") || firstProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && thirdProperty.equals("odd") || secondProperty.equals("odd") && thirdProperty.equals("even") || secondProperty.equals("spy") && thirdProperty.equals("duck") || secondProperty.equals("duck") && thirdProperty.equals("spy") || secondProperty.equals("sunny") && thirdProperty.equals("square") || secondProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + secondProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            }

            int counter = 0;
            while (counter < b) {
                if (propertyHas(a, firstProperty) && propertyHas(a, secondProperty) && propertyHas(a, thirdProperty)) {
                    printProperty(a);
                    counter++;
                }
                a++;
            }
        } else {
            if (!properties.contains(firstProperty) && (!properties.contains(secondProperty)) && (!properties.contains(thirdProperty))) {
                System.out.println("The properties [" + firstProperty + ", " + secondProperty + ", " + thirdProperty + "] are wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(firstProperty))) {
                System.out.println("The property [" + firstProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(secondProperty))) {
                System.out.println("The property [" + secondProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else {
                System.out.println("The property [" + thirdProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            }
        }
    }

    private static void print(long a, long b, String firstProperty, String secondProperty, String thirdProperty, String fourthProperty) {
        String properties = "evenoddbuzzduckpalindromicgapfulspysunnysquarejumping";
        if (properties.contains(firstProperty) && properties.contains(secondProperty) && properties.contains(thirdProperty) && properties.contains(fourthProperty)) {

            if (firstProperty.equals("even") && secondProperty.equals("odd") || firstProperty.equals("odd") && secondProperty.equals("even") || firstProperty.equals("spy") && secondProperty.equals("duck") || firstProperty.equals("duck") && secondProperty.equals("spy") || firstProperty.equals("sunny") && secondProperty.equals("square") ||firstProperty.equals("square") && secondProperty.equals("sunny"))  {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + secondProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && thirdProperty.equals("odd") || firstProperty.equals("odd") && thirdProperty.equals("even") || firstProperty.equals("spy") && thirdProperty.equals("duck") || firstProperty.equals("duck") && thirdProperty.equals("spy") || firstProperty.equals("sunny") && thirdProperty.equals("square") || firstProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && thirdProperty.equals("odd") || secondProperty.equals("odd") && thirdProperty.equals("even") || secondProperty.equals("spy") && thirdProperty.equals("duck") || secondProperty.equals("duck") && thirdProperty.equals("spy") || secondProperty.equals("sunny") && thirdProperty.equals("square") || secondProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + secondProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && fourthProperty.equals("odd") || firstProperty.equals("odd") && fourthProperty.equals("even") || firstProperty.equals("spy") && fourthProperty.equals("duck") || firstProperty.equals("duck") && fourthProperty.equals("spy") || firstProperty.equals("sunny") && fourthProperty.equals("square") || firstProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && fourthProperty.equals("odd") || secondProperty.equals("odd") && fourthProperty.equals("even") || secondProperty.equals("spy") && fourthProperty.equals("duck") || secondProperty.equals("duck") && fourthProperty.equals("spy") || secondProperty.equals("sunny") && fourthProperty.equals("square") || secondProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + secondProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && fourthProperty.equals("odd") || thirdProperty.equals("odd") && fourthProperty.equals("even") || thirdProperty.equals("spy") && fourthProperty.equals("duck") || thirdProperty.equals("duck") && fourthProperty.equals("spy") || thirdProperty.equals("sunny") && fourthProperty.equals("square") || thirdProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + thirdProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            }

            int counter = 0;
            while (counter < b) {
                if (propertyHas(a, firstProperty) && propertyHas(a, secondProperty) && propertyHas(a, thirdProperty) && propertyHas(a, fourthProperty)) {
                    printProperty(a);
                    counter++;
                }
                a++;
            }
        } else {
            if (!properties.contains(firstProperty) && (!properties.contains(secondProperty)) && (!properties.contains(thirdProperty)) && (!properties.contains(fourthProperty))) {
                System.out.println("The properties [" + firstProperty + ", " + secondProperty + ", " + thirdProperty + ", " + fourthProperty + "] are wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(firstProperty))) {
                System.out.println("The property [" + firstProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(secondProperty))) {
                System.out.println("The property [" + secondProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(thirdProperty)) {
                System.out.println("The property [" + thirdProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else {
                System.out.println("The property [" + fourthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            }
        }
    }



    private static void print(long a, long b, String firstProperty, String secondProperty, String thirdProperty, String fourthProperty, String fifthProperty) {
        String properties = "evenoddbuzzduckpalindromicgapfulspysunnysquarejumping";
        if (properties.contains(firstProperty) && properties.contains(secondProperty) && properties.contains(thirdProperty) && properties.contains(fourthProperty) && properties.contains(fifthProperty)) {
            if (firstProperty.equals("even") && secondProperty.equals("odd") || firstProperty.equals("odd") && secondProperty.equals("even") || firstProperty.equals("spy") && secondProperty.equals("duck") || firstProperty.equals("duck") && secondProperty.equals("spy") || firstProperty.equals("sunny") && secondProperty.equals("square") ||firstProperty.equals("square") && secondProperty.equals("sunny"))  {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + secondProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && thirdProperty.equals("odd") || firstProperty.equals("odd") && thirdProperty.equals("even") || firstProperty.equals("spy") && thirdProperty.equals("duck") || firstProperty.equals("duck") && thirdProperty.equals("spy") || firstProperty.equals("sunny") && thirdProperty.equals("square") || firstProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && thirdProperty.equals("odd") || secondProperty.equals("odd") && thirdProperty.equals("even") || secondProperty.equals("spy") && thirdProperty.equals("duck") || secondProperty.equals("duck") && thirdProperty.equals("spy") || secondProperty.equals("sunny") && thirdProperty.equals("square") || secondProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + secondProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && fourthProperty.equals("odd") || firstProperty.equals("odd") && fourthProperty.equals("even") || firstProperty.equals("spy") && fourthProperty.equals("duck") || firstProperty.equals("duck") && fourthProperty.equals("spy") || firstProperty.equals("sunny") && fourthProperty.equals("square") || firstProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && fourthProperty.equals("odd") || secondProperty.equals("odd") && fourthProperty.equals("even") || secondProperty.equals("spy") && fourthProperty.equals("duck") || secondProperty.equals("duck") && fourthProperty.equals("spy") || secondProperty.equals("sunny") && fourthProperty.equals("square") || secondProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + secondProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && fourthProperty.equals("odd") || thirdProperty.equals("odd") && fourthProperty.equals("even") || thirdProperty.equals("spy") && fourthProperty.equals("duck") || thirdProperty.equals("duck") && fourthProperty.equals("spy") || thirdProperty.equals("sunny") && fourthProperty.equals("square") || thirdProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + thirdProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && fifthProperty.equals("odd") || firstProperty.equals("odd") && fifthProperty.equals("even") || firstProperty.equals("spy") && fifthProperty.equals("duck") || firstProperty.equals("duck") && fifthProperty.equals("spy") || firstProperty.equals("sunny") && fifthProperty.equals("square") || firstProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && fifthProperty.equals("odd") || secondProperty.equals("odd") && fifthProperty.equals("even") || secondProperty.equals("spy") && fifthProperty.equals("duck") || secondProperty.equals("duck") && fifthProperty.equals("spy") || secondProperty.equals("sunny") && fifthProperty.equals("square") || secondProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && fifthProperty.equals("odd") || thirdProperty.equals("odd") && fifthProperty.equals("even") || thirdProperty.equals("spy") && fifthProperty.equals("duck") || thirdProperty.equals("duck") && fifthProperty.equals("spy") || thirdProperty.equals("sunny") && fifthProperty.equals("square") || thirdProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fourthProperty.equals("even") && fifthProperty.equals("odd") || fourthProperty.equals("odd") && fifthProperty.equals("even") || fourthProperty.equals("spy") && fifthProperty.equals("duck") || fourthProperty.equals("duck") && fifthProperty.equals("spy") || fourthProperty.equals("sunny") && fifthProperty.equals("square") || fourthProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            }
            int counter = 0;
            while (counter < b) {
                if (propertyHas(a, firstProperty) && propertyHas(a, secondProperty) && propertyHas(a, thirdProperty) && propertyHas(a, fourthProperty) && propertyHas(a, fifthProperty)) {
                    printProperty(a);
                    counter++;
                }
                a++;
            }
        } else {
            if (!properties.contains(firstProperty) && (!properties.contains(secondProperty)) && (!properties.contains(thirdProperty)) && (!properties.contains(fourthProperty)) && (!properties.contains(fifthProperty))) {
                System.out.println("The properties [" + firstProperty + ", " + secondProperty + ", " + thirdProperty + ", " + fourthProperty + ", " + fifthProperty + "] are wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(firstProperty))) {
                System.out.println("The property [" + firstProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(secondProperty))) {
                System.out.println("The property [" + secondProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(thirdProperty)) {
                System.out.println("The property [" + thirdProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(fourthProperty)) {
                System.out.println("The property [" + fourthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else {
                System.out.println("The property [" + fifthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            }
        }

    }

    private static void print(long a, long b, String firstProperty, String secondProperty, String thirdProperty, String fourthProperty, String fifthProperty, String sixthProperty) {
        String properties = "evenoddbuzzduckpalindromicgapfulspysunnysquarejumping";
        if (properties.contains(firstProperty) && properties.contains(secondProperty) && properties.contains(thirdProperty) && properties.contains(fourthProperty) && properties.contains(fifthProperty) && properties.contains(sixthProperty)) {
            if (firstProperty.equals("even") && secondProperty.equals("odd") || firstProperty.equals("odd") && secondProperty.equals("even") || firstProperty.equals("spy") && secondProperty.equals("duck") || firstProperty.equals("duck") && secondProperty.equals("spy") || firstProperty.equals("sunny") && secondProperty.equals("square") ||firstProperty.equals("square") && secondProperty.equals("sunny"))  {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + secondProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && thirdProperty.equals("odd") || firstProperty.equals("odd") && thirdProperty.equals("even") || firstProperty.equals("spy") && thirdProperty.equals("duck") || firstProperty.equals("duck") && thirdProperty.equals("spy") || firstProperty.equals("sunny") && thirdProperty.equals("square") || firstProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && thirdProperty.equals("odd") || secondProperty.equals("odd") && thirdProperty.equals("even") || secondProperty.equals("spy") && thirdProperty.equals("duck") || secondProperty.equals("duck") && thirdProperty.equals("spy") || secondProperty.equals("sunny") && thirdProperty.equals("square") || secondProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + secondProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && fourthProperty.equals("odd") || firstProperty.equals("odd") && fourthProperty.equals("even") || firstProperty.equals("spy") && fourthProperty.equals("duck") || firstProperty.equals("duck") && fourthProperty.equals("spy") || firstProperty.equals("sunny") && fourthProperty.equals("square") || firstProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && fourthProperty.equals("odd") || secondProperty.equals("odd") && fourthProperty.equals("even") || secondProperty.equals("spy") && fourthProperty.equals("duck") || secondProperty.equals("duck") && fourthProperty.equals("spy") || secondProperty.equals("sunny") && fourthProperty.equals("square") || secondProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + secondProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && fourthProperty.equals("odd") || thirdProperty.equals("odd") && fourthProperty.equals("even") || thirdProperty.equals("spy") && fourthProperty.equals("duck") || thirdProperty.equals("duck") && fourthProperty.equals("spy") || thirdProperty.equals("sunny") && fourthProperty.equals("square") || thirdProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + thirdProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && fifthProperty.equals("odd") || firstProperty.equals("odd") && fifthProperty.equals("even") || firstProperty.equals("spy") && fifthProperty.equals("duck") || firstProperty.equals("duck") && fifthProperty.equals("spy") || firstProperty.equals("sunny") && fifthProperty.equals("square") || firstProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && fifthProperty.equals("odd") || secondProperty.equals("odd") && fifthProperty.equals("even") || secondProperty.equals("spy") && fifthProperty.equals("duck") || secondProperty.equals("duck") && fifthProperty.equals("spy") || secondProperty.equals("sunny") && fifthProperty.equals("square") || secondProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && fifthProperty.equals("odd") || thirdProperty.equals("odd") && fifthProperty.equals("even") || thirdProperty.equals("spy") && fifthProperty.equals("duck") || thirdProperty.equals("duck") && fifthProperty.equals("spy") || thirdProperty.equals("sunny") && fifthProperty.equals("square") || thirdProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fourthProperty.equals("even") && fifthProperty.equals("odd") || fourthProperty.equals("odd") && fifthProperty.equals("even") || fourthProperty.equals("spy") && fifthProperty.equals("duck") || fourthProperty.equals("duck") && fifthProperty.equals("spy") || fourthProperty.equals("sunny") && fifthProperty.equals("square") || fourthProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && sixthProperty.equals("odd") || firstProperty.equals("odd") && sixthProperty.equals("even") || firstProperty.equals("spy") && sixthProperty.equals("duck") || firstProperty.equals("duck") && sixthProperty.equals("spy") || firstProperty.equals("sunny") && sixthProperty.equals("square") || firstProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && sixthProperty.equals("odd") || secondProperty.equals("odd") && sixthProperty.equals("even") || secondProperty.equals("spy") && sixthProperty.equals("duck") || secondProperty.equals("duck") && sixthProperty.equals("spy") || secondProperty.equals("sunny") && sixthProperty.equals("square") || secondProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && sixthProperty.equals("odd") || thirdProperty.equals("odd") && sixthProperty.equals("even") || thirdProperty.equals("spy") && sixthProperty.equals("duck") || thirdProperty.equals("duck") && sixthProperty.equals("spy") || thirdProperty.equals("sunny") && sixthProperty.equals("square") || thirdProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fourthProperty.equals("even") && sixthProperty.equals("odd") || fourthProperty.equals("odd") && sixthProperty.equals("even") || fourthProperty.equals("spy") && sixthProperty.equals("duck") || fourthProperty.equals("duck") && sixthProperty.equals("spy") || fourthProperty.equals("sunny") && sixthProperty.equals("square") || fourthProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fifthProperty.equals("even") && sixthProperty.equals("odd") || fifthProperty.equals("odd") && sixthProperty.equals("even") || fifthProperty.equals("spy") && sixthProperty.equals("duck") || fifthProperty.equals("duck") && sixthProperty.equals("spy") || fifthProperty.equals("sunny") && sixthProperty.equals("square") || fifthProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            }

            int counter = 0;
            while (counter < b) {
                if (propertyHas(a, firstProperty) && propertyHas(a, secondProperty) && propertyHas(a, thirdProperty) && propertyHas(a, fourthProperty) && propertyHas(a, fifthProperty) && propertyHas(a, sixthProperty)) {
                    printProperty(a);
                    counter++;
                }
                a++;
            }
        } else {
            if (!properties.contains(firstProperty) && (!properties.contains(secondProperty)) && (!properties.contains(thirdProperty)) && (!properties.contains(fourthProperty)) && (!properties.contains(fifthProperty)) && (!properties.contains(sixthProperty))) {
                System.out.println("The properties [" + firstProperty + ", " + secondProperty + ", " + thirdProperty + ", " + fourthProperty + ", " + fifthProperty + ", " + sixthProperty + "] are wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(firstProperty))) {
                System.out.println("The property [" + firstProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(secondProperty))) {
                System.out.println("The property [" + secondProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(thirdProperty)) {
                System.out.println("The property [" + thirdProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(fourthProperty)) {
                System.out.println("The property [" + fourthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(fifthProperty)) {
                System.out.println("The property [" + fifthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else {
                System.out.println("The property [" + sixthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            }
        }
    }

    private static void print(long a, long b, String firstProperty, String secondProperty, String thirdProperty, String fourthProperty, String fifthProperty, String sixthProperty, String seventhProperty) {
        String properties = "evenoddbuzzduckpalindromicgapfulspysunnysquarejumping";
        if (properties.contains(firstProperty) && properties.contains(secondProperty) && properties.contains(thirdProperty) && properties.contains(fourthProperty) && properties.contains(fifthProperty) && properties.contains(sixthProperty) && properties.contains(seventhProperty)) {
            if (firstProperty.equals("even") && secondProperty.equals("odd") || firstProperty.equals("odd") && secondProperty.equals("even") || firstProperty.equals("spy") && secondProperty.equals("duck") || firstProperty.equals("duck") && secondProperty.equals("spy") || firstProperty.equals("sunny") && secondProperty.equals("square") ||firstProperty.equals("square") && secondProperty.equals("sunny"))  {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + secondProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && thirdProperty.equals("odd") || firstProperty.equals("odd") && thirdProperty.equals("even") || firstProperty.equals("spy") && thirdProperty.equals("duck") || firstProperty.equals("duck") && thirdProperty.equals("spy") || firstProperty.equals("sunny") && thirdProperty.equals("square") || firstProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && thirdProperty.equals("odd") || secondProperty.equals("odd") && thirdProperty.equals("even") || secondProperty.equals("spy") && thirdProperty.equals("duck") || secondProperty.equals("duck") && thirdProperty.equals("spy") || secondProperty.equals("sunny") && thirdProperty.equals("square") || secondProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + secondProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && fourthProperty.equals("odd") || firstProperty.equals("odd") && fourthProperty.equals("even") || firstProperty.equals("spy") && fourthProperty.equals("duck") || firstProperty.equals("duck") && fourthProperty.equals("spy") || firstProperty.equals("sunny") && fourthProperty.equals("square") || firstProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && fourthProperty.equals("odd") || secondProperty.equals("odd") && fourthProperty.equals("even") || secondProperty.equals("spy") && fourthProperty.equals("duck") || secondProperty.equals("duck") && fourthProperty.equals("spy") || secondProperty.equals("sunny") && fourthProperty.equals("square") || secondProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + secondProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && fourthProperty.equals("odd") || thirdProperty.equals("odd") && fourthProperty.equals("even") || thirdProperty.equals("spy") && fourthProperty.equals("duck") || thirdProperty.equals("duck") && fourthProperty.equals("spy") || thirdProperty.equals("sunny") && fourthProperty.equals("square") || thirdProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + thirdProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && fifthProperty.equals("odd") || firstProperty.equals("odd") && fifthProperty.equals("even") || firstProperty.equals("spy") && fifthProperty.equals("duck") || firstProperty.equals("duck") && fifthProperty.equals("spy") || firstProperty.equals("sunny") && fifthProperty.equals("square") || firstProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && fifthProperty.equals("odd") || secondProperty.equals("odd") && fifthProperty.equals("even") || secondProperty.equals("spy") && fifthProperty.equals("duck") || secondProperty.equals("duck") && fifthProperty.equals("spy") || secondProperty.equals("sunny") && fifthProperty.equals("square") || secondProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && fifthProperty.equals("odd") || thirdProperty.equals("odd") && fifthProperty.equals("even") || thirdProperty.equals("spy") && fifthProperty.equals("duck") || thirdProperty.equals("duck") && fifthProperty.equals("spy") || thirdProperty.equals("sunny") && fifthProperty.equals("square") || thirdProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fourthProperty.equals("even") && fifthProperty.equals("odd") || fourthProperty.equals("odd") && fifthProperty.equals("even") || fourthProperty.equals("spy") && fifthProperty.equals("duck") || fourthProperty.equals("duck") && fifthProperty.equals("spy") || fourthProperty.equals("sunny") && fifthProperty.equals("square") || fourthProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && sixthProperty.equals("odd") || firstProperty.equals("odd") && sixthProperty.equals("even") || firstProperty.equals("spy") && sixthProperty.equals("duck") || firstProperty.equals("duck") && sixthProperty.equals("spy") || firstProperty.equals("sunny") && sixthProperty.equals("square") || firstProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && sixthProperty.equals("odd") || secondProperty.equals("odd") && sixthProperty.equals("even") || secondProperty.equals("spy") && sixthProperty.equals("duck") || secondProperty.equals("duck") && sixthProperty.equals("spy") || secondProperty.equals("sunny") && sixthProperty.equals("square") || secondProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && sixthProperty.equals("odd") || thirdProperty.equals("odd") && sixthProperty.equals("even") || thirdProperty.equals("spy") && sixthProperty.equals("duck") || thirdProperty.equals("duck") && sixthProperty.equals("spy") || thirdProperty.equals("sunny") && sixthProperty.equals("square") || thirdProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fourthProperty.equals("even") && sixthProperty.equals("odd") || fourthProperty.equals("odd") && sixthProperty.equals("even") || fourthProperty.equals("spy") && sixthProperty.equals("duck") || fourthProperty.equals("duck") && sixthProperty.equals("spy") || fourthProperty.equals("sunny") && sixthProperty.equals("square") || fourthProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fifthProperty.equals("even") && sixthProperty.equals("odd") || fifthProperty.equals("odd") && sixthProperty.equals("even") || fifthProperty.equals("spy") && sixthProperty.equals("duck") || fifthProperty.equals("duck") && sixthProperty.equals("spy") || fifthProperty.equals("sunny") && sixthProperty.equals("square") || fifthProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && seventhProperty.equals("odd") || firstProperty.equals("odd") && seventhProperty.equals("even") || firstProperty.equals("spy") && seventhProperty.equals("duck") || firstProperty.equals("duck") && seventhProperty.equals("spy") || firstProperty.equals("sunny") && seventhProperty.equals("square") || firstProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && seventhProperty.equals("odd") || secondProperty.equals("odd") && seventhProperty.equals("even") || secondProperty.equals("spy") && seventhProperty.equals("duck") || secondProperty.equals("duck") && seventhProperty.equals("spy") || secondProperty.equals("sunny") && seventhProperty.equals("square") || secondProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && seventhProperty.equals("odd") || thirdProperty.equals("odd") && seventhProperty.equals("even") || thirdProperty.equals("spy") && seventhProperty.equals("duck") || thirdProperty.equals("duck") && seventhProperty.equals("spy") || thirdProperty.equals("sunny") && seventhProperty.equals("square") || thirdProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fourthProperty.equals("even") && seventhProperty.equals("odd") || fourthProperty.equals("odd") && seventhProperty.equals("even") || fourthProperty.equals("spy") && seventhProperty.equals("duck") || fourthProperty.equals("duck") && seventhProperty.equals("spy") || fourthProperty.equals("sunny") && seventhProperty.equals("square") || fourthProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fifthProperty.equals("even") && seventhProperty.equals("odd") || fifthProperty.equals("odd") && seventhProperty.equals("even") || fifthProperty.equals("spy") && seventhProperty.equals("duck") || fifthProperty.equals("duck") && seventhProperty.equals("spy") || fifthProperty.equals("sunny") && seventhProperty.equals("square") || fifthProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (sixthProperty.equals("even") && seventhProperty.equals("odd") || sixthProperty.equals("odd") && seventhProperty.equals("even") || sixthProperty.equals("spy") && seventhProperty.equals("duck") || sixthProperty.equals("duck") && seventhProperty.equals("spy") || sixthProperty.equals("sunny") && seventhProperty.equals("square") || sixthProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            }

            int counter = 0;
            while (counter < b) {
                if (propertyHas(a, firstProperty) && propertyHas(a, secondProperty) && propertyHas(a, thirdProperty) && propertyHas(a, fourthProperty) && propertyHas(a, fifthProperty) && propertyHas(a, sixthProperty) && propertyHas(a, seventhProperty)) {
                    printProperty(a);
                    counter++;
                }
                a++;
            }
        } else {
            if (!properties.contains(firstProperty) && (!properties.contains(secondProperty)) && (!properties.contains(thirdProperty)) && (!properties.contains(fourthProperty)) && (!properties.contains(fifthProperty)) && (!properties.contains(sixthProperty)) && (!properties.contains(seventhProperty))) {
                System.out.println("The properties [" + firstProperty + ", " + secondProperty + ", " + thirdProperty + ", " + fourthProperty + ", " + fifthProperty + ", " + sixthProperty + ", " + seventhProperty + "] are wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(firstProperty))) {
                System.out.println("The property [" + firstProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(secondProperty))) {
                System.out.println("The property [" + secondProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(thirdProperty)) {
                System.out.println("The property [" + thirdProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(fourthProperty)) {
                System.out.println("The property [" + fourthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(fifthProperty)) {
                System.out.println("The property [" + fifthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(sixthProperty)) {
                System.out.println("The property [" + sixthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else {
                System.out.println("The property [" + seventhProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            }
        }
    }

    private static void print(long a, long b, String firstProperty, String secondProperty, String thirdProperty, String fourthProperty, String fifthProperty, String sixthProperty, String seventhProperty, String eightProperty) {
        String properties = "evenoddbuzzduckpalindromicgapfulspysunnysquarejumping";
        if (properties.contains(firstProperty) && properties.contains(secondProperty) && properties.contains(thirdProperty) && properties.contains(fourthProperty) && properties.contains(fifthProperty) && properties.contains(sixthProperty) && properties.contains(seventhProperty) && properties.contains(eightProperty)) {
            if (firstProperty.equals("even") && secondProperty.equals("odd") || firstProperty.equals("odd") && secondProperty.equals("even") || firstProperty.equals("spy") && secondProperty.equals("duck") || firstProperty.equals("duck") && secondProperty.equals("spy") || firstProperty.equals("sunny") && secondProperty.equals("square") ||firstProperty.equals("square") && secondProperty.equals("sunny"))  {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + secondProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && thirdProperty.equals("odd") || firstProperty.equals("odd") && thirdProperty.equals("even") || firstProperty.equals("spy") && thirdProperty.equals("duck") || firstProperty.equals("duck") && thirdProperty.equals("spy") || firstProperty.equals("sunny") && thirdProperty.equals("square") || firstProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && thirdProperty.equals("odd") || secondProperty.equals("odd") && thirdProperty.equals("even") || secondProperty.equals("spy") && thirdProperty.equals("duck") || secondProperty.equals("duck") && thirdProperty.equals("spy") || secondProperty.equals("sunny") && thirdProperty.equals("square") || secondProperty.equals("square") && thirdProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + secondProperty + " " + thirdProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && fourthProperty.equals("odd") || firstProperty.equals("odd") && fourthProperty.equals("even") || firstProperty.equals("spy") && fourthProperty.equals("duck") || firstProperty.equals("duck") && fourthProperty.equals("spy") || firstProperty.equals("sunny") && fourthProperty.equals("square") || firstProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && fourthProperty.equals("odd") || secondProperty.equals("odd") && fourthProperty.equals("even") || secondProperty.equals("spy") && fourthProperty.equals("duck") || secondProperty.equals("duck") && fourthProperty.equals("spy") || secondProperty.equals("sunny") && fourthProperty.equals("square") || secondProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + secondProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && fourthProperty.equals("odd") || thirdProperty.equals("odd") && fourthProperty.equals("even") || thirdProperty.equals("spy") && fourthProperty.equals("duck") || thirdProperty.equals("duck") && fourthProperty.equals("spy") || thirdProperty.equals("sunny") && fourthProperty.equals("square") || thirdProperty.equals("square") && fourthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + thirdProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && fifthProperty.equals("odd") || firstProperty.equals("odd") && fifthProperty.equals("even") || firstProperty.equals("spy") && fifthProperty.equals("duck") || firstProperty.equals("duck") && fifthProperty.equals("spy") || firstProperty.equals("sunny") && fifthProperty.equals("square") || firstProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && fifthProperty.equals("odd") || secondProperty.equals("odd") && fifthProperty.equals("even") || secondProperty.equals("spy") && fifthProperty.equals("duck") || secondProperty.equals("duck") && fifthProperty.equals("spy") || secondProperty.equals("sunny") && fifthProperty.equals("square") || secondProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && fifthProperty.equals("odd") || thirdProperty.equals("odd") && fifthProperty.equals("even") || thirdProperty.equals("spy") && fifthProperty.equals("duck") || thirdProperty.equals("duck") && fifthProperty.equals("spy") || thirdProperty.equals("sunny") && fifthProperty.equals("square") || thirdProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fourthProperty.equals("even") && fifthProperty.equals("odd") || fourthProperty.equals("odd") && fifthProperty.equals("even") || fourthProperty.equals("spy") && fifthProperty.equals("duck") || fourthProperty.equals("duck") && fifthProperty.equals("spy") || fourthProperty.equals("sunny") && fifthProperty.equals("square") || fourthProperty.equals("square") && fifthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && sixthProperty.equals("odd") || firstProperty.equals("odd") && sixthProperty.equals("even") || firstProperty.equals("spy") && sixthProperty.equals("duck") || firstProperty.equals("duck") && sixthProperty.equals("spy") || firstProperty.equals("sunny") && sixthProperty.equals("square") || firstProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && sixthProperty.equals("odd") || secondProperty.equals("odd") && sixthProperty.equals("even") || secondProperty.equals("spy") && sixthProperty.equals("duck") || secondProperty.equals("duck") && sixthProperty.equals("spy") || secondProperty.equals("sunny") && sixthProperty.equals("square") || secondProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && sixthProperty.equals("odd") || thirdProperty.equals("odd") && sixthProperty.equals("even") || thirdProperty.equals("spy") && sixthProperty.equals("duck") || thirdProperty.equals("duck") && sixthProperty.equals("spy") || thirdProperty.equals("sunny") && sixthProperty.equals("square") || thirdProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fourthProperty.equals("even") && sixthProperty.equals("odd") || fourthProperty.equals("odd") && sixthProperty.equals("even") || fourthProperty.equals("spy") && sixthProperty.equals("duck") || fourthProperty.equals("duck") && sixthProperty.equals("spy") || fourthProperty.equals("sunny") && sixthProperty.equals("square") || fourthProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fifthProperty.equals("even") && sixthProperty.equals("odd") || fifthProperty.equals("odd") && sixthProperty.equals("even") || fifthProperty.equals("spy") && sixthProperty.equals("duck") || fifthProperty.equals("duck") && sixthProperty.equals("spy") || fifthProperty.equals("sunny") && sixthProperty.equals("square") || fifthProperty.equals("square") && sixthProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && seventhProperty.equals("odd") || firstProperty.equals("odd") && seventhProperty.equals("even") || firstProperty.equals("spy") && seventhProperty.equals("duck") || firstProperty.equals("duck") && seventhProperty.equals("spy") || firstProperty.equals("sunny") && seventhProperty.equals("square") || firstProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && seventhProperty.equals("odd") || secondProperty.equals("odd") && seventhProperty.equals("even") || secondProperty.equals("spy") && seventhProperty.equals("duck") || secondProperty.equals("duck") && seventhProperty.equals("spy") || secondProperty.equals("sunny") && seventhProperty.equals("square") || secondProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && seventhProperty.equals("odd") || thirdProperty.equals("odd") && seventhProperty.equals("even") || thirdProperty.equals("spy") && seventhProperty.equals("duck") || thirdProperty.equals("duck") && seventhProperty.equals("spy") || thirdProperty.equals("sunny") && seventhProperty.equals("square") || thirdProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fourthProperty.equals("even") && seventhProperty.equals("odd") || fourthProperty.equals("odd") && seventhProperty.equals("even") || fourthProperty.equals("spy") && seventhProperty.equals("duck") || fourthProperty.equals("duck") && seventhProperty.equals("spy") || fourthProperty.equals("sunny") && seventhProperty.equals("square") || fourthProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fifthProperty.equals("even") && seventhProperty.equals("odd") || fifthProperty.equals("odd") && seventhProperty.equals("even") || fifthProperty.equals("spy") && seventhProperty.equals("duck") || fifthProperty.equals("duck") && seventhProperty.equals("spy") || fifthProperty.equals("sunny") && seventhProperty.equals("square") || fifthProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (sixthProperty.equals("even") && seventhProperty.equals("odd") || sixthProperty.equals("odd") && seventhProperty.equals("even") || sixthProperty.equals("spy") && seventhProperty.equals("duck") || sixthProperty.equals("duck") && seventhProperty.equals("spy") || sixthProperty.equals("sunny") && seventhProperty.equals("square") || sixthProperty.equals("square") && seventhProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (firstProperty.equals("even") && eightProperty.equals("odd") || firstProperty.equals("odd") && eightProperty.equals("even") || firstProperty.equals("spy") && eightProperty.equals("duck") || firstProperty.equals("duck") && eightProperty.equals("spy") || firstProperty.equals("sunny") && eightProperty.equals("square") || firstProperty.equals("square") && eightProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (secondProperty.equals("even") && eightProperty.equals("odd") || secondProperty.equals("odd") && eightProperty.equals("even") || secondProperty.equals("spy") && eightProperty.equals("duck") || secondProperty.equals("duck") && eightProperty.equals("spy") || secondProperty.equals("sunny") && eightProperty.equals("square") || secondProperty.equals("square") && eightProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (thirdProperty.equals("even") && eightProperty.equals("odd") || thirdProperty.equals("odd") && eightProperty.equals("even") || thirdProperty.equals("spy") && eightProperty.equals("duck") || thirdProperty.equals("duck") && eightProperty.equals("spy") || thirdProperty.equals("sunny") && eightProperty.equals("square") || thirdProperty.equals("square") && eightProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fourthProperty.equals("even") && eightProperty.equals("odd") || fourthProperty.equals("odd") && eightProperty.equals("even") || fourthProperty.equals("spy") && eightProperty.equals("duck") || fourthProperty.equals("duck") && eightProperty.equals("spy") || fourthProperty.equals("sunny") && eightProperty.equals("square") || fourthProperty.equals("square") && eightProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (fifthProperty.equals("even") && eightProperty.equals("odd") || fifthProperty.equals("odd") && eightProperty.equals("even") || fifthProperty.equals("spy") && eightProperty.equals("duck") || fifthProperty.equals("duck") && eightProperty.equals("spy") || fifthProperty.equals("sunny") && eightProperty.equals("square") || fifthProperty.equals("square") && eightProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (sixthProperty.equals("even") && eightProperty.equals("odd") || sixthProperty.equals("odd") && eightProperty.equals("even") || sixthProperty.equals("spy") && eightProperty.equals("duck") || sixthProperty.equals("duck") && eightProperty.equals("spy") || sixthProperty.equals("sunny") && eightProperty.equals("square") || sixthProperty.equals("square") && eightProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            } else if (seventhProperty.equals("even") && eightProperty.equals("odd") || seventhProperty.equals("odd") && eightProperty.equals("even") || seventhProperty.equals("spy") && eightProperty.equals("duck") || seventhProperty.equals("duck") && eightProperty.equals("spy") || seventhProperty.equals("sunny") && eightProperty.equals("square") || seventhProperty.equals("square") && eightProperty.equals("sunny")) {
                System.out.println("The request contains mutually exclusive properties: " + firstProperty + " " + fourthProperty);
                System.out.println("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, JUMPING, SQUARE, SUNNY]");
                return;
            }
            int counter = 0;
            while (counter < b) {
                if (propertyHas(a, firstProperty) && propertyHas(a, secondProperty) && propertyHas(a, thirdProperty) && propertyHas(a, fourthProperty) && propertyHas(a, fifthProperty) && propertyHas(a, sixthProperty) && propertyHas(a, seventhProperty) && propertyHas(a, eightProperty)) {
                    printProperty(a);
                    counter++;
                }
                a++;
            }
        } else {
            if (!properties.contains(firstProperty) && (!properties.contains(secondProperty)) && (!properties.contains(thirdProperty)) && (!properties.contains(fourthProperty)) && (!properties.contains(fifthProperty)) && (!properties.contains(sixthProperty)) && (!properties.contains(seventhProperty)) && (!properties.contains(eightProperty))) {
                System.out.println("The properties [" + firstProperty + ", " + secondProperty + ", " + thirdProperty + ", " + fourthProperty + ", " + fifthProperty + ", " + sixthProperty + ", " + seventhProperty + ", " + eightProperty + "] are wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(firstProperty))) {
                System.out.println("The property [" + firstProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if ((!properties.contains(secondProperty))) {
                System.out.println("The property [" + secondProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(thirdProperty)) {
                System.out.println("The property [" + thirdProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(fourthProperty)) {
                System.out.println("The property [" + fourthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(fifthProperty)) {
                System.out.println("The property [" + fifthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(sixthProperty)) {
                System.out.println("The property [" + sixthProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else if (!properties.contains(seventhProperty)) {
                System.out.println("The property [" + seventhProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
            } else {
                System.out.println("The property [" + eightProperty + "] is wrong." +
                        "\nAvailable properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]");
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
            case "jumping":
                if (isJumping(a)) {
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
        if (isJumping(a)) System.out.print(", jumping");
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

    public static void printJumping(long a, long b) {
        long counter = 0;
        while (counter < b) {
            if (isJumping(a)) {
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

    public static boolean isJumping(long a) {
        String[] digits = Long.toString(a).split("");
        for (int i = 0; i < digits.length - 1; i++) {
            long firstDigit = Long.parseLong(digits[i]);
            long secondDigit = Long.parseLong(digits[i + 1]);
            if (Math.abs(firstDigit - secondDigit) != 1) {
                return false;
            }
        }
        return true;
    }


}
