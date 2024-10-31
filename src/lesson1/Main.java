package lesson1;
import java.util.Scanner;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        guessMyNumber();

    }

    public static void guessMyNumber(){
        int secretNumber = (int) Math.round(Math.random() * 10);
        int num = -1;
        Scanner sc = new Scanner(System.in);


        System.out.println("See if you can guess the number!");
        System.out.println("Enter your guess: ");
        num = sc.nextInt();
        while (num != secretNumber){
            System.out.println("Try Again!");
            System.out.print("Enter your guess: ");
            num = sc.nextInt();
        }
        System.out.println("Correct!");

    }
}
