package homework2;

public class Unit4HW2 {

    public static void main(String[] args) {
        vowelCounter("The quick brown fox jumped over the lazy dog.");
        System.out.println();
        vowelCounter("aaeeeeiiiioouuuu");
        System.out.println();
       palindromeChecker("level");
       System.out.println();
       palindromeChecker("abcde");
       System.out.println();
       palindromeChecker("racecar");
       System.out.println();
       palindromeChecker("aBbA");
       System.out.println();
       //extra credit
       palindromeChecker("s*dfj*js");
       System.out.println();
       palindromeChecker("jf&fj");

    }

    public static void vowelCounter(String str) {
        int countA, countE, countI, countO, countU;
        countA = countE = countI = countO = countU = 0;
        char current;
        for (int i = 0; i < str.length(); i++) {
            current = str.toLowerCase().charAt(i);
            switch (current){
                case 'a': countA++;
                    break;
                case 'e': countE++;
                    break;
                case 'i': countI++;
                    break;
                case 'o': countO++;
                    break;
                case 'u': countU++;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("""
                Number of a's: %d
                Number of e's: %d
                Number of i's: %d
                Number of o's: %d
                Number of u's: %d
                """, countA, countE, countI, countO, countU);
    }

    public static void palindromeChecker(String str) {
        boolean palindrome = true;
        boolean valid = true;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {
                if (!(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(str.length() - (i+1)))) { 
                    palindrome = false;
                    break;
                } 
            } else {
                System.out.println("Error: Invalid character detected in " + str);
                valid = false;
                break;
            }
        }
        if (palindrome && valid){
            System.out.println(str + " is a palindrome.");
        } else if (!palindrome && valid){
            System.out.println(str + " is not a palindrome.");
        }
    }
}