import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello brave hero!");
        System.out.println("Welcome into the journey 'Magic Forest'!");
        System.out.println("Before we begin, do you want to know your state indicators? Type 1 for 'yes' or 2 for 'no'");
        Scanner denScanner = new Scanner(System.in);

        int health = 40;
        int luck = 20;

        int statsChoice = denScanner.nextInt();
        if (statsChoice == 1) {
            System.out.println("Your health is: " + health);
            System.out.println("Your luck is: " + luck);
        } else if (statsChoice == 2) {
            System.out.println("It's your choice. Let's keep the mystery:)");
        } else {
            System.out.println("Hmm.. Looks like you are not very attentive. Ok, never mind, let's continue");
        }

        System.out.println("You were walking along a magical path and came across a crossroads: 1 - go left, 2 - go right. Make a choice!");
        int roadChoice = denScanner.nextInt();
        switch (roadChoice) {
            case 1 -> {
                health -= 20;
                System.out.println("You walk along an old path and lose 20 health points");
                        }
            case 2 -> {
                luck += 30;
                System.out.println("You found treasure and got 30 luck points");
            }
            default -> {
                health -= 10;
                System.out.println("You get lost and lose 10 health points");
            }
        }

        System.out.println("You walk further and come across a well: 1 - drink, 2 - ignore well. Make a choice!");
        int wellChoice = denScanner.nextInt();
        switch (wellChoice) {
            case 1:
                health += 50;
                System.out.println("You drink magic water and gain 50 health points");
                break;
            case 2:
                luck -= 10;
                System.out.println("You ignore the well, but get tired and lose 10 luck points");
                break;
            default:
                System.out.println("Nothing changes");
        }


        System.out.println("You walk further and you encounter a magical creature. But you can't do anything because the outcome of this encounter is random:)");
        Random rand = new Random();
        int creatureType = rand.nextInt(3);
        switch (creatureType) {
            case 0 -> {
                health += 20;
                System.out.println("The creature is friendly and shares food. You gain 20 health points.");
            }
            case 1 -> {
                health -= 30;
                System.out.println("The creature is hostile and attacks! You lose 30 health points.");
            }
            case 2 -> {
                System.out.println("The creature is indifferent. Nothing happens.");
            }
        }


        System.out.println("You finished your journey. Let's check the results!");
        System.out.println("At the end of journey your Health is: " + health + " and your Luck is: " + luck);

        if (health <= 0 || luck <= 0) {
                System.out.println("You couldn't get through the forest... Try again!");
            }
            else {
                System.out.println("Congratulations! You were able to get through the magic forest!");
            }


//
//        System.out.println("You finished your journey. Do you want to see the results? Type 1 for 'yes' or 2 for 'no'");
//        int choice4 = denScanner.nextInt();
//        if (choice4 == 1) {
//            System.out.println("At the end of journey your Health is: " + health + " and your Luck is: " + luck);
//            if (health <= 0 || luck <= 0) {
//                System.out.println("You couldn't get through the forest... Try again!");
//            }
//            else {
//                System.out.println("Congratulations! You were able to get through the magic forest!");
//            }
//        } else if (choice4 == 2) {
//            System.out.println("So why did you play? I'll show you results anyway.");
//            System.out.println("At the end of journey your Health is: " + health + " and your Luck is: " + luck);
//            if (health <= 0 || luck <= 0) {
//                System.out.println("You couldn't get through the forest... Try again!");
//            }
//            else {
//                System.out.println("Congratulations! You were able to get through the magic forest!");
//            }
//        } else {
//            System.out.println("Really? Not attentive again? I'll show you results anyway.");
//            System.out.println("At the end of journey your Health is: " + health + " and your Luck is: " + luck);
//            if (health <= 0 || luck <= 0) {
//                System.out.println("You couldn't get through the forest... Try again!");
//            }
//            else {
//                System.out.println("Congratulations! You were able to get through the magic forest!");
//            }
//        }

        System.out.println("Thanks for playing!");
        System.out.println("Stay tune for next releases!");

        denScanner.close();

    }

}
