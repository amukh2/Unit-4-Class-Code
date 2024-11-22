package homework3;

import java.util.Scanner;

public class Unit4HW3 {
    public static void main(String []args){
        String secretWord = "ARBOR";
        System.out.println("------- WOODLE-------- ");
        Woodle(secretWord);

    }

    public static void Woodle(String answer){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a 5 letter word:");
        String input = sc.nextLine();
        int green = 0;
        int yellow = 0;
        int index = 0;
       while (!(input.toUpperCase().equals(answer))) {
           String tempAnswer = answer;
           for (int i = 0; i < 5; i++) {
               if (input.substring(i,i+1).toUpperCase().equals(answer.substring(i,i+1))) {
                   green +=1;
                   tempAnswer = answer.substring(0,i) + (answer.substring(i+1,5));
               } else if (tempAnswer.indexOf(input.substring(i,i+1).toUpperCase()) != -1) {
                    yellow +=1;
               }
           }
           System.out.println(green + " in correct position");
           System.out.println(yellow + " correct letters (incorrect position)");
           index +=1;
           green = 0;
           yellow = 0;
           System.out.println("Guess a 5 letter word:");
           input = sc.nextLine();
       }
       index+=1;
        System.out.printf("Congratulations. It took you %s tries", index);
    }
}