package homework1;

import java.util.Scanner;

public class Unit4HW1 {

    public static void main(String[] args) {
        guessingGame();
        tiredTurtle();
        notATamagotchi();
        int bob = 5;
        System.out.println(bob);
        bob = 8;


    }

    /**
     * Picks a random number between 1 and 100 and asks the user
     * to guess it. For each guess, the program should tell the user whether
     * the guess is too high, too low, or correct.
     *
     */
    public static void guessingGame(){
        //feel free to use the Random class
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random()*100+1);
        int userNum = -1;

        System.out.println("See if you can guess the number between 1-100!");
        while (userNum != num) {
            System.out.print("Enter your guess: ");
            userNum = sc.nextInt();
            if (userNum > num) {
                System.out.println("Too high! Try Again.");
            } else if (userNum < num){
                System.out.println("Too low! Try Again.");
            }
        }
        System.out.println("Correct! You've guessed the right number!");

    }

    /**
     * Tired Turtle
     * Asks the user how many steps they want the turtle to take in its
     * first move. Then it calculates and displays how many total steps
     * the turtle took until it stopped.
     *
     */
    public static void tiredTurtle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many steps should the turtle take in it first turn? ");
        int firstSteps = sc.nextInt();
        int steps = firstSteps;

        while (firstSteps > 0) {
            firstSteps /= 2;
            steps += firstSteps;
        }
        System.out.println("Total steps by turtle: " + steps);
    }



    /**
     * Take care of a pet and make sure it does not die of starvation within
     * 5 hours. If you pass it will be content at the end of the simulation.
     */
    public static void notATamagotchi() {
        Scanner sc = new Scanner(System.in);
        int hour = 1;
        int hungerLevel = 0;
        boolean petDead = false;

        while (hour < 5) {
            hungerLevel += 10;
            if (hungerLevel < 40) {
                System.out.printf("\nHour: %d Current hunger level is %d Do you want to feed your pet? (yes/no): ", hour, hungerLevel);
            } else {
                System.out.printf("\nHour: %d Current hunger level is %d Feed your pet, it is unhappy. " +
                        "\nDo you want to feed your pet? (yes/no): ", hour, hungerLevel);
            }
            String feed = sc.nextLine();
            if (feed.equalsIgnoreCase("yes")) {
                if (hungerLevel <= 25) {
                    hungerLevel = 0;
                } else {
                    hungerLevel -= 25;
                }
            } else if (feed.equalsIgnoreCase("no") && hungerLevel >= 40) {
                System.out.print("End of Simulation. Your pet is dead.");
                petDead = true;
                break;
            }
            hour++;
        }
        hungerLevel += 10;
        if (hungerLevel >= 40 && !petDead) {
            System.out.printf("\nHour 5: Current hunger level is %d End of Simulation. Your pet is dead.", hungerLevel);
        } else if (!petDead) {
            System.out.printf("\nHour 5: Current hunger level is %d End of Simulation. Your pet is content.", hungerLevel);
        }
    }

}
