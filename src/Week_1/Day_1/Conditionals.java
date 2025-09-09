import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        //Activity5: If-Else
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number :)");
        int number = scanner.nextInt();

        if(number > 0) {
            System.out.println("It's positive");
        } else if (number < 0) {
            System.out.println("It's negative");
        } else {
            System.out.println("It's Zero");
        }

        //Activity6: If-Else If
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if(age < 12) {
            System.out.println("You're a kid");
        } else if (age <= 17) {
            System.out.println("You're a teenager");
        } else {
            System.out.println("You're an adult");
        }

        //Activity7: Switch
        System.out.println("Please enter a number to find out the corresponding day of the week: ");
        int nDay = scanner.nextInt();

        switch (nDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number. Must be between 1 and 7");
        }
    }
}
