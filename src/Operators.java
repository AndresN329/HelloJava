import java.util.Scanner;

public class Operators {
    public static void main (String[] args) {

        //Activity2: Arithmetic operators
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        float NumberA = scanner.nextFloat();
        System.out.println("Enter another number: ");
        float NumberB = scanner.nextFloat();

        //Operations
        float plus =  NumberA + NumberB;
        float minus = NumberA - NumberB;
        float multiplication = NumberA * NumberB;
        float division = NumberA / NumberB;
        float module = NumberA % NumberB;

        //Results
        System.out.println("Results");
        System.out.println("-------------------------");
        System.out.println("Plus result is: " + plus);
        System.out.println("Minus result is: " + minus);
        System.out.println("Multiplication result is: " + multiplication);
        System.out.println("Division result is: " + division);
        System.out.println("Module result is: " + module);
        System.out.println("-------------------------");

        //Activity3: Relational operators
        System.out.println("Are you an adult?");
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        boolean isOlder = age >= 18;
        System.out.println(isOlder);
        System.out.println("-------------------------");

        //Activity4: Logic operators
        System.out.println("Please enter a number: ");
        int N1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int N2 = scanner.nextInt();
        System.out.println("Are they positive?: " + (N1 > 0 && N2 > 0));
        System.out.println("At least one is greater than 100: " + (N1 > 100 || N2 > 100));
        System.out.println("The first is NOT equal to the second: " + (N1 != N2));

        scanner.close();
    }
}
