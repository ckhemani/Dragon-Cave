import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DragonCave {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("You are in a land of dragons, in front of you," + "\n\n"
                + "you see two caves. " + "In one cave, the dragon is friendly" + "\n\n"
                + "and will share the treasure with you. The other dragon" + "\n\n"
                + "is greedy and hungry and will eat you on sight.");

        System.out.println();
        int returnGetCaveID = getUserInputforCave();
        System.out.println(returnGetCaveID);
        returnResult(returnGetCaveID);
    }

    public static void returnResult(int getCaveID) {

        switch (getCaveID) {
            case 1:
                System.out.println("You Approach the Cave... " + getCaveID + "\n\n"
                        + "it is dark and spooky..." + "\n\n"
                        + "A large dragon jumps in front of you!. He opens his jaws and..." + "\n\n"
                        + "Gobbles you down in on bite!");
                break;
            case 2:
                System.out.println("You Approach the Cave... " + getCaveID + "\n\n"
                        + "The dragon is friendly" + "\n\n"
                        + "The dragon will share Treasure with you.");
                break;
            default:
                System.out.println("Don't dare to enter any cave." + "\n\n"
                        + "Save your life and runaway. " + "\n\n"
                        + "You can earn money by hardwork.");

        }
    }

    public static int getUserInputforCave() {
        System.out.println("\033[0;1m" + "Which cave will you go into? (1 or 2) " + "\033[0m");
        int caveId = input.nextInt();
        return caveId;
//        try {
//            return caveId;
//        } catch (Exception e) {
//            return 10000;
//        }
    }
}