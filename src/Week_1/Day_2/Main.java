import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //Arrays
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 2;
        numbers[2] = 7;
        numbers[3] = 10;
        numbers[4] = 4;

        //print first and last position
        System.out.println("Fist position: " + numbers[0]);
        System.out.println("Last position: " + numbers[4]);

        //Change and print second position
        numbers[1] = 9;
        System.out.println("Second position now is: " + numbers[1]);
        System.out.println("-------------------------------------");

        //ArrayList
        ArrayList<String> backpack = new ArrayList<>();

        //Add content to array
        backpack.add("laptop");
        backpack.add("internet");
        backpack.add("water");

        //Display the second position
        System.out.println("Second position in backpack is " + backpack.get(1));
        //Remove an object and display the backpack
        backpack.remove(2);
        System.out.println("The items in the backpack are: " + backpack);
        System.out.println("-------------------------------------");

        //Hashmap
        HashMap<String, Integer> treasures = new HashMap<>();

        //Add treasures
        treasures.put("Gold", 100);
        treasures.put("Silver", 50);
        treasures.put("Diamonds", 5);

        //Display Diamonds
        System.out.println("There are " + treasures.get("Diamonds") + " diamonds");

        //Update gold value and display treasures
        treasures.put("Gold", 200);
        System.out.println("The treasures are: " + treasures);
        System.out.println("-------------------------------------");

        //Final challenge
        int[] secretsN = new int[3];
        secretsN[0] = 123;
        secretsN[1] = 347;
        secretsN[2] = 876;

        ArrayList<String> explorers = new ArrayList<>();
        explorers.add("Santiago");
        explorers.add("Julio");
        explorers.add("Cesar");

        HashMap<String, Integer> amount = new HashMap<>();
        amount.put(explorers.get(0), secretsN[1]);
        amount.put(explorers.get(1),secretsN[2]);
        amount.put(explorers.get(2), secretsN[0]);

        System.out.println("Who has more gold? " + amount);
    }
}