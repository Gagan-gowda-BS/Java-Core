import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Map<Integer, Integer> snakes = new HashMap<>();
        Map<Integer, Integer> ladders = new HashMap<>();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Define snakes
        snakes.put(99, 78);
        snakes.put(95, 75);
        snakes.put(92, 88);
        snakes.put(89, 68);
        snakes.put(74, 53);
        snakes.put(62, 19);
        snakes.put(49, 11);

        // Define ladders
        ladders.put(2, 38);
        ladders.put(7, 14);
        ladders.put(8, 31);
        ladders.put(15, 26);
        ladders.put(21, 42);
        ladders.put(28, 84);
        ladders.put(36, 44);
        ladders.put(51, 67);
        ladders.put(71, 91);
        ladders.put(78, 98);
        ladders.put(87, 94);

        int position = 0;

        System.out.println("🎲 Welcome to Snake and Ladder!");
        System.out.println("Press Enter to roll the dice...");

        while (position < 100) {
            scanner.nextLine(); // wait for user input
            int dice = rand.nextInt(6) + 1;
            System.out.println("You rolled a " + dice);

            int newPosition = position + dice;
            if (newPosition > 100) {
                System.out.println("You need exact roll to reach 100. Try again.");
            } else {
                position = newPosition;

                if (snakes.containsKey(position)) {
                    System.out.println("🐍 Oh no! Bitten by a snake at " + position);
                    position = snakes.get(position);
                } else if (ladders.containsKey(position)) {
                    System.out.println("🪜 Great! Climbed a ladder at " + position);
                    position = ladders.get(position);
                }

                System.out.println("📍 Current Position: " + position);
            }

            if (position == 100) {
                System.out.println("🎉 Congratulations! You reached 100 and won the game!");
                break;
            }

            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}
    


