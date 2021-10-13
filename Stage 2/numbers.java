package numbers;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int naturalNumber = scanner.nextInt();
          
        if (naturalNumber < 1) {
            System.out.println("This number is not natural!"); 
        }

        System.out.println("Properties of " + naturalNumber);
        boolean even = naturalNumber % 2 == 0;
        boolean odd = naturalNumber % 2 != 0;
        boolean buzz = naturalNumber % 7 == 0 || naturalNumber % 10 == 7;
        boolean duck = false;
        String natNum = String.valueOf(naturalNumber);
        if (natNum.contains("0") && !natNum.startsWith("0")) {
            duck = true;
        }

        System.out.println("\t\teven: " + even);
        System.out.println("\t\todd: " + odd);
        System.out.println("\t\tbuzz: " + buzz);
        System.out.println("\t\tduck: " + duck);

    }
}
