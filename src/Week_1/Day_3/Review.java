package Week_1.Day_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Review {
    public static void main(String[] args) {

        //---------------------------------- for: Pyramid Pattern -----------------------------------
        System.out.println("--- Pyramid with for loop ---");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //---------------------------- while: Reverse of a number -----------------------------------
        System.out.println("\n--- Reversed number with while loop ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversed);
        if (original == reversed) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }

        //---------------------- do-while: Guessing game ----------------------------------
        System.out.println("\n--- Guess the number with do-while ---");
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Guess a number from 1 to 100.");
        do {
            System.out.print("Your guess: ");
            guess = sc.nextInt();
            if (guess == secret) {
                System.out.println("Correct!");
            } else if (Math.abs(secret - guess) <= 5) {
                System.out.println("Very close!");
            } else if (guess < secret) {
                System.out.println("Higher.");
            } else {
                System.out.println("Lower.");
            }
        } while (guess != secret);

        //--------------------------- for-each: Word frequency -----------------------------------------
        System.out.println("\n--- Word frequency with for-each ---");
        String[] words = {"hola", "Mundo", "hola", "java"};
        Map<String, Integer> count = new HashMap<>();

        for (String word : words) {
            String lowercase = word.toLowerCase();
            count.put(lowercase, count.getOrDefault(lowercase, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        sc.close();
    }
}