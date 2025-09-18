package Week_1.Day_2;
import java.util.Scanner;
import java.util.Random;

public class Loops {
    public static void main(String[] args) {

        //-------------------------------------Exercise 1 -------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a integer number to calculate the factorial: ");
        int number = scanner.nextInt();

        // Factorial result
        int factorial = 1;

        // calculate the factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        // display results
        System.out.println(number + "! = " + factorial);
        System.out.println("-------------------------------------------------");

        //-------------------------------------Exercise 2 -------------------------------------------------------
        Random random = new Random();

        // A random numbr between 1 and 100
        int secretNumber = random.nextInt(100) + 1;

        int attempts = 10;
        boolean correct = false;

        System.out.println("Hello, Hello, let's play something :)");
        System.out.println("I have chosen a number between 1 and 100. You have " + attempts + " tries to guess it.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("\nattempt " + i + " enter your number: ");
            int numberAttmp = scanner.nextInt();

            if (numberAttmp == secretNumber) {
                System.out.println("\nCongratulations! You guessed the number in " + i + " attemtps.");
                correct = true;
                break;
            } else if (numberAttmp < secretNumber) {
                System.out.println("\nSecret number ir greater");
            } else {
                System.out.println("\nThe secret number is lower.");
            }

            System.out.println("\nYou have " + (attempts - i) + " attemtps left");
        }

        if (!correct) {
            System.out.println("No more attempts. The secret number was: " + secretNumber);
            System.out.println("-------------------------------------------------");
        }

        //-------------------------------------Exercise 3 -------------------------------------------------------
        System.out.println("-------------------------------------------------");
        System.out.println("You will be able to enter numbers until you enter 0.");
        System.out.println("Enter numbers to calculate average and sum.");
        int num;
        int suma = 0;
        int contador = 0;

        do {
            System.out.print("Enter a number (0 to stop): ");
            num = scanner.nextInt();

            if (num != 0) {
                suma += num;
                contador++;
            }

        } while (num != 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("Sum: " + suma);
            System.out.println("Average: " + media);
        } else {
            System.out.println("No numbers were entered.");
        }

        //-------------------------------------Exercise 4 -------------------------------------------------------
        System.out.println("\nCounting positives, negatives, and zeros");
        System.out.print("How many numbers are you going to enter?");
        int quantity = scanner.nextInt();

        int positives = 0, negatives = 0, zeros = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.print("Enter a number: ");
            int numb = scanner.nextInt();

            if (numb > 0) {
                positives++;
            } else if (numb < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }

        System.out.println("Greater than 0: " + positives);
        System.out.println("Less than 0: " + negatives);
        System.out.println("Equal to 0: " + zeros);

        //-------------------------------------Exercise 5 -------------------------------------------------------
            System.out.println("\nVowel or not");
            char character;

            do {
                System.out.print("Enter a character (dot(.) to exit): ");
                character = scanner.next().charAt(0); // read the first character

                if ("aeiouAEIOU".indexOf(character) != -1) {
                    System.out.println("VOWEL");
                } else {
                    System.out.println("NO VOWEL");
                }
            } while (character != '.');

        //-------------------------------------Exercise 6 -------------------------------------------------------

        System.out.println("\nEven numbers between two values");
        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        System.out.println("Even numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); //line break

        //-------------------------------------Exercise 7 -------------------------------------------------------

        System.out.println("\n--- Multiplication Table ---");
        System.out.print("Enter a number: ");
        int numMul = scanner.nextInt();

        System.out.println("Multiplication table of " + numMul + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numMul + " x " + i + " = " + (numMul * i));
        }

        //-------------------------------------Exercise 8 --------------------------------------------------------
        System.out.println("\n--- Interval Numbers ---");

        int lowerBound, upperBound;

        // Prompt for the interval's limits and validate that the lower bound is not greater than the upper bound.
        do {
            System.out.print("Enter the lower limit of the interval: ");
            lowerBound = scanner.nextInt();
            System.out.print("Enter the upper limit of the interval: ");
            upperBound = scanner.nextInt();

            if (lowerBound > upperBound) {
                System.out.println("Error: The lower limit cannot be greater than the upper limit. Please try again.");
            }
        } while (lowerBound > upperBound);

        int numbr;
        int sumInsideInterval = 0;
        int countOutsideInterval = 0;
        boolean hasNumberOnBoundary = false;

        System.out.println("Enter numbers. To finish, enter 0.");

        // Loop to process numbers entered by the user.
        do {
            System.out.print("Enter a number: ");
            numbr = scanner.nextInt();

            if (numbr != 0) {
                // Check if the numbr is inside the open interval.
                if (numbr > lowerBound && numbr < upperBound) {
                    sumInsideInterval += numbr;
                } else {
                    // If it's not inside, count the ones that are outside.
                    countOutsideInterval++;
                }

                // Check if the numbr is equal to either of the limits.
                if (numbr == lowerBound || numbr == upperBound) {
                    hasNumberOnBoundary = true;
                }
            }
        } while (numbr != 0);

        // Display the final results.
        System.out.println("\n--- Results ---");
        System.out.println("The sum of the numbers inside the interval is: " + sumInsideInterval);
        System.out.println("The count of numbers outside the interval is: " + countOutsideInterval);

        if (hasNumberOnBoundary) {
            System.out.println("At least one number equal to the interval's boundaries was entered.");
        } else {
            System.out.println("No numbers equal to the interval's boundaries were entered.");
        }


        //-------------------------------------Exercise 9 --------------------------------------------------------

        // Request data
        System.out.print("Enter the base (real): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent (positive integer): ");
        int exponent = scanner.nextInt();

        double result = 1;

        // Calculate a power by multiplying
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + " to the power of " + exponent + " = " + result);

        //-------------------------------------Exercise 10 --------------------------------------------------------

        // Tables from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Table del " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // Blank line to separate tables
        }
    }

}