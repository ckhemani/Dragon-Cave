import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You are in a land of dragons, in front of you," + "\n\n"
                + "you see two caves. " + "In one cave, the dragon is friendly" + "\n\n"
                + "and will share the treasure with you. The other dragon" + "\n\n"
                + "is greedy and hungry and will eat you on sight.");

        System.out.println();
        System.out.println("\033[0;1m" +  "Which cave will you go into? (1 or 2) " + "\033[0m");
        int caveId = input.nextInt();
            switch (caveId) {
                case 1:
                    System.out.println("You Approach the Cave... " + caveId + "\n\n"
                    + "it is dark and spooky..." + "\n\n"
                    + "A large dragon jumps in front of you!. He opens his jaws and..." + "\n\n"
                    + "Gobbles you down in on bite!");
                    break;
                case 2:
                    System.out.println("You Approach the Cave... " + caveId + "\n\n"
                    + "The dragon is friendly" + "\n\n"
                    + "The dragon will share Treasure with you.");
                    break;
                default:
                    System.out.println("Don't dare to enter any cave." + "\n\n"
                            + "Save your life and runaway. " + "\n\n"
                            + "You can earn money by hardwork.");

            }
    }
}
